package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int toppings;
    boolean isCheeseAdded;
    boolean isToppingsAdded;
    boolean isBillGenerated;
    boolean isTakeWay;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg){
            this.price=300;
            this.toppings=70;
        }
        else{
            this.price=400;
            this.toppings=120;
        }
        this.bill="Base Price Of The Pizza: "+this.price+"\n";
    }

    public int getPrice(){
        return this.price;

    }

    public void addExtraCheese(){
        if(!isCheeseAdded){
            this.price+=80;
            this.isCheeseAdded=true;
        }
    }

    public void addExtraToppings(){
        if(!isToppingsAdded){
            this.price+=this.toppings;
            this.isToppingsAdded=true;
        }
    }

    public void addTakeaway(){
        if(!isTakeWay){
            this.price+=20;
            isTakeWay=true;
        }
    }

    public String getBill(){
        if(!isBillGenerated) {
            if (isCheeseAdded) {
                this.bill+= "Extra Cheese Added: 80" + "\n";

            }
            if (isToppingsAdded) {
                this.bill+= "Extra Toppings Added: " + this.toppings + "\n";
            }
            if (isTakeWay) {
                this.bill+= "Paperbag Added: 20" + "\n";
            }
            this.bill+= "Total Price: "+this.price;
            this.isBillGenerated = true;


            return this.bill;
        }
        return "";
    }
}
