package com.Aquamen2020;
/**
 * @Author  ${jaydon}
 * @create ${6.29} ${11:30}
 */

public class Customer
{
    public static String name;
    public int age;
    public boolean isVIP;
    private double acumulativeCost;
    private double availableDiscounts;
    private int frequency;

    public Customer(String name, int age){
        name =name;
        age= age;
        acumulativeCost = 0;
        availableDiscounts = calAvailableDiscounts();
        isVIP= isVIP(acumulativeCost);

        frequency = 0;


    }

    public boolean isVIP(double acumulativeCost)
    {
        if (acumulativeCost!=1){
            return true;
        }
        else {
            return false;
        }
    }
    void checkout(double price){
        frequency+=1;
        acumulativeCost+=price;

    }
    double calAvailableDiscounts(){
        if (frequency>=31){
            if(acumulativeCost>2999.99){
                availableDiscounts = 0.89;
            }
            else if (acumulativeCost>29999.99){
                availableDiscounts = 0.69;
            }
            else if (acumulativeCost > 59999.99) {
                availableDiscounts = 0.59;
            }
            else {availableDiscounts=1;}
        }
        else if (frequency>65){
            if (acumulativeCost>5999){
                availableDiscounts = 0.79;
            }
            else if (acumulativeCost>59999.99){
                availableDiscounts = 0.49;
            }
            else if (acumulativeCost>100000)
            {
               availableDiscounts = 0.39;
               System.out.println("certifiaction!");
            }
        }

        return availableDiscounts;
    }
    double getAcumulativeCost(){
        return acumulativeCost;
    }
    double getAvailableDiscounts(){
        return availableDiscounts;
    }




}
