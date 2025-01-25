package pj.s30566.s30566bank.objects;

public class Transfer {

    private int from;
    private int to;
    private double amount;
    public Transfer(int id, int from, int to, double amount) {
        this.from = from;
        this.to = to;
        this.amount = amount;
    }
    public Transfer(int from, int to, double amount) {
        this.from = from;
        this.to = to;
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getTo() {
        return to;
    }

    public void setTo(int to) {
        this.to = to;
    }

    public int getFrom() {
        return from;
    }

    public void setFrom(int from) {
        this.from = from;
    }
}
