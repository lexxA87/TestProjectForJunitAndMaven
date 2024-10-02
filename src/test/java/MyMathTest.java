import org.junit.Test;

public class MyMathTest {

    @Test(expected = ArithmeticException.class)
    public void dividerZeroShouldThrowArithmeticException() {
        MyMath.divide(3, 0);
    }
}
