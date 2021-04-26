package com.example.lab15.repository;

import com.example.lab15.entity.Trip;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TripRepository extends CrudRepository<Trip, Long> {

    Iterable<Trip> getByName(String name);
}
