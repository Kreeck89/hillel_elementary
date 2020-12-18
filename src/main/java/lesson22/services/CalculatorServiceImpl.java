package lesson22.services;

import lesson22.dao.CalculatorDao;
import lesson22.dao.CalculatorDaoImpl;
import org.apache.log4j.Logger;

public class CalculatorServiceImpl implements CalculatorService {
    Logger logger = Logger.getLogger(CalculatorServiceImpl.class);

    private CalculatorDao calculatorDao;

    public CalculatorServiceImpl() {
        calculatorDao = new CalculatorDaoImpl();
    }

    @Override
    public int sum(int first, int second) {
        logger.debug(String.format("sum: first = %d, second = %d", first, second));
        int result = first + second;
        calculatorDao.saveResult(result);
        return result;
    }

    @Override
    public int difference(int first, int second) {
        logger.debug(String.format("difference: first = %d, second = %d", first, second));
        int result = first - second;
        calculatorDao.saveResult(result);
        return result;
    }

    @Override
    public int multiplication(int first, int second) {
        logger.debug(String.format("multiplication: first = %d, second = %d", first, second));
        int result = first * second;
        calculatorDao.saveResult(result);
        return result;
    }

    @Override
    public int division(int first, int second) {
        logger.debug(String.format("division: first = %d, second = %d", first, second));

//        if (second == 0) {
//            return -1;
//        }

        try {
            int result = first / second;
            calculatorDao.saveResult(result);
            return result;
        } catch (ArithmeticException e) {
            logger.error(String.format("division: first = %d, second = %d", first, second), e);
            throw e;
        }
    }
}
