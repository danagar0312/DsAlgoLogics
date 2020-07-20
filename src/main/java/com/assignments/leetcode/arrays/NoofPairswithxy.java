package com.assignments.leetcode.arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NoofPairswithxy {

    // Function to return count of pairs with x as one element
    // of the pair. It mainly looks for all values in Y[] where
    // x ^ Y[i] > Y[i] ^ x
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int arr[] = new int[n];
            String[] s = br.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                arr[j] = Integer.parseInt(s[j]);
            }
            int a = 0;
            int b = 0;
            int c = 0;
            StringBuffer str = new StringBuffer();
            for (int j = 0; j < n; j++) {
                if (arr[j] == 0)
                    a++;
                else if (arr[j] == 1)
                    b++;
                else if (arr[j] == 2)
                    c++;
            }
            for (int j = 0; j < a; j++) {
                str.append(0);
                str.append(" ");
            }
            for (int j = 0; j < b; j++) {
                str.append(1);
                str.append(" ");
            }
            for (int j = 0; j < c; j++) {
                str.append(2);
                str.append(" ");
            }
            System.out.println(str);
        }
    }
}
