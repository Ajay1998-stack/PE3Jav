package com.stackroute;

public class allExceptions {
    static int n=-2;
    static int[] arr = new int[5];
    static allExceptions obj = null;

    public static void main(String[] args) {
        try{
            int[] array = new int[n];
        arr[6] = 3;
        obj.hashCode();
        }
        catch(NegativeArraySizeException e){
            System.out.println("inside NegativeArrayExp");
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("inside IndexOutOfBoundsException");
        }
        catch(NullPointerException e){
            System.out.println("inside NullPointerException");
        }

    }

}
