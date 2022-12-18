package com.luv2code.ecommerce.dto;

// send back as JSON

import lombok.Data;

@Data
public class PurchaseResponse {

    // lombok.Data will generate constructor for final fields
    private final String orderTrackingNumber;

}
