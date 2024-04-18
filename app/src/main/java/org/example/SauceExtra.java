package org.example;

import java.util.List;

public class SauceExtra extends Extra {
    private static final double SAUCE_PRICE = 0.5;
    private static final String COMPROBAR_EXTRA = Extra.SAUCE;

    @Override
    public void sumExtras(Comanda order) {
        double totalSaucePrice = 0.0;
        List<Item> items = order.ItemList();
        
        for (Item item : items) {
            if (item.getExtra().equals(COMPROBAR_EXTRA)) {
                totalSaucePrice += SAUCE_PRICE;
            }
        }
        
        order.updateTotal(totalSaucePrice);

        if (this.nextExtra != null && this.nextExtra.isPresent()) {
            this.nextExtra.get().sumExtras(order);
        }
    }
}
