package com.example.Springboot_flight_service_001.dto;

import com.example.Springboot_flight_service_001.entity.PassengerInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightBookingAcknowledgement {
    private String  status;
    private double totalFare;
    private String pnrNo;
    private PassengerInfo passengerInfo;

}
