package ua.edu.ucu.apps.l4.decorators;

import ua.edu.ucu.apps.l4.items.Item;

public class RibbonDecorator extends itemDec{
    public RibbonDecorator(Item item) {
        super(item);
        description = "ribbon decorated";
    }

    @Override
    public double price() {
        return 40 + item.price();
    }

    @Override
    public double getPrice() {
        return price();
    }
}
