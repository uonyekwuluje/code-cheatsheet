package com.crudapp.ops;

import com.crudapp.ops.model.Studrec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.io.IOException;
import org.codehaus.jackson.map.ObjectMapper;


@RestController
@SpringBootApplication
public class OpsApplication {

    public static void main(String[] args) {
	SpringApplication.run(OpsApplication.class, args);
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

    @GetMapping("/baseuser")
    public String baseu(
        @RequestParam String userid,
        @RequestParam String firstName,
        @RequestParam String lastName) throws IOException {
            // Create student object 
            Studrec student = new Studrec(userid,firstName,lastName);

            // Creating Object of ObjectMapper define in Jakson Api
            ObjectMapper Obj = new ObjectMapper();

            // get Student object as a json string
            //String jsonStr = Obj.writeValueAsString(student.toString());
            String jsonStr = Obj.writeValueAsString(student);
            return jsonStr;
        }



}
