package com.company;

/**
 * @author chen
 * @date 2018/9/18
 */
public class DebugLearn {



    public static void increment(){
        int a=3;
        int b=a+5;
        System.out.println("b VALUE IS "+" "+b);





    }

    public static void decrement(){
        int c=7;
        System.out.println(c);
        int d=c--;
        d=c--;
        System.out.println(d);



    }


    public static void main(String args[]){
        increment();
        decrement();


    }




}
