public class CalculatorApp {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int a = 20;
        int b = 33;

        boolean isEven = calc.isEven(a);
        System.out.println("Czy " + a + " jest liczbą parzystą? " + isEven);
        isEven = calc.isEven(b);
        System.out.println("Czy " + b + " jest liczbą parzystą? " + isEven);

        boolean isOdd = calc.isOdd(a);
        System.out.println("Czy " + a + " jest liczbą nieparzystą? " + isOdd);
        isOdd = calc.isOdd(b);
        System.out.println("Czy " + b + " jest liczbą nieparzystą? " + isOdd);

        double r = 4.52;
        double circleField = calc.circleField(r);
        System.out.println("Pole koła o promieniu " + r + " wynosi " + circleField);

        int c = 11;
        int power = calc.power(c);
        System.out.println("Liczba " + c + " podniesiona do kwadratu wynosi " + power);
    }
}
