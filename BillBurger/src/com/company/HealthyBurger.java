package com.company;

public class HealthyBurger extends Hamburger{
    private String extraHealthy1Name;
    private double extraHealthy1Price;

    private String extraHealthy2Name;
    private double extraHealthy2Price;

    public HealthyBurger(String meat, double price){
        super("Healthy", price, meat, "White Roll");
    }

    public void addHealthy1Addition(){
        this.extraHealthy1Name = extraHealthy1Name;
        this.extraHealthy1Price = extraHealthy1Price;
    }

    public void addHealthy2Addition(){
        this.extraHealthy2Name=extraHealthy2Name;
        this.extraHealthy2Price=extraHealthy2Price;
    }

    @Override
    public double itemizeHamburger(){
        double price = super.itemizeHamburger();
        if(extraHealthy1Name != null){
            price +=extraHealthy1Price;
            System.out.println("Total price of hamburger with added "+extraHealthy1Name+" is: "+price);
        }
        if(extraHealthy2Name != null){
            price +=extraHealthy2Price;
            System.out.println("Total price of hamburger with added "+extraHealthy2Name+" is: "+price);
        }
        return price;
    }
}
