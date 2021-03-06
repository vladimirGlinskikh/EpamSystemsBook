package application_1.calculation;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class ScholarshipCalculatorTest2 {
    private static ScholarshipCalculatorImpl scholarshipCalculator;

    @BeforeClass
    public static void initScholarshipCalculator() {
        scholarshipCalculator = new ScholarshipCalculatorImpl();
    }

    @Test(expected = NotSuchMarkException.class)
    public void stepUpCoefficientForFiveTest() throws NotSuchMarkException {
        double expected = 1.5;
        double actual = scholarshipCalculator.stepUpCoefficientCalculate(5);
        assertEquals("Coefficient for mark 5 is wrong: ", expected, actual, 0.01);
    }

    @Test(expected = NotSuchMarkException.class)
    public void stepUpCoefficientThreeTest() throws NotSuchMarkException {
        double expected = 1;
        double actual = scholarshipCalculator.stepUpCoefficientCalculate(3);
        assertEquals("Coefficient for mark 3 is wrong: ", expected, actual, 0.01);
    }

    @Test
    public void stepUpCoefficientElevenTest() {
        int averageMark = 11;
        try {
            scholarshipCalculator.stepUpCoefficientCalculate(averageMark);
            fail("Test for mark " + averageMark + " should have thrown a NotSuchMarkException");
        } catch (NotSuchMarkException e) {
            Assert.assertEquals("There is no mark: " + averageMark, e.getMessage());
        }
    }
}
