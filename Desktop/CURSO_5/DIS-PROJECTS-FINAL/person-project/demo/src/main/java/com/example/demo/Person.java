package com.example.demo;

import java.util.UUID;

public class Person {
    //name":"Keeley Bosco",
    // "email":"katlyn@jenkinsmaggio.net",
    // "city":"Lake Gladysberg",
    // "mac":"08:fd:0b:cd:77:f7",
    // "timestamp":"2015-04-25 13:57:36 +0700",
    // "creditcard":"1228-1221-1221-1431"},

    private String id;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    private String email;
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    private String city;
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    private String mac;
    public String getMac() {
        return mac;
    }
    public void setMac(String mac) {
        this.mac = mac;
    }
    private String timestamp;
    public String getTimestamp() {
        return timestamp;
    }
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
    private String creditcard;
    public String getCreditcard() {
        return creditcard;
    }
    public void setCreditcard(String creditcard) {
        this.creditcard = creditcard;
    }


    public Person(String name, String email, String city, String mac, String timestamp, String creditcard) {
        UUID uuid = UUID.randomUUID();
        this.id = uuid.toString();
        this.name = name;
        this.email = email;
        this.city = city;
        this.mac = mac;
        this.timestamp = timestamp;
        this.creditcard = creditcard;
    }

}

