package org.example;
import java.util.HashMap;
import java.util.Map;

public class ItemFactory {

    private static final Map<String, Item> items = new HashMap<String, Item>();

    public static Item getItem(String name, double price) {
        
        items.putIfAbsent(name, new Item(name, price));
        return items.get(name);
    }

    public static Item getItem(String name, double price, String extra) {
        
        items.putIfAbsent(name + " w/ " + extra, new Item(name, price, extra));
        return items.get(name + " w/ " + extra);
    }

    static int size() {
        return items.size();
    }

    static void clear() {
        items.clear();
    }    
}
  


