package org.example;

public class Item implements Product {
    String name = "";
    Double price = 0d;
    String extra = "";
    String priceString;

    public Item(String name, Double price) {
        this.name = name;
        this.price = price;
        this.priceString = String.format("%.2f", price); 
    }

    public Item(String name, Double price, String extra) {
        this.name = name;
        this.price = price;
        this.extra = extra;
        this.priceString = String.format("%.2f", price); 
    }

    public String name() {
        return this.name;
    }

    public Double price() {
        return this.price;
    }

    public String extra() {
        return this.extra;
    }

    public Boolean isRegular() {
        return this.extra().isBlank();
    }

    public String getExtra(){
        return this.extra;
    }

    @Override
    public String toString() {
        StringBuilder menu = new StringBuilder();
        if (extra != null && !extra.isEmpty()) {
            StringBuilder menu_extra = new StringBuilder();
            menu_extra.append(name);
            menu_extra.append(" w/ ");
            menu_extra.append(extra);
            menu_extra.append("....");
            menu_extra.append(priceString);
            menu_extra.append("$ ");
            menu_extra.append("+ ");
            menu_extra.append(String.format("%.2f",Prices.getPrice(this.extra)));
            menu_extra.append("$");
            return menu_extra.toString();
        } else {
            menu.append(name);
            menu.append("....");
            menu.append(priceString); 
            menu.append("$");
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

