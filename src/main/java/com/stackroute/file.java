package com.stackroute;

import java.io.*;

public class file {

    public static void main(String[] args) {

        try{
            File f = new File("src/main/java/com/stackroute/textfile.txt");
            System.out.println(f.length());
            BufferedReader br = new BufferedReader(new FileReader(f));
            String str;
            while((str= br.readLine())!= null)
            {
                System.out.println(str.toUpperCase());
            }

        }
        catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }

    }


}
