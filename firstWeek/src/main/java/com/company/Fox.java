package com.company;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Fox {

    public boolean isWearCoat;
    public boolean hasTorch;
    public String coatColor;
    public int bagCount;
public String name;

    public static void main(String[] args) {
        /*
        boolean fox1WearsCoat = true;
        boolean fox2WearsCoat = true;
        boolean fox3WearsCoat = true;
        boolean fox4WearsCoat = false;

        boolean fox1HasATorch = true;
        boolean fox2HasATorch = true;
        boolean fox3HasATorch = true;
        boolean fox4HasATorch = true;

        String fox1CoatColor = "BLACK";
        String fox2CoatColor = "BLACK";
        String fox3CoatColor = "BLACK";
        String fox4CoatColor = "GRAY";

        int fox1BagCount = 0;
        int fox2BagCount = 2;
        int fox3BagCount = 3;
        int fox4BagCount = 3;


         */

        Fox fox1 = new Fox(true, true, "BLACK", 0,"fox1");
        Fox fox2 = new Fox(true, true, "BLACK", 2,"fox2");
        Fox fox3 = new Fox(true, true, "BLACK", 3,"fox3");
        Fox fox4 = new Fox(false, true, "GRAY", 4,"fox4");
        List<Fox> list= Arrays.asList(fox1,fox2,fox3,fox4);
String result="";
        for (Fox each : list) {
            if(each.getCoatColor().equalsIgnoreCase("Black")
                    &&each.hasTorch==true&&each.isWearCoat()==true&&each.getBagCount()==3){
                result="Thief fox is "+each.getName();


            }else{
             result=   each.getName()+" is cleared of caharges";
            }
            System.out.println(result);

            //fox1 is cleared of caharges
            //fox2 is cleared of caharges
            //Thief fox is fox3
            //fox4 is cleared of caharges
        }

    }


}
/**
 * We have a fox group consists of 4 foxes. Unfortunately one of them stole an egg from chicken barn.
 * Luckily guard rooster have some info to identify the guilty fox.
 * Sheriff Dog got the info from the rooster. Sheriff Dog announced that;
 * thief fox had a black coat, a torch and 3 bags.
 * Find the suspect foxes, if a fox is cleared of charges write that also
 */