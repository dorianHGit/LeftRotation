package main;

public class Solution {

    public Solution(){}

    public int[] rotLeft(int[] a, int d) {
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
        return a;
    }

}
