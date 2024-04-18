package org.example;
import java.util.List;


public class Regular extends Extra{
    public Regular() {}
    Double sumRegularExtra = 0.0;
    public void  sumExtras(Comanda order){
        List<Item> items =order.ItemList();
        for (Item item : items){
                sumRegularExtra += item.price;
        }
        order.updateTotal(sumRegularExtra);
        if (this.nextExtra != null && this.nextExtra.isPresent()) {
            this.nextExtra.get().sumExtras(order);
        }
    }
}