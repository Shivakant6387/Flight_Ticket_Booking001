package com.example.Springboot_flight_service_001.service;

import com.example.Springboot_flight_service_001.dto.FlightBookingAcknowledgement;
import com.example.Springboot_flight_service_001.dto.FlightBookingRequest;
import com.example.Springboot_flight_service_001.entity.PassengerInfo;
import com.example.Springboot_flight_service_001.entity.PaymentInfo;
import com.example.Springboot_flight_service_001.repository.PassengerInfoRepository;
import com.example.Springboot_flight_service_001.repository.PaymentInfoRepository;
import com.example.Springboot_flight_service_001.utils.PaymentUtils;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;

import java.util.UUID;

@Service
public class FlightBookingService {
    @Autowired
    private PassengerInfoRepository passengerInfoRepository;
    @Autowired
    private PaymentInfoRepository paymentInfoRepository;
    @Transactional//(readOnly=false,isolation= Isolation.READ_COMMITTED,propagation= Propagation.REQUIRED)
    public FlightBookingAcknowledgement bookingFlightTicket(FlightBookingRequest request) throws Exception {
       // FlightBookingAcknowledgement acknowledgement=null;
        PassengerInfo passengerInfo=request.getPassengerInfo();
        passengerInfo=passengerInfoRepository.save(passengerInfo);

        PaymentInfo paymentInfo=request.getPaymentInfo();
        PaymentUtils.validateCreditLimit(paymentInfo.getAccountNo(),passengerInfo.getFare());
        paymentInfo.setPassengerId(passengerInfo.getPId());
        paymentInfo.setAmount(passengerInfo.getFare());
        paymentInfoRepository.save(paymentInfo);
        return new FlightBookingAcknowledgement("SUCCESS",passengerInfo.getFare(), UUID.randomUUID().toString().split("-")[0],passengerInfo);
    }

}
