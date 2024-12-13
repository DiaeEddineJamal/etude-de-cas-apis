package com.diae.reservation.grpc;

import com.diae.reservation.grpc.server.GrpcServer;
import com.diae.reservation.grpc.services.GrpcChambreServiceImpl;
import com.diae.reservation.grpc.services.GrpcClientServiceImpl;
import com.diae.reservation.grpc.services.GrpcReservationServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.diae.reservation.core", "com.diae.reservation.grpc"})
public class ReservationGrpcApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(ReservationGrpcApplication.class, args);
        Thread.currentThread().join();

        GrpcServer server = new GrpcServer(
                new GrpcClientServiceImpl(),
                new GrpcReservationServiceImpl(),
                new GrpcChambreServiceImpl()
        );
        server.start();
        Thread.currentThread().join();
    }
}
