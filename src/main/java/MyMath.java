public class MyMath {
    public static double divide(int number1, int number2) {
        if (number2 == 0)
            throw new ArithmeticException("Don't divide by zero!!!");

        return (double) number1 / number2;
    }
}
