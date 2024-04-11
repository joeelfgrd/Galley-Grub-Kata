package org.example;

public class Item implements Product {
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
    public String toString() {
    StringBuilder menu = new StringBuilder();
    menu.append(name);
    menu.append(".........");
    menu.append(price);
    menu.append("$\n");
    
    if (extra != null && !extra.isEmpty()) {
        StringBuilder menu_extra = new StringBuilder();
        menu_extra.append(name);
        menu_extra.append("  /w  ");
        menu_extra.append(extra);
        menu_extra.append(".........");
        menu_extra.append(price);
        menu_extra.append("$\t");
        return menu.toString() + menu_extra.toString();
    } else {
        return menu.toString();
    }
    }
    @Override
    public boolean equals(Object obj) {
        return (obj instanceof Item) && this.name.equals(((Item)obj).name);
    }
    @Override
    public int hashCode() {
        return this.name.hashCode();
    }
}
