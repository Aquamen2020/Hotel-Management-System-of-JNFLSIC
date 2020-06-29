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

    public void checkin (int roomnumber,Customer c )
    {
        AllRooms.get(roomnumber).occupied();
    }
    /**
     * @Author  ${jaydon}
     * @create ${6.29} ${11:30}
     */

    public void checkout (int roomnumber,Customer C, int Rating, String roomfeedback, String thingsDestroyed)  //        缺少room,customer部分参数 roombox
    {

        double tempprice=0;
        if (AllRooms.get(roomnumber).destroy(thingsDestroyed)){
            income += 300;
            tempprice += 300;}
        if (C.isVIP == true)
        {
            tempprice = (AllRooms.get(roomnumber).getPrice()) * C.calAvailableDiscounts();
            C.checkout(tempprice);
            income = income + tempprice;

        }
        else
        {
            tempprice = AllRooms.get(roomnumber).getPrice();
            income = income + tempprice;
            C.checkout(tempprice);
        }
        AllRooms.get(roomnumber).checkout(Rating,thingsDestroyed);
    }



    public void reConstracting(Room original,Room newone) {

       AllRooms.remove(original);
       AllRooms.add(newone);

    }

    public double getIncome()
    { return income; }
}