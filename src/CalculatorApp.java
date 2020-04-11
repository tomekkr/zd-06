public class CalculatorApp {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int a = 20;
        int b = 33;

        boolean result = calc.isEven(a);
        System.out.println("Czy " + a + " jest liczbą parzystą? " + result);
        result = calc.isEven(b);
        System.out.println("Czy " + b + " jest liczbą parzystą? " + result);

        result = calc.isOdd(a);
        System.out.println("Czy " + a + " jest liczbą nieparzystą? " + result);
        result = calc.isOdd(b);
        System.out.println("Czy " + b + " jest liczbą nieparzystą? " + result);
    }
}
