/* Given an integer, , perform the following conditional actions:

If  is odd, print Weird
If  is even and in the inclusive range of  to , print Not Weird
If  is even and in the inclusive range of  to , print Weird
If  is even and greater than , print Not Weird
Complete the stub code provided in your editor to print whether or not  is weird. */

package com.sushmita.day01;

import java.util.*;


public class IfElse {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();

        System.out.println("N is : " + N);

        if (N%2==1)
            System.out.println(N + " is Weird");
        else
        {
            if (N >=2 && N <= 5)
                System.out.println(N + " is Not Weird");
            else if (N >=6 && N <= 20)
                System.out.println(N + " is Weird");
            else
                System.out.println(N + " is Not Weird");
        }
    }
}
