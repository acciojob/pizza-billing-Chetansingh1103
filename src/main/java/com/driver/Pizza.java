package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill ;

    private boolean cheese = false;
    private boolean topping = false;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg) {
            this.price = 300;
        }
        else {
            this.price = 400;
        }
        this.bill = "Base Price Of The Pizza: " + price + "\n";
    }

    public int getPrice(){
        System.out.print("Total Price: ");
        return this.price;
    }

    public void addExtraCheese(){
        if(this.cheese) return;
        cheese = true;
        this.price += 80;
        this.bill += "Extra Cheese Added: 80\n";
    }

    public void addExtraToppings(){
        if(this.topping) return;
        topping = true;
        if(isVeg) {
            this.price += 70;
            this.bill += "Extra Toppings Added: 70\n";
        }
        else {
            this.price += 120;
            this.bill += "Extra Toppings Added: 120\n";
        }
    }

    public void addTakeaway(){
        this.price += 20;
        this.bill += "Paperbag Added: 20\n";
    }

    public String getBill(){
        this.bill += "Total Price: " + price + "\n";
        return this.bill;
    }
}
