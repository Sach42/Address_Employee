package com.john.Employee_Address.service;

import com.john.Employee_Address.model.Address;
import com.john.Employee_Address.repository.IAdrRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdrService {

    @Autowired
    IAdrRepo adrRepo;

    public String addAdrrs(Address address) {
        adrRepo.save(address);
        return "Apka Pata jud chuka hun!!!!!!";
    }

    public List<Address> getAddress() {
        return (List<Address>) adrRepo.findAll();
    }
}
