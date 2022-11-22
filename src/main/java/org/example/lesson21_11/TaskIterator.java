package org.example.lesson21_11;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class TaskIterator {
    public static void main(String[] args) {
//        employeeServiceDemo();

        String[] strings = {
                "January",
                "February",
                "March"
        };

        ArrayIterator<String> iterator = new ArrayIterator<>(strings);

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

    static class ArrayIterator<TYPE> implements Iterator<TYPE> {

        private TYPE[] arr;
        private int pointer = 0;

        public ArrayIterator(TYPE[] arr) {
            this.arr = arr;
        }

        @Override
        public boolean hasNext() {
            return pointer < arr.length;
        }

        @Override
        public TYPE next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return arr[pointer++];
        }
    }


    }
