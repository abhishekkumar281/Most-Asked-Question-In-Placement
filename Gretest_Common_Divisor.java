package INTERVIEWQUETION;

import java.io.*;

public class Gretest_Common_Divisor {
    static int gcd(int a, int b)
    {
        int result = Math.min(a, b);
        while (result > 0) {
            if (a % result == 0 && b % result == 0) {
                break;
            }
            result--;
        }
        return result;
    }

    public static void main(String[] args)
    {
        int a = 98, b = 56;
        System.out.print("GCD of " + a + " and " + b
                + " is " + gcd(a, b));
    }
}

