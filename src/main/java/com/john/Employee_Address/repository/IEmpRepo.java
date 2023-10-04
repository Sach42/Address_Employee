package com.john.Employee_Address.repository;

import com.john.Employee_Address.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmpRepo extends JpaRepository<Employee,Long> {
}
