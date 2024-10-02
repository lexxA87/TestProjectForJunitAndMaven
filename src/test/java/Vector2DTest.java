import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class Vector2DTest {

    private final double DELTA = 1e-9;
    private static Vector2D v;

    @BeforeClass
    public static void createNewVector2D() {
        v = new Vector2D();
    }

    @Test
    public void getLengthShouldBeZero() {
        //Vector2D v = new Vector2D();

        // 1e-9 = 0.0000000001
        Assert.assertEquals(0, v.getLength(), DELTA);
    }

    @Test
    public void xShouldBeZero() {
        //Vector2D v = new Vector2D();

        Assert.assertEquals(0, v.getX(), DELTA);
    }

    @Test
    public void yShouldBeZero() {
        //Vector2D v = new Vector2D();

        Assert.assertEquals(0, v.getY(), DELTA);
    }
}
