package com.Aquamen2020;
/**
 * @Author  ${jaydon}
 * @create ${6.29} ${11:30}
 */

import java.util.ArrayList;

public class Room {


    int numOfBeds;// the max num is 10
    boolean isAvailable;
    int roomsPerRoom; // the max num is 10
    String typeOfRoom;
    boolean isCleaned;
    ArrayList <Integer> feedbackRoom;
    String thingsDestoyed;
    double price;

    Room(int nob,int roomsPerRoom){
        numOfBeds = nob;
        isAvailable = true;
        roomsPerRoom = roomsPerRoom;
        isCleaned = true;
        feedbackRoom = new ArrayList<Integer>();
        if (nob>=2){
            typeOfRoom = "Multihuman Room";
        }
        else{
            typeOfRoom = "Single Room";
        }
        double price = 0;

    }
    void cleanRoom(){
      isCleaned = !isCleaned;
    }

    void feedback(int rate){
       feedbackRoom.add(rate);
    }

    boolean destroy(String thingsDestoyed){
        thingsDestoyed+=thingsDestoyed;
        return true;// means having destroyedthings
    }

    boolean fixing(){
        thingsDestoyed="";
        return false;// means no destroyedthings.
    }
    void makeAvailable(){
        isAvailable=!isAvailable;
    }
    void occupied(){
        isAvailable = false;
    }

    public void checkout(int rate,String thingsDestoyed){

        cleanRoom();
        feedback(rate);
        destroy(thingsDestoyed);
        makeAvailable();

    }


    public double getPrice(){
        return price;
    }









}
