package application_1.calculation;

import org.junit.Assert;
import org.junit.Test;

public class ScholarshipCalculateTest {
    @Test
    public void scholarshipCalculateTest() {
        IscholarshipCalculator scholarshipCalculator =
                new ScholarshipCalculatorImpl();
        double basicScholarship = ScholarshipCalculatorImpl.BASIC_SCHOLARSHIP;
        double stepUpCoefficient = 1.1;
        double expected = basicScholarship * stepUpCoefficient;
        double actual = scholarshipCalculator.scholarshipCalculate(stepUpCoefficient);

        Assert.assertEquals(expected, actual, 0.01);

    }
}
