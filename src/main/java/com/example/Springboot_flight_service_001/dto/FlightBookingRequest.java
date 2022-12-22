package com.example.Springboot_flight_service_001.dto;

import com.example.Springboot_flight_service_001.entity.PassengerInfo;
import com.example.Springboot_flight_service_001.entity.PaymentInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightBookingRequest {
    private PassengerInfo passengerInfo;
    private PaymentInfo paymentInfo;
}
