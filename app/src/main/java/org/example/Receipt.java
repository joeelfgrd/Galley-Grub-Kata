package org.example;

public class Receipt {
    private Double total = 0.0;
    private Comanda order;
    public Receipt (Comanda order){
        this.order = order;
        this.total = order.getTotal();
    }
    public Comanda getOrder(){
        return this.order;
    }
    public Double getTotal(){
        return this.total;
    }
    public void print(){
        System.out.println("\n\t --- RECEIPT --- ");
        this.order.display();
        System.out.println("\t Total: " + this.total);
    }
}