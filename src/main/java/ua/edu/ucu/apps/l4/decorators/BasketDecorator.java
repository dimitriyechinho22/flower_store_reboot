package ua.edu.ucu.apps.l4.decorators;

import ua.edu.ucu.apps.l4.items.Item;

public class BasketDecorator extends itemDec{

    public BasketDecorator(Item item){
        super(item);
        description = "basket decorated";
    }

    @Override
    public double getPrice() {
        return price();
    }

    @Override
    public double price() {
        return 4 + item.price();
    }
}
