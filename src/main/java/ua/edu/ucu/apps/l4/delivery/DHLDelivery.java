package ua.edu.ucu.apps.l4.delivery;

public class DHLDelivery implements Delivery {
    @Override
    public void delivery() {
        System.out.println("Delivered by DHL.");
    }
}
