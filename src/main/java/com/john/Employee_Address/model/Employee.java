package com.john.Employee_Address.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long EmpId;
    private  String EmpFirstName;
    private  String EmpLastName;

    @OneToOne
    @JoinColumn(name = "fk_addressId")
    Address address;
}
