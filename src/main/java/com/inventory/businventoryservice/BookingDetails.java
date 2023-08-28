package com.inventory.businventoryservice;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class BookingDetails {

    private String paymentid;

    private String bookingid;

    private String bookingtype;

    private Double amount;

    private String userid;

    private String description;

    private String inventoryid;

    private String paymentId;

    private String status;

    private String reason;

    private Integer numberofseats;
}
