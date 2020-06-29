package com.Aquamen2020;

public class StandardRoom extends Room {
    private int numOfBathroom;// RoomsperRoom deos not include bathroom. Also, the max num for bathroom is 10
    double price;
    StandardRoom(int nob, int roomsPerRoom) {
        super(nob, roomsPerRoom);
        price = calPrice();



    }
    public double calPrice(){
        double baseFund = 30;
        double priceforBeds= (29.99 * numOfBeds) * ((100-numOfBeds*4)/100);
        double priceforRooms = (49.99 * roomsPerRoom) * ((100-roomsPerRoom*5)/100);
        double priceforBathrooms = 39.99 * numOfBathroom;
        return baseFund+priceforBathrooms+priceforBeds+priceforBeds;


    }
    public double getPrice(){
        return price;
    }
}
