package org.example;
import java.util.ArrayList;
import java.util.List;

public class Order implements Comanda{
    public Order() {}
    private List<Item> OrderList = new ArrayList<Item>();
 
    public void additem(String name,Double price){
        Item item = ItemFactory.getItem(name, price);
        this.OrderList.add(item);
    }
    public void additem(String name,Double price,String extra){
        Item item = ItemFactory.getItem(name, price, extra);
        this.OrderList.add(item);

    }
    public int size(){
        return this.OrderList.size();
    }
    
    private Double total = 0.0;
    
    public void updateTotal(Double total){
        this.total += total;
    }
    public Double getTotal(){
        return this.total;
    }
    public void display() {
        System.out.println("\n\t --- ORDER --- ");
        for (Item item : OrderList) {
            System.out.println("\t" + item.toString());
        }
    }
}