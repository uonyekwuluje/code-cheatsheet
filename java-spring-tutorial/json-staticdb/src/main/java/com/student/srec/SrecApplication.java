package com.student.srec;

import java.util.ArrayList;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SrecApplication {

    public static void main(String[] args) {
	SpringApplication.run(SrecApplication.class, args);
    }

    @GetMapping("/hello") //annotate
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
       return String.format("Hello %s!", name);
    }


    @GetMapping("/get")
    public ArrayList<Studentapi> getStudent() {
       ArrayList<Studentapi> arr = new ArrayList<>();
   
       Studentapi student1 = new Studentapi(1, "Natasha", "Romanov");
       Studentapi student2 = new Studentapi(2, "Tony", "Stark");
       Studentapi student3 = new Studentapi(3, "Thomas", "Holdenton");
       Studentapi student4 = new Studentapi(4, "Christoper", "Rafallo");
       Studentapi student5 = new Studentapi(5, "Edward", "Florton");
       Studentapi student6 = new Studentapi(6, "Chris", "Helmsworth");
       Studentapi student7 = new Studentapi(7, "Benedict", "Cumberbatch");

       arr.add(student1);
       arr.add(student2);
       arr.add(student3);
       arr.add(student4);
       arr.add(student5);
       arr.add(student6);
       arr.add(student7);

       return arr;
    }

}
