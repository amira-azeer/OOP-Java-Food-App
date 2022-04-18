package com.company;

public class DeluxeBurger extends Hamburger{

    public DeluxeBurger(){
        super("Deluxe", 1.78, "Sausage and Bacon", "White Roll");
        super.addHamburgerAddition1("Chips", 1.75);
        super.addHamburgerAddition2("Drink", 1.81);
    }

    @Override
    public void addHamburgerAddition1(String addition1Name, double addition1Price) {
        System.out.println("Cannot add extra addons");
    }

    @Override
    public void addHamburgerAddition2(String addition2Name, double addition2Price) {
        System.out.println("Cannot add extra addons");
    }

    @Override
    public void addHamburgerAddition3(String addition3Name, double addition3Price) {
        System.out.println("Cannot add extra addons");
    }

    @Override
    public void addHamburgerAddition4(String addition4Name, double addition4Price) {
        System.out.println("Cannot add extra addons");
    }
}
