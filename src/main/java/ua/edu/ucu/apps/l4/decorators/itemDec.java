package ua.edu.ucu.apps.l4.decorators;
import lombok.AllArgsConstructor;

import ua.edu.ucu.apps.l4.items.Item;


@AllArgsConstructor
public abstract class itemDec extends Item {
    protected Item item;
    public abstract double getPrice();

}
