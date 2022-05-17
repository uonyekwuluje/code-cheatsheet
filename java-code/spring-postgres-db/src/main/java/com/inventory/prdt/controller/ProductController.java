package com.inventory.prdt.controller;

import com.inventory.prdt.model.ProductModel;
import com.inventory.prdt.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class ProductController {
    @Autowired
    ProductRepository productRepo;

    @RequestMapping("/items")
    @ResponseBody
    public ResponseEntity<List<ProductModel>> getAllProductModels(){
        List<ProductModel> items =  productRepo.findAll();
        return new ResponseEntity<List<ProductModel>>(items, HttpStatus.OK);
    }

    @GetMapping("/item/{itemId}")
    @ResponseBody
    public ResponseEntity<ProductModel> getProductModel(@PathVariable Long itemId){
        Optional<ProductModel> item = productRepo.findById(itemId);
        return new ResponseEntity<ProductModel>(item.get(), HttpStatus.OK);
    }

    @PostMapping(value = "/add",consumes = {"application/json"},produces = {"application/json"})
    @ResponseBody
    public ResponseEntity<ProductModel> addProductModel(@RequestBody ProductModel item, UriComponentsBuilder builder){
        productRepo.save(item);
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(builder.path("/addProductModel/{id}").buildAndExpand(item.getId()).toUri());
        return new ResponseEntity<ProductModel>(headers, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    @ResponseBody
    public ResponseEntity<ProductModel> updateProductModel(@RequestBody ProductModel item){
        if(item != null){
            productRepo.save(item);
        }
        return new ResponseEntity<ProductModel>(item, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseBody
    public ResponseEntity<Void> deleteProductModel(@PathVariable Long id){
        Optional<ProductModel> item = productRepo.findById(id);
        productRepo.delete(item.get());
        return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
    }
}
