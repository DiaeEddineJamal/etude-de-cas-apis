package com.diae.reservation.graphql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.diae.reservation.core", "com.diae.reservation.graphql"})
public class ReservationGraphqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReservationGraphqlApplication.class, args);
    }
}