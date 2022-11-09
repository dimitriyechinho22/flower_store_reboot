package ua.edu.ucu.apps.l4.delivery;

public class PostDelivery implements Delivery {
    @Override
    public void delivery() {
        System.out.println("Delivered by Post.");
    }
}