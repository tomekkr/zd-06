public class Calculator {
    boolean isEven(int number) {
        return number % 2 == 0;
    }

    boolean isOdd(int number) {
        return number % 2 != 0;
    }

    double circleField(double r) {
        return Math.PI * Math.pow(r, 2.0); //pi*r^2
    }

    int power(int number) {
        return number * number;
    }
}
