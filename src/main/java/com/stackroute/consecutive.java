package com.stackroute;

import java.util.ArrayList;
import java.util.*;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static java.lang.Integer.compare;

public class consecutive {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers in a line");
        try{
        String str = sc.next();
        String[] ser = new String[str.split(",",0).length];
        ser = str.split(",",0);
//        for(String q:ser){
//            System.out.print(q);
//        }
            ArrayList<Integer> diff = new ArrayList<Integer>();
            for(int i=0;i<ser.length -1;i++){
                int d= Integer.parseInt(ser[i+1])-Integer.parseInt(ser[i]);
                diff.add(d);
            }

            List<Integer> newlist = diff.stream().distinct().collect(Collectors.toList());

            if(newlist.size()>1){
                System.out.println("non consecutive");
            }
            else
                System.out.println("consecutive");

        }
        catch (Exception e){
            System.out.println("error ra bhai");
        }
    }
}
