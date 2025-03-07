package org.example.enums;

public enum Plan {
    BASIC("A Sigorta", 100),
    PREMIUM("B Sigorta", 200),
    VIP("C Sigorta", 500);

    //instance variables:
    private String name;
    private int price;

    //constructor:
     Plan(String name, int price) {
        this.name = name;
        this.price = price;
    }

    //getter methods:
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }

    //setter methods:
    public void setName() {
        this.name = name;
    }
    public void setPrice() {
        this.price = price;
    }
}
