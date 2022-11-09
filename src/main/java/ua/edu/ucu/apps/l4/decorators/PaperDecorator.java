package ua.edu.ucu.apps.l4.decorators;

import ua.edu.ucu.apps.l4.items.Item;

public class PaperDecorator extends itemDec{

    public PaperDecorator(Item item){
        super(item);
        description = "paper decorated";
    }

    @Override
    public double getPrice() {
        return price();
    }

    @Override
    public double price() {
        return 13 + item.price();
    }
}