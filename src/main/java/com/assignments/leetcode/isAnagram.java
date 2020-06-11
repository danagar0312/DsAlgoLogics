package com.assignments.leetcode;

public class isAnagram {

    public static void main(String args[]){
        Boolean x = isAnagram("ANAGRAM", "NAGARAM");
        System.out.println(x);
    }

    public static boolean isAnagram(String s, String t) {

        int[] alphabet = new int[26];
            for (int i = 0; i < s.length() ; i++){
                alphabet[s.charAt(i) - 'a']++;
            }
            for (int i = 0; i < t.length() ; i++){
            alphabet[t.charAt(i) - 'a']++;
            }


        return true;

    }
}
