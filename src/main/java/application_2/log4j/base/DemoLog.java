package application_2.log4j.base;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class DemoLog {
    static {
        new DOMConfigurator().doConfigure("src/main/resources/log/log4j.xml", LogManager.getLoggerRepository());
    }

    static Logger logger = Logger.getLogger(DemoLog.class);

    public static void main(String[] args) {
        try {
            factorial(9);
            factorial(-3);
        } catch (IllegalArgumentException e) {
            logger.error("negative argument: ", e);
        }
    }

    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("argument " + n + " less than zero");
        }
        logger.debug("Argument n is " + n);
        int result = 1;
        for (int i = n; i >= 1; i--) {
            result *= i;
        }
        logger.info("Result is " + result);
        return result;
    }
}
