package com.Aquamen2020;

import java.util.ArrayList;

public class CentralPannel {
    private ArrayList<Hotel> AllHotels;
    private double grossIncome;

    public double getIncome(){ return grossIncome}

    public double setIncome(double income){
        this.grossIncome+= income;
    }

    public Hotel getmostprofitable(){
        int temp=0;
        for (int i =1; i<this.AllHotels.size(); i++){
            if (this.AllHotels.get(i).getIncome()>this.AllHotels.get(i-1).getIncome()){
                temp=i;
            }

        }
        return this.AllHotels.get(temp);//
    }



    public void modifyRating(){}
    double calIncome(){}
