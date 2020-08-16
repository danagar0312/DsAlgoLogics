package com.assignments.leetcode.arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class PalindromeCodeVita {




    public static void main(String args[]) throws Exception {
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));



        String inputStr = reader.readLine();


//        System.out.println(inputStr);
//
//        System.out.println(palindromic(inputStr));

        ArrayList<String> list = palindromic(inputStr);

        for (String element : list) {
            System.out.println(element);
        }



    }

    public static ArrayList palindromic(String input){

        StringBuffer temp = new StringBuffer("");
//        int count = 0;
        StringBuffer outStr = new StringBuffer("");

        ArrayList<String> arrlist
                = new ArrayList<String>();

        for (int i = 0; i < input.length(); i++){

            temp.append(input.charAt(i));
//            System.out.println(input.charAt(i));
//            System.out.println(temp);

            if (temp.length() >= 2 && arrlist.size() < 2) {

//                System.out.println("size of array is " + arrlist.size());
                // Use StringBuffer class to reverse the string
                StringBuffer stf = new StringBuffer(temp);
                stf.reverse();
                // Compare substring wih reverse of substring
                if (stf.toString().compareToIgnoreCase(temp.toString()) == 0){
//                    System.out.println("the string is pallindrome");
                    outStr.toString().concat(temp.toString());
                    arrlist.add(temp.toString());
//                    System.out.println(arrlist.toString());
                    temp = new StringBuffer("");
                    i = i + temp.length();
//                    System.out.println("size of array after adding is " + arrlist.size());

                }
            }
            if(temp.length() >= 2 && arrlist.size() >= 2) {
                String allRemaining = "";
//                System.out.println("input.charAt(i) " + (i-1));
//                System.out.println("input.length()-1 " + (input.length()));
                int x = input.length();
                allRemaining = input.substring(i - 1,x);
//                input.charAt(input.length()-1);
                System.out.println(allRemaining);
                StringBuffer stf = new StringBuffer(allRemaining);
                stf.reverse();
                // Compare substring wih reverse of substring
                if (stf.toString().compareToIgnoreCase(allRemaining) == 0){
//                    System.out.println("the string is pallindrome");
                    outStr.toString().concat(allRemaining);
                    arrlist.add(allRemaining);
                    System.out.println(arrlist.toString());
                    temp = new StringBuffer("");
//                    System.out.println("size of array after adding is " + arrlist.size());
                    i = i + allRemaining.length();
                }

            }

        }

//        System.out.println(outStr.toString());

        return arrlist;

    }
}
