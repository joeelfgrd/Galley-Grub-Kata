package org.example;

public interface Comanda {
   public void additem(String name,Double price);
   public void additem(String name,Double price,String extra);
   public int size();
   public Double getTotal();
   public void updateTotal(Double total);
   public void display();
}
