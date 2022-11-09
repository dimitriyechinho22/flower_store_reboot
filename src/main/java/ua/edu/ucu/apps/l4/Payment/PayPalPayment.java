package ua.edu.ucu.apps.l4.Payment;

import lombok.Getter;

@Getter
public class PayPalPayment implements Payment{
    private final String name;
    private final String description;

    public PayPalPayment() {
        name = "PayPal";
        description = "PayPal payment";
    }


    @Override
    public boolean pay(double price) {
        System.out.println("Paid PayPal");
        return true;
    }
    }

