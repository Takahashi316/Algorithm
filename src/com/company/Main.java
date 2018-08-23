package com.company;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    Queue<Double> window;
    int size;
    double sum;

    public Main(int size){
      window=new LinkedList<>();
      this.size=size;
      sum=0;


    }

    public double next(int val){
      window.add((double)val);
      sum+=val;
      if(window.size()>size){
          sum-=window.remove();


      }
      return sum/(double)window.size();



    }


    public static void main(String[] args) {
	// write your code here
        int initializer=7;
        Main main=new Main(4);
        for(int i=0;i<9;i++){
            System.out.println(main.next(initializer++));


        }
    }
}
