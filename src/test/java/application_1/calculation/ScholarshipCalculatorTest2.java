package application_1.calculation;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class ScholarshipCalculatorTest2 {
    private static ScholarshipCalculatorImpl scholarshipCalculator;

    @BeforeClass
    public static void initScholarshipCalculator() {
        scholarshipCalculator = new ScholarshipCalculatorImpl();
    }

    @Test
    public void stepUpCoefficientForFiveTest() {
        double expected = 1.5;
        double actual = scholarshipCalculator.stepUpCoefficientCalculate(5);
        assertEquals("Coefficient for mark 5 is wrong: ", expected, actual, 0.01);
    }

    @Test
    public void stepUpCoefficientThreeTest() {
        double expected = 1;
        double actual = scholarshipCalculator.stepUpCoefficientCalculate(3);
        assertEquals("Coefficient for mark 3 is wrong: ", expected, actual, 0.01);
    }
}
