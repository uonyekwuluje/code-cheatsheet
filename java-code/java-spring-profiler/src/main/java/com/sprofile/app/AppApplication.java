package com.sprofile.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.node.ObjectNode;





@Component
@RestController
@SpringBootApplication
public class AppApplication {

       public static void main(String[] args) {
   	   SpringApplication.run(AppApplication.class, args);
       }

       @GetMapping("/hello")
       public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
            return String.format("Hello %s!", name);
       }
       @Value("${message}")
       String message;

       @Value("${version}")
       String retversion;

       @GetMapping("/info")
       public String info() {
    	   String jsonVersion = "{\"message\":\"+message+\",\"version\":\"+retversion+\"}";
           ObjectMapper mapper = new ObjectMapper();
           // create a JSON object
           ObjectNode JSONObject = mapper.createObjectNode();
           JSONObject.put("message", message);
           JSONObject.put("version", retversion);
           try {
              String JSONString = mapper.writeValueAsString(JSONObject);
               return JSONString;
           } catch(Exception e) {
               return ("Error "+e);
           }

       }
  

}
