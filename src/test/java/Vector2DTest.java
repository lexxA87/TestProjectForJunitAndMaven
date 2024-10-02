import org.junit.Assert;
import org.junit.Test;

public class Vector2DTest {

    @Test
    public void getLengthShouldBeZero() {
        Vector2D v = new Vector2D();

        // 1e-9 = 0.0000000001
        Assert.assertEquals(0, v.getLength(), 1e-9);
    }

    @Test
    public void xShouldBeZero() {
        Vector2D v = new Vector2D();

        Assert.assertEquals(0, v.getX(), 1e-9);
    }

    @Test
    public void yShouldBeZero() {
        Vector2D v = new Vector2D();

        Assert.assertEquals(0, v.getY(), 1e-9);
    }
}
