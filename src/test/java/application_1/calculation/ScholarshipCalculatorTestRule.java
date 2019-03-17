package application_1.calculation;

import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.TemporaryFolder;
import org.junit.rules.Timeout;

import java.io.File;
import java.io.IOException;

public class ScholarshipCalculatorTestRule {
    private static ScholarshipCalculatorImpl scholarshipCalculator;
    @Rule
    public final TemporaryFolder folder = new TemporaryFolder();
    @Rule
    public final Timeout timeout = new Timeout(1000);
    @Rule
    public final ExpectedException thrown = ExpectedException.none();

    @BeforeClass
    public static void initScholarshipCalculator() {
        scholarshipCalculator = new ScholarshipCalculatorImpl();
    }

    @Test
    public void writeResultTest() throws IOException {
        File file = folder.newFile("result.txt");
        scholarshipCalculator.writeResult(file);
    }

    @Test
    public void stepUpCoefficientCalculateTest() throws NotSuchMarkException {
        thrown.expect(NotSuchMarkException.class);
        scholarshipCalculator.stepUpCoefficientCalculate(11);
    }

    @Test
    public void writeResultTestTwo() throws IOException {
        thrown.expect(NullPointerException.class);
        scholarshipCalculator.writeResult(null);
    }
}
