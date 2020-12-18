package lesson22.services;

import org.apache.log4j.Logger;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InfoDataServiceImpl implements InfoDataService {
    Logger logger = Logger.getLogger(InfoDataServiceImpl.class);

    private CalculatorService service;

    public InfoDataServiceImpl() {
        service = new CalculatorServiceImpl();
    }

    @Override
    public int enterDataForCalculate() {
        logger.debug("enterDataForCalculate method.");
        System.out.println("Enter two digits for calculate:");
        System.out.println("first:");

        try {
            Scanner scanner = new Scanner(System.in);
            int first = scanner.nextInt();

            System.out.println("second:");
            int second = scanner.nextInt();

            System.out.println("Enter type of calculate:\n" +
                    "1 - for sum\n" +
                    "2 - for difference\n" +
                    "3 - for multiplication\n" +
                    "4 - for division");

            int type = scanner.nextInt();
            int result = 0;
            switch (type) {
                case 1:
                    result = service.sum(first, second);
                    break;
                case 2:
                    result = service.difference(first, second);
                    break;
                case 3:
                    result = service.multiplication(first, second);
                    break;
                case 4:
                    result = service.division(first, second);
                    break;
                default:
                    System.out.println("Impossible type");
                    break;
            }
            return result;
        } catch (InputMismatchException e) {
            logger.error("enterDataForCalculate: wrong format value", e);
            throw e;
        }
    }
}
