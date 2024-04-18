package org.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;




public class RegularTest {

    Receipt receipt;
    Regular regular;
    Order order;

    @Test
    public void sum_extras_regular_test() {

        order = new Order();

        order.additem("Krabby Patty", 1.25, "cheese");
        order.additem("Coral Bits", 1.00, "medium");
        order.additem("Kelp Rings", 1.50, "sauce");
        order.additem("Golden Loaf", 2.00, "sauce");
        order.additem("Seafoam Soda", 1.00, "large");

        receipt = new Receipt(order);

        regular = new Regular();
        receipt.setChain(regular);

        regular.sumExtras(order);
        assertEquals(6.75d, order.getTotal(), 0.1d);
    } 
    
    @Test
    public void sum_regular_test() {

        order = new Order();

        order.additem("Krabby Patty", 1.25);
        order.additem("Coral Bits", 1.00);
        order.additem("Kelp Rings", 1.50);
        order.additem("Golden Loaf", 2.00);
        order.additem("Seafoam Soda", 1.00);

        receipt = new Receipt(order);

        regular = new Regular();
        receipt.setChain(regular);

        regular.sumExtras(order);
        assertEquals(6.75d, order.getTotal(), 0.1d);
    }
}