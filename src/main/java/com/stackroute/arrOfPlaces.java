package com.stackroute;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class arrOfPlaces {
    public static void main(String[] args) {
        ArrayList<String> places = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter places");
        try{
        while (sc.hasNext()){
            String str= sc.next();
            places.add(str);
            if (str.equals("0"))
                break;;
        }

        if(places.size()!=0){
            System.out.println("gvfhgfbh");
            List<String> qwe = new ArrayList<String>();
            for(String str:places){
                qwe.add(str.replaceAll("(a|e|i|o|u)",""));
            }
            System.out.println(qwe.toString());


        }
        else throw new Exception();
        }
        catch (Exception e){
            System.out.println("error ra bhai");
        }


    }
}
