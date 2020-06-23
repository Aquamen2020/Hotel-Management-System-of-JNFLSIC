package com.Aquamen2020;

import java.util.ArrayList;

public class Hotel {
    String location = "";
    ArrayList <Room> AllRooms = new ArrayList <Room>();
    double income = 0;
    boolean isRestrauant;
    boolean isEntertainment;
    String rating;
    ArrayList <String> feedbacks = new ArrayList <String>();
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

    public void checkin (int roomnumber,Customer C ) //缺少 room,customer部分的参数
    {

        if (c.isVIP == true)
        {income = income + ((Rooms.get(3).getprice) * 0.8);} //假设会员打八折
        else
        {income = income + Rooms.get(3).getprice;}
    }

    public void checkout (int roomnumber,Customer C, String Rating, String roomfeedback)  //        缺少room,customer部分参数 roombox
    {


        if (c.isVIP == true)
        {income = income + ((Rooms.get(3).getprice) * 0.8);} //假设会员打八折
        else
        {income = income + Rooms.get(3).getprice;}

        feedbacks.add(rating);

    }



    public void changerating (ArrayList <feedback> feedbacks) //缺少衡量的标准，未商议
    {

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