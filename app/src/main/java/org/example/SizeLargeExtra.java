package org.example;

import java.util.List;

public class SizeLargeExtra extends Extra {
    private static final double SIZE_LARGE_PRICE = 0.5;
    private static final String COMPROBAR_EXTRA = Extra.SIZE_LARGE;

    @Override
    public void sumExtras(Comanda order) {
        double totalSizeLargePrice = 0.0;
        List<Item> items = order.ItemList();
        
        for (Item item : items) {
            if (item.getExtra().equals(COMPROBAR_EXTRA)) {
                totalSizeLargePrice += SIZE_LARGE_PRICE;
            }
        }
        
        order.updateTotal(totalSizeLargePrice);

        if (this.nextExtra != null && this.nextExtra.isPresent()) {
            this.nextExtra.get().sumExtras(order);
        }
    }
}