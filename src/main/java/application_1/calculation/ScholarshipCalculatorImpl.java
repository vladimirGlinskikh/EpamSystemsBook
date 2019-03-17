package application_1.calculation;

public class ScholarshipCalculatorImpl implements IscholarshipCalculator {
    public static final double BASIC_SCHOLARSHIP = 100;

    @Override
    public double scholarshipCalculate(double stepUpCoefficient) {
        return BASIC_SCHOLARSHIP * stepUpCoefficient;
    }

    public double stepUpCoefficientCalculate(int averageMark) {
        double stepUpCoefficient;
        switch (averageMark) {
            case 3:
                stepUpCoefficient = 1;
                break;
            case 4:
                stepUpCoefficient = 1.3;
                break;
            case 5:
                stepUpCoefficient = 1.5;
                break;
            default:
                stepUpCoefficient = 0;
        }
        return stepUpCoefficient;
    }
}
