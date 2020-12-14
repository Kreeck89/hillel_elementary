package lesson21;

public class Main {
    public static void main(String[] args) {
//        Calculate calculate = new Calculate();
//        int result = calculate.calculate(10, 20);
//        System.out.println("result: " + result);

        StringHelper stringHelper = new StringHelper();
        boolean hello = stringHelper.check(null, 2);
        System.out.println("hello: " + hello);
    }
}
