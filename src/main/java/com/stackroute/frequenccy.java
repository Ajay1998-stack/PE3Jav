package com.stackroute;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class frequenccy {
    public static void main(String[] args) throws IOException {
        File file = new File("FileDemo.txt");
        FileOutputStream fos= new FileOutputStream(file);
        DataOutputStream dos= new DataOutputStream(fos);
        dos.writeUTF("i am a man ,\n" +
                "i like to sleep ,\n" +
                "i have a home");

        FileReader reader= new FileReader(file);
        BufferedReader br = new BufferedReader(reader);
        StringBuilder  sb = new StringBuilder();
        String s1;
        while ((s1= br.readLine()) != null){
            sb.append(s1+" ");
        }
        String[] allwords = sb.toString().split("[,\\s]+");
        List<String> unique = new ArrayList<String >();
        unique.add(allwords[0]);
        for(String temp:allwords){
            if(!unique.contains(temp)){
                unique.add(temp);
            }
        }
        for(String temp:unique){
            int count = 0;
            for(String temp2:allwords){
                if(temp.equals(temp2))
                    count++;
            }
            System.out.println(temp +"->"+count + " times");
        }



    }
}



