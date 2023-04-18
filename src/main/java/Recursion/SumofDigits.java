package Recursion;

public class SumofDigits {

    public int sumOfDigits(int n) {
        if (n < 0) { //step 3 constraints
            return 0;
        }

        if (n == 0) { // base condition
            return 0;
        }
        return n % 10 + sumOfDigits(n / 10);  // step 1 -find the recursive case
    }

}
