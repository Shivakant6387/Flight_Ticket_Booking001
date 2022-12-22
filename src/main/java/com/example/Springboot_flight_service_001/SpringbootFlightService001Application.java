package com.example.Springboot_flight_service_001;

import com.example.Springboot_flight_service_001.dto.FlightBookingAcknowledgement;
import com.example.Springboot_flight_service_001.dto.FlightBookingRequest;
import com.example.Springboot_flight_service_001.service.FlightBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableTransactionManagement
public class SpringbootFlightService001Application {
	@Autowired
	private FlightBookingService service;

	@PostMapping("/bookingFlightTicket")

	public FlightBookingAcknowledgement bookingFlightTicket(@RequestBody FlightBookingRequest request) throws Exception {
		return service.bookingFlightTicket(request);
	}
	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SpringbootFlightService001Application.class, args);
	}

}
