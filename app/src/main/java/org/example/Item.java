package org.example;

public class Item {
    String name ="";
    Double price = 0d;
    String extra ="";

    public Item(String name, Double price) {
        this.name = name;
        this.price = price;
    }
    public Item(String name,Double price ,String extra){
        this.name=name +  extra;
        this.price=price;
        this.extra=extra;
    }
    public String name(){
        return this.name;
    }    
    public Double price(){
        return this.price;
    }   
    public String extra(){
        return this.extra;
    }
    public Boolean isRegular(){
        return this.extra().isBlank();
    }

    @Override
    public String toString(){
        StringBuilder menu = new StringBuilder();
        menu.append(name);
        menu.append(".........");
        menu.append(price);
        StringBuilder menu_extra = new StringBuilder();
        menu.append(name ="w/"); menu.append(".........");
        menu.append(price);
        menu.append("$\t");
        menu.append("$\t");
       

        menu.append(extra);
        if (Prices.contains(this.extra())){
            return menu.append(extra);   
        }
    }
}
