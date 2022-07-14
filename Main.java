package com.itfactory;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static void main(String[] args) {
        Queue<Integer> bol = new LinkedList<>();
        bol.add(1);
        bol.add(2);
        bol.add(3);
        bol.add(4);
        bol.add(5);
        bol.add(6);
        bol.add(7);
        bol.add(8);
        bol.add(9);
        bol.add(10);
        bol.add(11);
        bol.add(12);
        bol.add(13);
        bol.add(14);
        bol.add(15);
        bol.add(16);
        bol.add(17);
        bol.add(18);
        bol.add(19);
        bol.add(20);

        Stack<Integer> numarExtras = new Stack<>();
        numarExtras.push(1);
        numarExtras.push(2);
        numarExtras.push(3);
        numarExtras.push(4);
        numarExtras.push(5);

         if(numarExtras.isEmpty()|| !bol.isEmpty()){
             Integer bolDeGolit = numarExtras.pop();
             System.out.println(bolDeGolit);
             while(!(bolDeGolit == 0)){
                 int i =0;
                 while( i < bolDeGolit){
                     System.out.println(bol.poll().intValue());
                     i++;
                 }
                 if(bolDeGolit==1){
                     break;
                 }
                 bolDeGolit= bolDeGolit-1;
                 System.out.println(numarExtras.pop());
             }
                System.out.println("Stack este gol");
         }else{
                System.out.println("Queue este gol");
         }
    }
}

