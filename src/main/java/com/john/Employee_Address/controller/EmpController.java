package com.john.Employee_Address.controller;

import com.john.Employee_Address.model.Employee;
import com.john.Employee_Address.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmpController {
    @Autowired
    EmpService empService;

    @PostMapping("employee")
    public  String addEmp(Employee employee)
    {
        return empService.addEmp(employee);
    }

    @GetMapping("employee")
    public List<Employee> getEmp(){
        return empService.getEmp();
    }
}
