package com.stackroute;

public class exception {
    static class NewException extends Exception{
        public NewException(String msg){
            super(msg);
        }
    }
    public static void main(String[] args) {
        try{

            throw new NewException("messagfe");
        }
        catch (NewException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("i am in final");
        }
    }
}
