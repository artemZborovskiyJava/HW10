package com.javahw.model;

import com.javahw.Color;
import com.javahw.Type;

public class Fruit {

    private Type type;
    private Color color;
    private int weight; //грам
    private double price; //цена за килограм

    public Fruit(Type type, Color color, int weight, double price) {
        this.type = type;
        this.color = color;
        this.weight = weight;
        this.price = price;
    }

    public double calculatePrice() {
        return price * weight / 1000;
    }

    @Override
    public String toString() {
        return "Fruit {" +
                "type = " + type +
                ", color = " + color +
                ", weight = " + weight +
                ", price = " + price +
                '}';
    }
}