package com.company.day5.Collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

    public static void main(String[] args){
        HashSet<Integer> intList = new HashSet<>();

        //Instantiate and add
        intList.add(new Integer(2));

        //Instantiate and add
        Integer myInt = new Integer(4);
        intList.add(myInt);

        System.out.println("Printing toString()");
        System.out.println(intList);


//        for(int i = 0; i < intList.size(); i++){
//            System.out.println("The element at position " + i + " is " + intList.get(i));
//        }

        Iterator<Integer> iterator = intList.iterator();
        while(iterator.hasNext()) System.out.println(iterator.next());
    }
}
