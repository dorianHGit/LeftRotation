package test;

import main.Solution;
import org.junit.*;

import static org.junit.Assert.assertEquals;

public class TestSolution {

    private Solution solution;

    @Before
    public void setUp(){
       solution = new Solution();
    }

    @Test
    public void testCaseArrayOfFiveFourRotations(){
        int[] expectedArray = {5,1,2,3,4};
        int[] inputArray = {1,2,3,4,5};
        assertEquals(expectedArray, solution.rotLeft(inputArray, 4));
    }

    @Test
    public void testCaseArrayOfTwentyTenRotations(){
        int[] expectedArray = {77, 97, 58, 1, 86, 58, 26, 10, 86, 51, 41, 73, 89, 7, 10, 1, 59, 58, 84, 77};
        int[] inputArray = {41, 73, 89, 7, 10, 1, 59, 58, 84, 77, 77, 97, 58, 1, 86, 58, 26, 10, 86, 51};
        assertEquals(expectedArray, solution.rotLeft(inputArray, 10));
    }

    @Test
    public void testCaseArrayOfFifteenThirteenRotations(){
        int[] expectedArray = {87, 97, 33, 47, 70, 37, 8, 53, 13, 93, 71, 72, 51, 100, 60};
        int[] inputArray = {33, 47, 70, 37, 8, 53, 13, 93, 71, 72, 51, 100, 60, 87, 97};
        assertEquals(expectedArray, solution.rotLeft(inputArray, 13));
    }
}
