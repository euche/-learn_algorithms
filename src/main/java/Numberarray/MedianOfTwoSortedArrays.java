package Numberarray;

public class MedianOfTwoSortedArrays {

// Leetcode Problem: Medium
//    There are two sorted arrays A and B of size m and n respectively. Find the median of the
//    two sorted arrays. The overall run time complexity should be O(log (m+n)).

 // = Has a feel of FINDING THE Kth ELEMENT PROBLEM(A's length + B's length)/2

 public static double findMedianSortedArrays(int A[], int B[]){
     int m = A.length;
     int n = B.length;

     if((m + n) % 2!=0)  // it is odd
     return (double) findKth(A,B,(m + n) % 2,0, m - 1,0,n - 1);
     else{
         return ( findKth(A, B, (m + n) / 2, 0, m - 1, 0, n - 1) + findKth(A, B, (m + n) / 2-1, 0, m - 1, 0, n - 1)) * 0.5;
     }
 }

    public static int findKth(int[] a, int[] b, int k, int aStart, int aEnd, int bStart, int bEnd) {
      int aLen = aEnd - aStart + 1;
      int bLen = bEnd - bStart + 1;

        // Handle special cases
        if (aLen == 0)
            return b[bStart + k];
        if (bLen == 0)
            return b[aStart + k];
        if (k == 0)
            return Math.min(a[aStart], b[bStart]);
            //  return a[aStart] < b[bStart] ? a[aStart] : b[bStart];

        int aMid = aLen * k / (aLen + bLen); // a’s middle count
        int bMid = k - aMid - 1; // b’s middle count

        // make aMid and bMid to be array index
        aMid = aMid + aStart;
        bMid = bMid + bStart;
        if (a[aMid] > b[bMid]) {
            k = k - (bMid - bStart + 1);
            aEnd = aMid;
            bStart = bMid + 1;
        } else {
            k = k - (aMid - aStart + 1);
            bEnd = bMid;
            aStart = aMid + 1;
        }
        return findKth(a, b, k, aStart, aEnd, bStart, bEnd);
                //Steps
        // => 1) Calculate the medians m1 and m2 of the input arrays ar1[] and ar2[] respectively.
        //2) If m1 and m2 both are equal then we are done, and return m1 (or m2)
        // 3) If m1 is greater than m2, then median is present in one of the below two subarrays. a)
        //From first element of ar1 to m1 (ar1[0...|_n/2_|]) b) From m2 to last element of ar2(ar2[|_n/2_|...n-1])
        //5) Repeat the above process until size of
        //both the subarrays becomes 2. 6) If size of the two arrays is 2 then use below formula
        //to get the median. Median = (max(ar1[0], ar2[0]) + min(ar1[1], ar2[1]))/2
    }

    public static void main(String[] args){

    }
}
