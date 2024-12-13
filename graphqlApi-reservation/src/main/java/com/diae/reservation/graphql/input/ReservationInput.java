package com.diae.reservation.graphql.input;

import com.diae.reservation.core.entities.enums.StatusReservation;
import lombok.Data;

@Data
public class ReservationInput {
    private String clientId;
    private String chambreId;
    private String dateDebut;
    private String dateFin;
    private StatusReservation status;
    private Integer nombrePersonnes;
}