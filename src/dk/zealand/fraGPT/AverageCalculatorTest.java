package dk.zealand.fraGPT;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AverageCalculatorTest {

    private AverageCalculator averageCalculator;

    @BeforeEach
    public void setUp() {
        averageCalculator = new AverageCalculator();
    }

    @Test
    public void testEmptyCalculator() {
        assertEquals(0.0, averageCalculator.getAverage());
    }

    @Test
    public void testAddingSingleNumber() {
        averageCalculator.addNumber(5);
        assertEquals(5.0, averageCalculator.getAverage());
    }

    @Test
    public void testAddingMultipleNumbers() {
        averageCalculator.addNumber(5);
        averageCalculator.addNumber(10);
        averageCalculator.addNumber(15);
        assertEquals(10.0, averageCalculator.getAverage());
    }

    @Test
    public void testAddingZero() {
        averageCalculator.addNumber(0);
        assertEquals(0.0, averageCalculator.getAverage());
    }

    @Test
    public void testAddingNegativeNumbers() {
        averageCalculator.addNumber(-5);
        averageCalculator.addNumber(-10);
        averageCalculator.addNumber(-15);
        assertEquals(-10.0, averageCalculator.getAverage());
    }

    @Test
    public void testAverageAfterReset() {
        averageCalculator.addNumber(5);
        averageCalculator.addNumber(10);
        averageCalculator.addNumber(15);
        averageCalculator.addNumber(20);
        averageCalculator.addNumber(25);

        averageCalculator.addNumber(0); // Reset the calculator

        averageCalculator.addNumber(100);
        assertEquals(100.0, averageCalculator.getAverage());
    }

    @Test
    public void testAddingLargeNumbers() {
        averageCalculator.addNumber(Integer.MAX_VALUE);
        averageCalculator.addNumber(Integer.MAX_VALUE);
        averageCalculator.addNumber(Integer.MAX_VALUE);
        assertEquals((double) Integer.MAX_VALUE, averageCalculator.getAverage());
    }

    @Test
    public void testAddingFloatingPointNumbers() {
        averageCalculator.addNumber(2);
        averageCalculator.addNumber(3);
        averageCalculator.addNumber(4);
        assertEquals(3.0, averageCalculator.getAverage());
    }

    @Test
    public void testAddingMixedNumbers() {
        averageCalculator.addNumber(-5);
        averageCalculator.addNumber(10);
        averageCalculator.addNumber(0);
        averageCalculator.addNumber(15);
        averageCalculator.addNumber(-2);
        assertEquals(3.6, averageCalculator.getAverage(), 0.01); // Delta for floating point comparison
    }

    @Test
    public void testAddingLargeAndSmallNumbers() {
        averageCalculator.addNumber(1000);
        averageCalculator.addNumber(-500);
        averageCalculator.addNumber(750);
        averageCalculator.addNumber(-250);
        averageCalculator.addNumber(1250);
        assertEquals(650.0, averageCalculator.getAverage());
    }
}
