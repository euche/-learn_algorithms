package Recursion;

public class GreatestCommonDivisor {
    //  GCD Question
    // I employed the fastest way to find gcd, using Euclidean algorithm
    public int gcd(int a, int b) {
        if (b == 0) {  //step 2
            return a;
        }

        if (a < 0 || b < 0) {
            return -1;
        }


        return gcd(b, a % b);// step 1
    }

}
