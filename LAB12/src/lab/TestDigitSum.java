package lab;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestDigitSum {

    @Test
    public void testSumOfDigitsWithPositiveNumber() {
        int number = 12345;
        int result = DigitSum.sumOfDigits(number);
        assertEquals("The sum of digits of 12345 should be 15", 15, result);
    }

    @Test
    public void testSumOfDigitsWithNegativeNumber() {
        int number = -12345;
        int result = DigitSum.sumOfDigits(number);
        assertEquals("The sum of digits of -12345 should be 15", 15, result);
    }

    @Test
    public void testSumOfDigitsWithSingleDigit() {
        int number = 7;
        int result = DigitSum.sumOfDigits(number);
        assertEquals("The sum of digits of 7 should be 7", 7, result);
    }

    @Test
    public void testSumOfDigitsWithZero() {
        int number = 0;
        int result = DigitSum.sumOfDigits(number);
        assertEquals("The sum of digits of 0 should be 0", 0, result);
    }

    @Test
    public void testSumOfDigitsWithLargeNumber() {
        int number = 987654321;
        int result = DigitSum.sumOfDigits(number);
        assertEquals("The sum of digits of 987654321 should be 45", 45, result);
    }
}

