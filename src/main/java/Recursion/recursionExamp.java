package Recursion;

public class recursionExamp {

    // just an example to understand Recursion
    static void openRussianDoll(int doll) {
        if (doll == 1) { //Base Condition
            System.out.println("All dolls are opened");
        } else {
            openRussianDoll(doll - 1);
        }
    }

    // learning Recursive function using factorial.
    public int factorial(int n) {
        if (n < 1) {
            return -1;
        }

        if (n == 0 || n == 1) { // base condition
            return 1;
        }
        System.out.println(n);
        return n * factorial(n - 1); // we are to include a base condition
    }

   public int fibonacci(int n){  //only viable for positive numbers
       if (n == 0 || n == 1) { // base condition
           return n;
       }

        return fibonacci(n-1)+fibonacci(n-2);
   }

    public static void main(String args[]){

    }


}
