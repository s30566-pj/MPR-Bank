package pj.s30566.s30566bank.backend;

public class ChargeAccount {
    private int id;
    private int amount;
    private int accountId;
    public ChargeAccount(int id, int amount, int accountId) {
        this.id = id;
        this.amount = amount;
        this.accountId = accountId;
    }
    public ChargeAccount(int amount, int accountId) {
        this.amount = amount;
        this.accountId = accountId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }
}
