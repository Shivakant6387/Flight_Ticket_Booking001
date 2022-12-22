package com.example.Springboot_flight_service_001.utils;

import java.util.HashMap;
import java.util.Map;

public class PaymentUtils {
    private static Map<String ,Double>paymentMap=new HashMap<>();
    static {

        paymentMap.put("acc1",12000.0);

        paymentMap.put("acc2",10000.0);
        paymentMap.put("acc3",5000.0);

        paymentMap.put("acc1",8000.0);
    };
    public  static boolean validateCreditLimit(String accNo,double paidAmount) throws Exception {
        if (paidAmount>paymentMap.get(accNo)){
        throw new Exception("insufficient fund..!");
        }else {
            return true;
        }
    }
}
