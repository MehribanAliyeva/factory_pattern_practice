package com.example.factory_pattern_practice;

import org.springframework.stereotype.Component;

@Component
public class FactorySelector {

    public PaymentGatewayFactory selectPayment(String paymentType){
        if(paymentType.equals("Paypal")){
            return new PaypalGatewayFactory();
        }else return new StripeGatewayFactory();
    }
}
