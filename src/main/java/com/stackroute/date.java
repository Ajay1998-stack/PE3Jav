package com.stackroute;


import java.text.SimpleDateFormat;
import java.util.Calendar;

public class date {
    public static void main(String[] args) {
        Calendar c= Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("EEE dd/MM/yyyy");
        StringBuilder sb= new StringBuilder();
        c.set(Calendar.DAY_OF_WEEK,Calendar.MONDAY);
        sb.append(sdf.format(c.getTime()));
        sb.append("\t");
        c.add(Calendar.DATE,6);
        sb.append(sdf.format(c.getTime()));
        System.out.println(sb.toString());
    }
}
