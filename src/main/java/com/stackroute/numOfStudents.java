package com.stackroute;

import java.util.Scanner;

public class numOfStudents
{
    private int numOfStudents;
    private int[] StuGrades;

    public void setNumOfStudents(int numOfStudents) {
        this.numOfStudents = numOfStudents;
    }

    public void setStuGrades(int[] stuGrades) {
        StuGrades = stuGrades;
    }

    public int getNumOfStudents() {
        return numOfStudents;
    }

    public int[] getStuGrades() {
        return StuGrades;
    }

    public static void main(String[] args ) throws Exception {
        System.out.println("Enter no of Students");
        Scanner sc= new Scanner(System.in);
        com.stackroute.numOfStudents obj = new numOfStudents();
        int n= sc.nextInt();
        obj.setNumOfStudents(n);
        int[] arr= new int[n];
        try{
        for(int i=0;i<n;i++) {
            System.out.println("Enter grade for Student"+" "+ i);
            int p= sc.nextInt();

            if(p>0 && p<100){
                arr[i] = p;
                System.out.println("okay.. Please enter next");
            }
            else throw new Exception();
         }
        }
        catch (Exception e){
            System.out.println(" Error ra Bhai");
        }
        obj.setStuGrades(arr);
    }
}
