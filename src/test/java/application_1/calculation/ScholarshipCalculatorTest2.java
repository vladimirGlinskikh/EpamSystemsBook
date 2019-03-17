package application_1.calculation;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ScholarshipCalculatorTest2 {
    private ScholarshipCalculatorImpl scholarshipCalculator;

    @Before
    public void initScholarshipCalculator() {
        scholarshipCalculator = new ScholarshipCalculatorImpl();
    }

    @After
    public void clearScholarshipCalculator() {
        scholarshipCalculator = null;
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
