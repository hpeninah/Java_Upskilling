package com.company.day5.Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

    public static void main(String[] args){
        LinkedList<Integer> intList = new LinkedList<>();

        //Instantiate and add
        intList.add(new Integer(2));

        //Instantiate and add
        Integer myInt = new Integer(4);
        intList.add(myInt);

        System.out.println("Printing toString()");
        System.out.println(intList);


        for(int i = 0; i < intList.size(); i++){
            System.out.println("The element at position " + i + " is " + intList.get(i));
        }

        Iterator<Integer> iterator = intList.iterator();
        while(iterator.hasNext()) System.out.println(iterator.next());
    }
}
