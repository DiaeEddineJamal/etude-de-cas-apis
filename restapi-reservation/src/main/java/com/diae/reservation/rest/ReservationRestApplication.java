package com.diae.reservation.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.diae.reservation.core", "com.diae.reservation.rest"})
public class ReservationRestApplication {
    public static void main(String[] args) {
        SpringApplication.run(ReservationRestApplication.class, args);
    }
}
