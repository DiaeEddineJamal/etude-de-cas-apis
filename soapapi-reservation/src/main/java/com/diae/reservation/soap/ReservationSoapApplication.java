package com.diae.reservation.soap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.diae.reservation.core", "com.diae.reservation.soap"})
public class ReservationSoapApplication {
    public static void main(String[] args) {
        SpringApplication.run(ReservationSoapApplication.class, args);
    }
}
