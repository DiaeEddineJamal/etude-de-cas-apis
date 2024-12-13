package com.diae.reservation.rest.services;

import com.diae.reservation.core.dtos.ReservationDTO;

import java.util.List;

public interface RestReservationService {
    List<ReservationDTO> getAllReservations();

    ReservationDTO getReservationById(Long id);

    ReservationDTO createReservation(ReservationDTO reservationDTO);

    ReservationDTO updateReservation(Long id, ReservationDTO reservationDTO);

    void deleteReservation(Long id);
}
