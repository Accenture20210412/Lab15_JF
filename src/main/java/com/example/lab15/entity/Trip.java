package com.example.lab15.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table

public class Trip {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String uniqueName;
    private LocalDate startOfTrip;
    private LocalDate endOfTrip;
    private String destination;
    private BigDecimal price;


    @Override
    public String toString() {
        return "Trip to: " + destination +
                ", date: " + startOfTrip +
                " - " + endOfTrip +
                ", cost: " + this.getPrice() +
                "$";
    }
}