package com.example.lab15.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table

public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String lastName;
    private String adress;

    public Customer(String name, String lastName, String adress) {
        this.name = name;
        this.lastName = lastName;
        this.adress = adress;
    }


    @Override
    public String toString() {
        return name + " " +
                lastName + ", adress: " +
                adress;
    }
}
