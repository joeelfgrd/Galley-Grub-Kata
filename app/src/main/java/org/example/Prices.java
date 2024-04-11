package org.example;

import java.util.HashMap;
import java.util.Map;



public class Prices {
    static Map<String,Double> prices = new HashMap<>() {};
    private Prices(){}
    public static void init_prices(){
        prices.put("cheese", 0.25);
        prices.put("sauce", 0.50);
        prices.put("medium", 0.25);
        prices.put("large", 0.50);
    }
    public static Double getPrice(String prices){
        return Prices.prices.get(prices);
    }
    public static Boolean contains(String namePrice){
        return Prices.prices.containsKey(namePrice);
    }
    public static void display(){
        for (Map.Entry<String, Double> entry : Prices.prices.entrySet()) {
            System.out.println(entry.getKey() + " :\t " + entry.getValue());
        }
    }

   
}

    






