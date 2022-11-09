package ua.edu.ucu.apps.l4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.edu.ucu.apps.l4.Payment.CreditCardPayment;
import ua.edu.ucu.apps.l4.Payment.PayPalPayment;
import ua.edu.ucu.apps.l4.Payment.Payment;

public class PaymentTests {
    private Payment credit_card_pay;
    private Payment pay_pal;
    private double price;




    @BeforeEach
    public void init() {
        credit_card_pay = new CreditCardPayment();
        pay_pal = new PayPalPayment();
        price = 100;
    }


    @Test
    public void testCreditCardPayment() {
        boolean paidByCard = credit_card_pay.pay(price);
        assert (paidByCard);
    }

    @Test
    public void testPayPalPayment() {
        boolean paidByPayPal = pay_pal.pay(price);
        assert (paidByPayPal);
    }
}
