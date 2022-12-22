package com.example.Springboot_flight_service_001.repository;

import com.example.Springboot_flight_service_001.entity.PaymentInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentInfoRepository extends JpaRepository<PaymentInfo,String > {
}
