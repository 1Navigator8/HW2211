package org.example.lesson21_11;

import java.util.ArrayList;
import java.util.Iterator;

public class Lesson2111 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Ivan");
        arrayList.add("Boris");
        arrayList.add("Mikhail");
        arrayList.add("Maria");
        arrayList.add("Elena");
        arrayList.add("Ola");
        arrayList.add("Oksana");
        arrayList.add("Natalia");

        Iterator<String> iterator =arrayList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
