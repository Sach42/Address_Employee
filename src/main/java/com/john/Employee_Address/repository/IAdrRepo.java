package com.john.Employee_Address.repository;

import com.john.Employee_Address.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAdrRepo extends JpaRepository<Address,Long> {
}
