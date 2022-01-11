package com.company.day5.Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>();

        //Instantiate and add
        intList.add(new Integer(2));

        //Instantiate and add
        Integer myInt = new Integer(4);

        //Instantiate with auto-boxing
        Integer newInt = 8;
        intList.add(newInt);

        System.out.println("Printing toString()");
        System.out.println(intList);

        for(int i = 0; i < intList.size(); i++){
            System.out.println("The element at position " + i + " is " + intList.get(i));
        }

        Iterator<Integer> iterator = intList.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
