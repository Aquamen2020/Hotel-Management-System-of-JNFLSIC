package com.Aquamen2020;

public class StandardRoom extends Room {
    private int numOfBathroom;// RoomsperRoom deos not include bathroom.
    double price;
    StandardRoom(int nob, int roomsPerRoom) {
        super(nob, roomsPerRoom);
        price = getPrice();



    }
    public double getPrice(){
        double priceforBeds= 29.99 * numOfBeds;
        double priceforRooms = 49.99 * roomsPerRoom;
        double priceforBathrooms = 39.99 * numOfBathroom;
        return priceforBathrooms*0.9 + priceforBeds + priceforRooms * 0.85;

    }
}
