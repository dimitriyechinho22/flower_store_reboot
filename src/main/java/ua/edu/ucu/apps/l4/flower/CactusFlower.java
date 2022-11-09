package ua.edu.ucu.apps.l4.flower;

public class CactusFlower extends Flower {
    public CactusFlower(FlowerColor color, double sepalLength, double price) {
        super(color, sepalLength, price);
    }

    @Override
    public double price() {
        return price;
    }
}
