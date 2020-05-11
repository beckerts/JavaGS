package piperpark;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class CalculatorTest 
{
    /**
     * add zero to a positive number
     */
    @Test
    public void addPositivePlusZero()
    {
        int addend1 = 2;
        int addend2 = 0;
        additionTestHelper(addend1, addend2);
    }

    /**
     * add zero to a negative number
     */
    @Test
    public void addNegativePlusZero()
    {
        int addend1 = -2;
        int addend2 = 0;
        additionTestHelper(addend1, addend2);
    }

    /**
     * add two positive numbers
     */
    @Test
    public void addTwoPositiveNumbers()
    {
        int addend1 = 2;
        int addend2 = 3;
        additionTestHelper(addend1, addend2);
    }

    /**
     * add positive number to negative number
     */
    @Test
    public void addPositiveToNegativeNumber()
    {
        int addend1 = -2;
        int addend2 = 3;
        additionTestHelper(addend1, addend2);
    }

    /**
     * add negative number to positive number
     */
    @Test
    public void addNegativeToPositiveNumber()
    {
        int addend1 = 2;
        int addend2 = -3;
        additionTestHelper(addend1, addend2);
    }

    /**
     * add two negative numbers
     */
    @Test
    public void addTwoNegativeNegativeNumber()
    {
        int addend1 = -2;
        int addend2 = -3;
        additionTestHelper(addend1, addend2);
    }

    private void additionTestHelper(int addend1, int addend2) {
        int expectedValue = addend1 + addend2;
        int actualValue = Calculator.add(addend1, addend2);
        
        assertEquals(expectedValue, actualValue);
    }

}