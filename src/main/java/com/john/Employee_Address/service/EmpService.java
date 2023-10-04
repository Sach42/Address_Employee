package com.john.Employee_Address.service;

import com.john.Employee_Address.model.Employee;
import com.john.Employee_Address.repository.IEmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpService {

    @Autowired
    IEmpRepo empRepo;

    public String addEmp(Employee employee) {
        empRepo.save(employee);
        return "emp added";
    }

    public List<Employee> getEmp() {
        return (List<Employee>) empRepo.findAll();
    }
}
