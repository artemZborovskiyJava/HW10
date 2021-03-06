package com.javahw;

import com.javahw.model.Fruit;

public class Main {

    public static void main(String[] args) {
	    Fruit greenApple = new Fruit(Type.APPLE, Color.GREEN, 186, 25.9);
	    Fruit redApple = new Fruit(Type.APPLE, Color.RED, 146, 26.9);
	    Fruit banana = new Fruit(Type.BANANA, Color.YELLOW, 186, 32.8);
	    Fruit lemon = new Fruit(Type.LEMON, Color.YELLOW, 246, 34.9);
        System.out.printf("Всего к оплате -> %.2f грн", calculateTotalPrice(greenApple, redApple, banana, lemon));
    }

    private static double calculateTotalPrice(Fruit... fruits) {
        double totalPrice = 0;
        for(Fruit fruit : fruits) {
            totalPrice += fruit.calculatePrice();
        }
        return totalPrice;
    }
}