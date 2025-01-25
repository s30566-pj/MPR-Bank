package pj.s30566.s30566bank.objects;

public class TransactionStatus {
    private double amount;
    private String status;
    private double newBalance;

    public TransactionStatus(double amount, String status, double newBalance) {
        this.amount = amount;
        this.status = status;
        this.newBalance = newBalance;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getNewBalance() {
        return newBalance;
    }

    public void setNewBalance(double newBalance) {
        this.newBalance = newBalance;
    }
}
