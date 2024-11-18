package com.exampl.taskGuru;

import javax.xml.validation.Validator;

public class ClientValidator {

    public boolean validateEmail(String email) {
        return email.matches("[\\w\\-.]*@[A-Z a-z]{2,6}\\.(ru|com|net?org)");
    }


    public boolean validateIp(String ip) {

        return true;
    }

    public boolean validateUrl(String url) {
        return true;
    }

    public boolean validateAddress(String address) {
        return true;
    }
}

class Client {
    public String email;
    public String ip;
    public String address;
    public String url;

    public Client(String email, String ip, String address, String url) {
        this.email = email;
        this.ip = ip;
        this.address = address;
        this.url = url;
    }

}

class Test {
    public static void main(String[] args) {
        Client client1 = new Client("shedo.alex@gmail.com",
                "129.0.0.0", "Россия обл. @Калужская р-н Обнинский г. Обнинск, ул. Ленина д. 133 ",
                "https://www.labirint.ru/book/594619");
        ClientValidator cv = new ClientValidator();
        System.out.println("Client1 check: "
                           + cv.validateEmail(client1.email)
                           + cv.validateIp(client1.ip)
                           + cv.validateAddress(client1.address)
                           + cv.validateUrl(client1.url));


    }
}


