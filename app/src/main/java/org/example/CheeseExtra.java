package org.example;

import java.util.List;

public class CheeseExtra extends Extra {
    private static final double CHEESE_PRICE = 0.25;
    private static final String COMPROBAR_EXTRA = Extra.CHEESE;

    @Override
    public void sumExtras(Comanda order) {
        double totalCheesePrice = 0.0;
        List<Item> items = order.ItemList();
        
        for (Item item : items) {
            if (item.getExtra().equals(COMPROBAR_EXTRA)) { 
                totalCheesePrice += CHEESE_PRICE;
            }
        }
        
        order.updateTotal(totalCheesePrice);
        if (this.nextExtra != null && this.nextExtra.isPresent()) {
            this.nextExtra.get().sumExtras(order);
        }
        
    }
}