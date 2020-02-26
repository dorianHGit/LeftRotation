package main;

public class Solution {

    public Solution(){}

    /**
     * Rotates an array by a given number of elements using a Juggling Algorithm
     * @param a the array
     * @param d the number of elements to rotate by
     * @return the rotated array
     */
    public int[] rotLeft(int[] a, int d) {
        constraintCheck(a, d);
        int n = a.length;
        int gcd = gcdByEuclid(d, n);
        int temp, j, k; //Temporary int storage

        for(int i = 0; i < gcd; i++){
            integerCheck(a[i]);
            temp = a[i];
            j = i;
            while (true) {
                k = j + d;
                if (k >= n){
                    k = k - n;
                }
                if (k == i) {
                    break;
                }
                integerCheck(a[j]);
                integerCheck(a[k]);
                a[j] = a[k];
                j = k;
            }
            a[j] = temp;
        }
        return a;
    }

    private void integerCheck(int i) {
        if(i > Math.pow(10, 6) || i < 1){
            throw new IllegalArgumentException("Items in the array must be integers between 1 and 10^6");
        }
    }

    /**
     * Finds the greatest common divisor via Euclid's algorithm.
     * @param d
     * @param length
     * @return greatest common divisor.
     */
    private int gcdByEuclid(int d, int length) {
        if(length == 0){
            return d;
        }
        return gcdByEuclid(length, d % length);
    }

    private void constraintCheck(int[] a, int d){
        if(a.length < 1){
            throw new IllegalArgumentException("You cannot submit an empty array");
        }
        if(a.length > (int)Math.pow(10,5)) {
            throw new IllegalArgumentException("Submitted arrays must be smaller than 10 to the power of 5.");
        }
        if(d < 1){
            throw new IllegalArgumentException("You cannot perform less than one rotation.");
        }
        if(d > a.length){
            throw new IllegalArgumentException("You cannot perform more rotations than that equivalent to the length of the array.");
        }
    }

}
