package org.example;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class OrderTest {

    private Order order = null;

    @Before
    public void setup_order() {
        order = new Order();
    }

    @Test
    public void add_absent_item_test() {
        this.order.additem("Krabby Patty", 1.25);
        assertEquals(1, this.order.size());
    }

    @Test
    public void add_present_item_test() {
        this.order.additem("Krabby Patty", 1.25);
        this.order.additem("Krabby Patty", 1.25);        
        assertEquals(2, this.order.size());
    }
    
}