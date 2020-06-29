package com.Aquamen2020;
/**
 * @Author  ${jaydon}
 * @create ${6.29} ${11:30}
 */

public class EquisiteRoom extends Room{
    private int numOfTelevisions; // the max num is 5
    private int numOfDrunkDrinks;// our hotel only provide people with champagne.
                                 // the max num is 1000. if exceed 1000, other fee eliminated
    private int numOfBathrooms;
    private double price;

    EquisiteRoom(int nob, int roomsPerRoom, int numOfTelevisions,int numOfBathrooms) {
        super(nob, roomsPerRoom);
        price = calPrice();
    }

    public double calPrice(){
        double basefund = 499;
        double pricefornumOfTelevisions = (199.99 * numOfTelevisions)*((100-numOfTelevisions)/100);
        double pricefornumOfDrunkDrinks = (159.99 * numOfDrunkDrinks)*((10000-numOfDrunkDrinks)/10000);
        double priceforRooms = (399.99 * roomsPerRoom) * ((100-roomsPerRoom*5)/100);
        double priceforBeds= (299.99 * numOfBeds) * ((100-numOfBeds*4)/100);
        double pricefornumOfBathrooms = 39.99 * numOfBathrooms;
        if (numOfDrunkDrinks>=1000){
            return pricefornumOfDrunkDrinks;
        }
        else{
            return basefund+pricefornumOfBathrooms+pricefornumOfDrunkDrinks+pricefornumOfTelevisions+priceforBeds+priceforRooms;
        }
    }
    public double getPrice(){
        return price;
    }
}