package com.example.lab15.controllers;


import com.example.lab15.entity.Customer;
import com.example.lab15.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/customers")

public class CustomerController {

    @Autowired
    private CustomerRepository customers;


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addOne(@RequestBody  Customer customer) {
        customers.save(customer);
    }

    @GetMapping
    public Iterable<Customer> getAllCustomers() {
        return customers.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Customer> getCustomerById(@PathVariable Long id) {
        return customers.findById(id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.GONE)
    public void removeOne(@PathVariable Long id) {
        customers.deleteById(id);
    }

    @GetMapping(params = "lastName")
    public void removeByLastName(@RequestParam String lastName) {
        customers.findByLastName(lastName);
    }
}
