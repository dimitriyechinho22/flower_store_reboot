package ua.edu.ucu.apps.l4.flower;

public class RomanshFlower extends Flower {
    public RomanshFlower(FlowerColor color, double sepalLength, double price) {
        super(color, sepalLength, price);
    }

    @Override
    public double price() {
        return price;
    }
}