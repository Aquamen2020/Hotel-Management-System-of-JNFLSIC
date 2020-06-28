package com.Aquamen2020;

import java.util.ArrayList;

public class Room {


    int numOfBeds;
    boolean isAvailable;
    int roomsPerRoom;
    String typeOfRoom;
    boolean isCleaned;
    ArrayList <Integer> feedbackRoom;

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

    }
    String modifyRank(){}
    void cleanRoom(){}









}
