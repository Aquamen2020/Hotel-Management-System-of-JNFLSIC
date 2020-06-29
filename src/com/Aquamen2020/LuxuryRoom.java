package com.Aquamen2020;
/**
 * @Author  ${jaydon}
 * @create ${6.29} ${11:30}
 */

public class LuxuryRoom extends Room{
    private int numOfTelevisions; // the max num is 5
    private int numOfDrunkDrinks;// our hotel only provide people with champagne.
    // the max num is 100000. if exceed 100000, other fee eliminated
    private int numOfBathrooms;
    private double price;
    private int numOfComputers;
    private boolean is24hourService;
    LuxuryRoom(int nob, int roomsPerRoom, int numOfTelevisions,int numOfBathrooms, int numOfComputers,boolean is24hourService) {
        super(nob, roomsPerRoom);
        price = calPrice();
    }

    public double calPrice() {
        double basefund = 999;
        double priceforTelevisions = (399.99 * numOfTelevisions)*((100-numOfTelevisions)/100);
        double priceforDrunkDrinks = (559.99 * numOfDrunkDrinks)*((1000000-numOfDrunkDrinks)/1000000);
        double priceforRooms = (599.99 * roomsPerRoom) * ((100-roomsPerRoom*5)/100);
        double priceforBeds= (499.99 * numOfBeds) * ((100-numOfBeds*4)/100);
        double priceforBathrooms = 399.99 * numOfBathrooms;
        double priceforComputers = 399.99 * numOfComputers;
        double pricefor24hoursservice;
        if (is24hourService){
            pricefor24hoursservice = 799.99;
        }
        else {pricefor24hoursservice=0;}
        if (numOfDrunkDrinks>=1000){
            return priceforDrunkDrinks;
        }
        else{
            return basefund+priceforTelevisions+pricefor24hoursservice+priceforBathrooms+priceforBeds+priceforComputers
                    +priceforDrunkDrinks+priceforRooms;
        }
    }
    public double getPrice(){
        return price;
    }

    }



