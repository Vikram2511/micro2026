package com.user.user_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/emp")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;
    @PostMapping
    public Employee saveEmp(@RequestBody Employee emp){
        return employeeRepository.save(emp);

    }
}
