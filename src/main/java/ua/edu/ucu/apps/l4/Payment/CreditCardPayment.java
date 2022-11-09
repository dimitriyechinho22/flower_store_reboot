package ua.edu.ucu.apps.l4.Payment;

import lombok.Getter;

@Getter
public class CreditCardPayment implements Payment{
    private final String name;
    private final String description;

    public CreditCardPayment() {
        name = "CreditCard";
        description = "CreditCard payment";
    }


    @Override
    public boolean pay(double price) {
        System.out.println("Paid with CreditCard");
        return true;
    }
}
