package com.example.demo.Mycntroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class Controller {
    List<emplo> employees = new ArrayList<>();

    @GetMapping("/chacha")
    public List<emplo> getAllEmployees() {   //show the data
        return employees;
    }

    @PostMapping("/add")
    public String CreateEmplo(@RequestBody emplo newEmployee) {  // crate the data
        employees.add(newEmployee);
        return "Employee added successfully";
    }
}
