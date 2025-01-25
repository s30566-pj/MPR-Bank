package pj.s30566.s30566bank.backend;

import org.springframework.stereotype.Component;
import pj.s30566.s30566bank.objects.Client;

import java.text.DecimalFormat;
import java.time.LocalDateTime;

@Component
public class RegisterNewClient {

    private String name;
    private String lastName;
    private String email;
    private String phone;
    private String address;
    private LocalDateTime birthday;
    private double wallet;

    private Client client;

    void createClient(String name, String lastName, String email, String phone, String address, LocalDateTime birthday, double wallet) {
        DecimalFormat df = new DecimalFormat("#.##");
        this.name = name.substring(0, 1).toUpperCase();
        this.lastName = lastName.substring(0, 1).toUpperCase();
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.birthday = birthday;
        this.wallet = Double.parseDouble(df.format(wallet));
        this.client = new Client(name, lastName, email, phone, address, birthday, wallet);
    }

    void setClient(Client client) {
        this.client = client;
    }

}
