package application_1.calculation;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class ScholarshipCalculatorTestTime {
    private static ScholarshipCalculatorImpl scholarshipCalculator;

    @BeforeClass
    public static void initScholarshipCalculator() {
        scholarshipCalculator = new ScholarshipCalculatorImpl();
    }

    @Ignore("this test is not ready yet")
    @Test(timeout = 50)
    public void scholarshipCalculateTest() {
        for (int i = 1; i < 100_000; i++) {
            double stepUpCoefficient = 1 / i;
            double expected = 100 * stepUpCoefficient;
            double actual = scholarshipCalculator.scholarshipCalculate(stepUpCoefficient);
            Assert.assertEquals(expected, actual, 0.01);
        }
    }
}
