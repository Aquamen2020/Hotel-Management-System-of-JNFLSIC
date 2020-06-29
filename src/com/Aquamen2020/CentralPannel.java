package com.Aquamen2020;

import java.util.ArrayList;

public class CentralPannel {
    private ArrayList<Hotel> AllHotels;
    private double grossIncome;

    public double getIncome(){ return grossIncome;}

    public Hotel getmostprofitable(){
        int temp=0;
        for (int i =1; i<this.AllHotels.size(); i++){
            if (this.AllHotels.get(i).getIncome()>this.AllHotels.get(i-1).getIncome()){
                temp=i;
            }

        }
        return this.AllHotels.get(temp);//
    }
    /**
     * @Author  ${jaydon}
     * @create ${6.29} ${11:30}
     */
    double calIncome(){
    for (Hotel a:AllHotels){
        grossIncome+=a.income;
    }
    return  grossIncome;
    }


    ArrayList<Hotel> compareHotels(){
        ArrayList<Hotel> list = new ArrayList<Hotel>();
        for (int i = 0; i < AllHotels.size();i++){
            double bigrate= AllHotels.get(i).getIncome();
            Hotel Hotel = null;
            for (int j = 0+i;j<AllHotels.size();j++){
                if (AllHotels.get(j).getIncome()>bigrate){
                    bigrate=AllHotels.get(j).getIncome();
                    Hotel = AllHotels.get(j);
                }
            }
            list.add(Hotel);
        }
        return AllHotels;
    }
}
