package Recursion;

public class PowerofNum {

    public int powerOfNum(int base, int exp) {
        if (exp == 0) { //step 2
            return 1;
        }
        return base * powerOfNum(base, exp - 1); //step 1

    }

}
