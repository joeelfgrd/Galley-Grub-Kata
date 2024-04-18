package org.example;

public interface Ticket {
    Comanda getOrder();

    void setChain(Extra extra); 

    Double total();

    void print();
}
