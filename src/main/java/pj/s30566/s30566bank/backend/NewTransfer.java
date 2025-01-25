package pj.s30566.s30566bank.backend;

import org.springframework.stereotype.Component;
import pj.s30566.s30566bank.objects.Client;
import pj.s30566.s30566bank.objects.TransactionStatus;
import pj.s30566.s30566bank.objects.Transfer;

@Component
public class NewTransfer {

    private int isEnoughMoney(Client client, double amount) {
        if (client.getWallet() < amount){
            return 1;
        } else if (client.getWallet() >= amount) {
            return 0;
        } else if (amount == 0) {
            return 2;
        } else if (amount < 0) {
            return 3;
        }
        return 10;
    }

    private double calcNewBalance(Client client, double amount) {
        return client.getWallet() - amount;
    }

    public TransactionStatus sendNewTransfer(Transfer transfer, Client client, int destination) {
        double amount = transfer.getAmount();
        if ( isEnoughMoney(client, amount) == 1) {
            return new TransactionStatus(amount,"Declined: Balance too low", amount);
        } else if (isEnoughMoney(client, amount) == 2) {
            return new TransactionStatus(amount,"Declined: Amount of money is 0", amount);
        } else if (isEnoughMoney(client, amount) == 3) {
            throw new RuntimeException("Declined: Amount less than zero");
        }

        try {
            createNewTransfer(client, amount, destination);
        } catch (Exception e) {
            return new TransactionStatus(amount, "Unknown error", calcNewBalance(client, amount));
        }

        return new TransactionStatus(amount, "New transfer", calcNewBalance(client, amount));
    }

    private Transfer createNewTransfer(Client client, double amount, int destination) {
        return new Transfer(client.getId(), destination, amount);
    }

}
