package com.Aquamen2020;

import java.util.ArrayList;

public class Hotel {
    String location = "";
    ArrayList <Room> AllRooms = new ArrayList <Room>();
    double income = 0;
    boolean isRestrauant;
    boolean isEntertainment;
    String rating;
    ArrayList <ArrayList<Integer>> feedbacks = new ArrayList <ArrayList<Integer>>();
    public Hotel (String lc, boolean isE,boolean isR)
    {
        location = lc;
        isRestrauant = isR;
        isEntertainment =  isE;

    }

    public int getNumOfRooms ()
    {
        return AllRooms.size();
    }

    public void checkin (int roomnumber,Customer c ) //缺少 room,customer部分的参数
    {

        if (c.isVIP == true)
        {income = income + ((AllRooms.get(3).getPrice()) * 0.8);} //假设会员打八折
        else
        {income = income + AllRooms.get(3).getPrice();}
    }

    public void checkout (int roomnumber,Customer C, int Rating, String roomfeedback, String thingsDestroyed)  //        缺少room,customer部分参数 roombox
    {


        if (C.isVIP == true)
        { income = income + ((AllRooms.get(roomnumber).getPrice()) * 0.8); } //假设会员打八折
        else
        {income = income + AllRooms.get(roomnumber).getPrice();}
        if (AllRooms.get(roomnumber).destroy(thingsDestroyed)){
            income += 300;
        }

        AllRooms.get(roomnumber).checkout(Rating,thingsDestroyed);

    }

    public void reConstracting(String lc, boolean isE,boolean isR)
    {
        AllRooms = new ArrayList <Room>();
        location = lc;
        isRestrauant = isR;
        isEntertainment =  isE;
    }

    public double getIncome()
    {

        return income;
    }
}