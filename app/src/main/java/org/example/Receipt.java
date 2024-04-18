package org.example;

public class Receipt implements Ticket{
    private Double total = 0.0;
    private Comanda order;
    private Extra firstExtra;
    public Receipt (Comanda order){
        this.order = order;
        this.total = order.getTotal();
    }
    public Comanda getOrder(){
        return this.order;
    }
    public Double getTotal(){ return this.total;
    }
    public void setChain(Extra extra) {
        this.firstExtra = extra;
    }

    Extra getChain() {
        return this.firstExtra;
    }

    public Double total() {
        if (this.total == 0d) {
            this.sumExtrasCharge();
            this.total = this.getOrder().getTotal();
        }
        return this.total;
    }

    void sumExtrasCharge() {
        if (this.firstExtra != null) {
            this.firstExtra.sumExtras(this.order);
        }
    }

    public void print(){
        this.order.display();
        System.out.println("\t Total: " + this.total);
    }
}
