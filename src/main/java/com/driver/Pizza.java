package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill ;
    private int cheese;
    private int topping;
    private boolean isExtraCheeseAdded;
    private boolean isExtraToppingAdded;
    private boolean isBillGenerated;
    private boolean isTakeAwayAdded;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.isBillGenerated =false;
        this.isTakeAwayAdded = false;
        this.isExtraCheeseAdded = false;
        this.isExtraToppingAdded = false;
        if(isVeg) {
            this.price = 300;
            this.topping = 70;
        }
        else {
            this.price = 400;
            this.topping = 120;
        }
        this.cheese = 80;
        this.bill = "Base Price Of The Pizza: " + this.price + "\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(!isExtraCheeseAdded) {
            this.price = this.price + cheese;
            isExtraCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
       if(!isExtraToppingAdded){
           this.price = this.price + topping;
           isExtraToppingAdded = true;
       }
    }

    public void addTakeaway(){
       if(!isTakeAwayAdded){
           this.price += 20;
           isTakeAwayAdded = true;
       }
    }

    public String getBill(){
        if(!isBillGenerated) {
            if (isExtraCheeseAdded) {
                this.bill += "Extra Cheese Added: " + this.cheese + "\n";
            }
            if(isExtraToppingAdded){
                this.bill += "Extra Toppings Added: " + this.topping + "\n";
            }
            if(isTakeAwayAdded){
                this.bill += "Paperbag Added: " + "20" + "\n";
            }
            this.bill += "Total Price: " + this.price + "\n";
            isBillGenerated = true;
        }
        return this.bill;
    }
}
