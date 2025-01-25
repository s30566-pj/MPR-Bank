package pj.s30566.s30566bank.objects;

import java.time.LocalDateTime;

public class Client {
    private int id; //ID will be given by database system later
    private String name;
    private String lastName;
    private String email;
    private String phone;
    private String address;
    private LocalDateTime birthday;
    private double wallet;

//    public Client(String name, String lastName, String email, String phone, String address, LocalDateTime birthday, double wallet) {
//        this.name = name;
//        this.lastName = lastName;
//        this.email = email;
//        this.phone = phone;
//        this.address = address;
//        this.birthday = birthday;
//        this.wallet = wallet;
//    }

    public Client(int id, String name, String lastName, String email, String phone, String address, LocalDateTime birthday, double wallet) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.birthday = birthday;
        this.wallet = wallet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDateTime getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
    }

    public double getWallet() {
        return wallet;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
