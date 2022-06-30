package com.postgres.ops.controller;

import com.postgres.ops.model.Students;
import com.postgres.ops.repository.StudentRepository;

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
public class StudentController {
    @Autowired
    StudentRepository studentRepo;

    /* List students in database */
    @RequestMapping("/list")
    @ResponseBody
    public ResponseEntity<List<Students>> getAllItems(){
        List<Students> students = studentRepo.findAll();
        return new ResponseEntity<List<Students>>(students, HttpStatus.OK);
    }

    /* List. Get specific student */
    @GetMapping("/list/{studentId}")
    @ResponseBody
    public ResponseEntity<Students> getItem(@PathVariable Long studentId){
        Optional<Students> student = studentRepo.findById(studentId);
        return new ResponseEntity<Students>(student.get(), HttpStatus.OK);
    }

    /* Update a given students record */
    @PutMapping("/update")
    @ResponseBody
    public ResponseEntity<Students> updateItem(@RequestBody Students student){
        if(student != null){
            studentRepo.save(student);
        }
        return new ResponseEntity<Students>(student, HttpStatus.OK);
    }

    /* Add new student to database */ 
    @PostMapping(value = "/add",
                 consumes = {"application/json"},
                 produces = {"application/json"})
    @ResponseBody
    public ResponseEntity<Students> addItem(@RequestBody Students student, UriComponentsBuilder builder){
        studentRepo.save(student);
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(builder.path("/addItem/{id}").buildAndExpand(student.getId()).toUri());
        return new ResponseEntity<Students>(headers, HttpStatus.CREATED);
    }

    /* Delete student from database */ 
    @DeleteMapping("/delete/{id}")
    @ResponseBody
    public ResponseEntity<Void> deleteItem(@PathVariable Long id){
        Optional<Students> student = studentRepo.findById(id);
        studentRepo.delete(student.get());
        return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
    }

}
