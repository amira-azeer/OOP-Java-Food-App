package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Hamburger hamburger = new Hamburger("Basic", 3.56, "Sausage", "White");
        hamburger.addHamburgerAddition1("Tomatoes", 0.27);
        hamburger.addHamburgerAddition2("Extra Cheese", 1.13);
        hamburger.addHamburgerAddition3("Lettuce", 0.75);
        System.out.println("Total Price of Basic Burger : "+hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHamburgerAddition1("Eggs", 5.43);
        healthyBurger.addHamburgerAddition2("Lentils", 3.41);
        System.out.println("Total Price of Healthy Burger : "+healthyBurger.itemizeHamburger());

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        System.out.println("Total Price of Deluxe Burger : "+deluxeBurger.itemizeHamburger());
    }
}
