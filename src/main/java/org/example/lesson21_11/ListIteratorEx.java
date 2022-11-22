package org.example.lesson21_11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorEx {
    public static void main(String[] args) {
        String s = "text";

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Ivan");
        linkedList.add("Boris");
        linkedList.add("Mikhail");
        linkedList.add("Maria");
        linkedList.add("Elena");
        linkedList.add("Ola");
        linkedList.add("Oksana");
        linkedList.add("Natalia");

        ListIterator<String> listIterator = linkedList.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
        System.out.println("***********");

        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }

    }
}