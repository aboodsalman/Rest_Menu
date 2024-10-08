package com.example.rest_menu;

public class Product {
    private String name, type;
    private double price;

    public Product(String name, String type, double price){
        this.name=name;
        this.type=type;
        this.price=price;
    }

    public String getType(){
        return type;
    }

    public String toString(){
        return name+"\n"+price;
    }
}
