package com.stackroute;

public class chessBoard {
    public static void main(String[] args) {
        String[][] arr= new String[8][8];
        StringBuffer sbf1 = new StringBuffer("WW|");
        StringBuffer sbf2 = new StringBuffer("BB|");

        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                System.out.print(sbf1);
                String str = sbf1.toString();
                sbf1.replace(0,sbf1.length(),sbf2.toString());
                sbf2.replace(0,sbf2.length(),str);
            }
            System.out.println();
        }

    }
}
