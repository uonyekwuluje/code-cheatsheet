package com.inventory.prdt.controller;

import com.inventory.prdt.model.ProductModel;
import com.inventory.prdt.repository.ProductRepository;
import com.inventory.prdt.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;
import javax.validation.Valid;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class ProductController {
    @Autowired
    ProductRepository productRepo;

    @GetMapping("/products")
    public List<ProductModel> getAllProduct(){
        return productRepo.findAll();
    }

    @GetMapping("/product/{id}")
    public ResponseEntity<ProductModel> getProductById(@PathVariable(value = "id") Long productId)
	throws ResourceNotFoundException  {
        ProductModel productModel = productRepo.findById(productId)
	    .orElseThrow(() -> new ResourceNotFoundException("Product not found for this id :: " + productId));
        return ResponseEntity.ok().body(productModel);
    }

    @PostMapping("/product")
    public ProductModel addProduct(@Valid @RequestBody ProductModel productModel){
        return productRepo.save(productModel);
    }

    @PutMapping("/product/{id}")
    public ResponseEntity<ProductModel> updateProduct(@PathVariable(value = "id") Long productId,
	@Valid @RequestBody ProductModel productDetails) throws ResourceNotFoundException {
	ProductModel productModel = productRepo.findById(productId)
			.orElseThrow(() -> new ResourceNotFoundException("Product not found for this id :: " + productId));
	productModel.setProductName(productDetails.getProductName());
	productModel.setProductDescription(productDetails.getProductDescription());
	productModel.setProductQuantity(productDetails.getProductQuantity());
	final ProductModel updatedProduct = productRepo.save(productModel);
	return ResponseEntity.ok(updatedProduct);
    }

    @DeleteMapping("/product/{id}")
    public Map<String, Boolean> deleteProduct(@PathVariable(value = "id") Long productId)
		throws ResourceNotFoundException {
	ProductModel productModel = productRepo.findById(productId)
			.orElseThrow(() -> new ResourceNotFoundException("Product not found for this id :: " + productId));
	productRepo.delete(productModel);
	Map<String, Boolean> response = new HashMap<>();
	response.put("deleted", Boolean.TRUE);
	return response;
    }
}
