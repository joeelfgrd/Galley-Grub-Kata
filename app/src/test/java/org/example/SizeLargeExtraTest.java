package org.example;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class SizeLargeExtraTest {
    
    static Receipt receipt;
    static Extra sizeL;
    static Order order;

    @BeforeClass
    public static void setup_receipt() {

        order = new Order();

        order.additem("Krabby Patty", 1.25, "cheese");
        order.additem("Coral Bits", 1.00, "medium");
        order.additem("Kelp Rings", 1.50, "sauce");
        order.additem("Golden Loaf", 2.00, "sauce");
        order.additem("Seafoam Soda", 1.00, "large");
        order.additem("Coral Bits", 1.00, "large");

        receipt = new Receipt(order);

        sizeL = new SizeLargeExtra();
        receipt.setChain(sizeL);
    }

    @Test
    public void sum_extras_cheese_test() {

        sizeL.sumExtras(order);
        assertEquals(1.00d, order.getTotal(), 0.1d);
    }
}