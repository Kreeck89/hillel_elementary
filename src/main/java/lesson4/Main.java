package lesson4;

import java.io.FileWriter;
import java.io.IOException;
import java.rmi.AccessException;
import java.rmi.MarshalException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Validator validator = new Validator();

        //Стандартное применение try-catch-finally
//        try {
//            validator.checkString("String");
//        } catch (AccessException e) {
////            e.printStackTrace();
//        } catch (MarshalException e) {
//            //тут может быть ошибка
////            e.printStackTrace();
////            System.out.println(e.getMessage());
////            throw e;
//        } finally {
//            System.out.println("finally prints always");
//        }
//        System.out.println("Finished!");

        //Пример try-catch без блока finally
        try {
            validator.checkString("string");
        } catch (AccessException | MarshalException e) {
            System.out.println("Catch error: " + e.getMessage());
        }

        //Пример использования блока finally и сложностей с закрытием потоков данных
//        final Scanner scan = new Scanner(System.in);
//        try {
//            System.out.println("Enter your name");
//            final String name = scan.nextLine();
//        } finally {
//            if (scan != null) {
//                scan.close();
//            }
//        }

        //Try(c ресурсами) - замена примера выше с закрытием потока. Тут закроется автоматически и отработает корректно
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter your surname");
            final String surname = scanner.nextLine();
        } catch (NoSuchElementException e) {
            System.out.println("soidnfosuoiwf");
        }

        //пример с catch Родительским классом ошибки
        try {
            validator.checkString("str");
        } catch (RemoteException e) {
            e.printStackTrace();
        } finally {

        }
    }
}
