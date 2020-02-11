package test;

import main.Solution;
import org.junit.*;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class TestSolution {

    private Solution solution;

    @Before
    public void setUp(){
       solution = new Solution();
    }

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

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

    @Test
    public void assertEmptyArrayThrowsException(){
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("You cannot submit an empty array");
        int[] inputArray = new int[]{};
    }

    @Test
    public void assertArrayLargerThan10pow5ThrowsException(){
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Submitted arrays must be smaller than 10 to the power of 5.");
        int[] inputArray = new int[(int)Math.pow(10,5)+1];
    }

    @Test
    public void assertRotationLessThanOneThrowsException(){
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("You cannot perform less than one rotation.");
        int[] inputArray = {1,2,3,4,5};
        solution.rotLeft(inputArray, 0);
    }

    @Test
    public void assertRotationGreaterThanLengthThrowsException(){
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("You cannot perform more rotations than that equivalent to the length of the array.");
        int[] inputArray = {1,2,3,4,5};
        solution.rotLeft(inputArray, 6);
    }

    @Test
    public void assertArrayItemLessThanOneThrowsException(){
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Items in the array must be integers between 1 and 10^6");
        int[] inputArray = {0,2,3,4,5};
        solution.rotLeft(inputArray, 4);
    }

    @Test
    public void assertArrayItemGreaterThan10pow6ThrowsException(){
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Items in the array must be integers between 1 and 10^6");
        int[] inputArray = {(int)Math.pow(10,6)+1,2,3,4,5};
        solution.rotLeft(inputArray, 4);
    }
}
