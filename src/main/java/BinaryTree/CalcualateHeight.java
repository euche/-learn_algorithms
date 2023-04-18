package BinaryTree;

public class CalcualateHeight {

    // Java program to find height
// of complete binary tree
// from total nodes.

    // The Math.Ceil Method returns the smallest integer that is greater than or equal to x
    // i.e ROUNDS UP to the NEAREST INTEGER
    static int height(int N)
    {
        return (int)Math.ceil(Math.log(N + 1) / Math.log(2)) - 1;
    }

    // Driver Code
    public static void main(String[] args)
    {
        int N = 800;
        System.out.println(height(N));
    }
       //Answer is 9;
}
