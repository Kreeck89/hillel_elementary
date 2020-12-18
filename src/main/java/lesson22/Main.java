package lesson22;

import lesson22.services.CalculatorService;
import lesson22.services.CalculatorServiceImpl;
import lesson22.services.InfoDataService;
import lesson22.services.InfoDataServiceImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InfoDataService service = new InfoDataServiceImpl();
        int result = service.enterDataForCalculate();

        System.out.println("RESULT: " + result);
    }
}
