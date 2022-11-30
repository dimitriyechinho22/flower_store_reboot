package ua.edu.ucu.apps.l4.items;

import ua.edu.ucu.apps.l4.Payment.Payment;
import ua.edu.ucu.apps.l4.delivery.Delivery;
import ua.edu.ucu.apps.l4.users.MyUser;

import java.util.ArrayList;
import java.util.LinkedList;

public class Order {
    private Payment payment;
    private Delivery delivery;

    private LinkedList<MyUser> users_list = new LinkedList<>();

    private final ArrayList<Item> list_of_Items;

    public Order() {
        list_of_Items = new ArrayList<>();
    }
    public void setDeliverStrategy(Delivery delivery) {
        this.delivery = delivery;
    }

    public void setPaymentMethod(Payment payment) {
        this.payment = payment;
    }

    public double CountPrice(){
        double res = 0;
        for(Item i: list_of_Items){
            res+=i.price();
        }
        return res;
    }
    public void processingOrder(){
        boolean flag = payment.pay(CountPrice());
        System.out.println("Payment is done");
        delivery.delivery();
    }

    public void addingItem(Item element){
        list_of_Items.add(element);
    }

    public void removingItem(Item element){
        list_of_Items.remove(element);
    }



    public void addUser(MyUser user) {
        users_list.add(user);
    }

    public void removeUser(MyUser user) {
        users_list.remove(user);
    }
}
