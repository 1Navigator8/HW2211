package org.example.lesson21_11;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class PalindromeIterator {
    public static void main(String[] args) {
        String s = ""; //"dovod";//word//kayak
        //    System.out.println(s);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string or number to check if it is a palindrome");
        s = scanner.nextLine();

        List<Character> list = new LinkedList<>();


        for (int left = 0, right = s.length() - 1; left < right; left++, right--) {
            list.add(s.charAt(left));


            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {

                System.out.println("the words : " + s + " -> not a Palindrome");
            } else
                System.out.println("the words : " + s + " ->  Palindrome !");break;
        }
        System.out.println("**********");

        String str = "word";

        LinkedList<Character> slist = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            slist.add(str.charAt(i));
            System.out.println(slist);
        }

        ListIterator<Character> iterator = slist.listIterator();
        ListIterator<Character> reverse = slist.listIterator(list.size());

        boolean getPalindrom = true;

        while (iterator.hasNext() && reverse.hasPrevious()) {

            if (iterator.next() .equals (reverse.previous())) {
                getPalindrom = false;
                break;

            }

        }
        if (getPalindrom)
        System.out.println("the words : " + str + " ->  Palindrome !");

        else System.out.println("the words : " + str + " -> not a Palindrome !");
    }
}








