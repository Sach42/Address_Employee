package com.john.Employee_Address.controller;

import com.john.Employee_Address.model.Address;
import com.john.Employee_Address.service.AdrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AdrController {

    @Autowired
    AdrService adrService;

    @PostMapping("address")
    public  String addAdrrs(Address address){
        return  adrService.addAdrrs(address);
    }

    @GetMapping("address")
    public List<Address> getAddress(){
        return  adrService.getAddress();
    }
}
