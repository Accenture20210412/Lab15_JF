package com.example.lab15.controllers;


import com.example.lab15.entity.Customer;
import com.example.lab15.entity.Trip;
import com.example.lab15.repository.TripRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/trips")
public class TripController {

    @Autowired
    private TripRepository tripRepository;


    @GetMapping
    public Iterable<Trip> display() {
        return tripRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addTrip(@RequestBody Trip trip) {
        tripRepository.save(trip);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.GONE)
    public void removeTrip(@PathVariable Long id) {
        tripRepository.deleteById(id);
    }

    @GetMapping(params = "uniqueName")
    public Iterable<Trip> findByName(@RequestParam(name = "uniqueName") String uniqueName) {
        return tripRepository.getByName(uniqueName);
    }
}
