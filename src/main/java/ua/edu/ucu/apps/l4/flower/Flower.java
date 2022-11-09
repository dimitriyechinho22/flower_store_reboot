package ua.edu.ucu.apps.l4.flower;

import lombok.Getter;
import lombok.Setter;
import ua.edu.ucu.apps.l4.items.Item;


@Setter @Getter
public abstract class Flower extends Item {
    private double sepalLength;
    private String color;
    protected double price;
    private FlowerType flowerType;

    public Flower(FlowerColor color, double sepalLength, double price) {
        setColor(color);
        this.sepalLength = sepalLength;
        this.price = price;
    }

    public String getColor() {
        return color.toString();
    }
    private void setColor(FlowerColor color) {
        this.color = color.toString();
    }

    @Override
    public double price() {
        return price;
    }
}
