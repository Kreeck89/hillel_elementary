package lesson22.dao;

import org.apache.log4j.Logger;

public class CalculatorDaoImpl implements CalculatorDao {
    Logger logger = Logger.getLogger(CalculatorDaoImpl.class);

    @Override
    public void saveResult(int result) {
        logger.debug(String.format("saveResult: result = %d", result));
        //validation
        //init save logic
    }
}
