package com.example.Springboot_flight_service_001.repository;

import com.example.Springboot_flight_service_001.entity.PassengerInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerInfoRepository extends JpaRepository<PassengerInfo,Long> {
}
