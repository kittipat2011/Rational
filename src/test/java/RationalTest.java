import org.junit.Assert;
import org.junit.Test;

public class RationalTest {
    @Test
    public void testAdd() {
        Rational x = new Rational();
        x.numerator = 1;
        x.denominator = 2;
        Rational y = new Rational();
        y.numerator = 1;
        y.denominator = 4;
        x.add(y);
        Assert.assertEquals(3, x.numerator);
        Assert.assertEquals(4, x.denominator);
    }
    @Test
    public void testSubtract() throws Rational.Illegal {
        Rational x = new Rational(1,2);
        Rational y = new Rational(1,4);
        x.subtract(y);
        Assert.assertEquals(1, x.numerator);
        Assert.assertEquals(4, x.denominator);
    }

    @Test
    public void testMultiply() throws Rational.Illegal {
        Rational x = new Rational(1,2);
        Rational y = new Rational(1,4);
        x.multiply(y);
        Assert.assertEquals(1, x.numerator);
        Assert.assertEquals(8, x.denominator);
    }

    @Test
    public void testDivide() throws Rational.Illegal {
        Rational x = new Rational(1,2);
        Rational y = new Rational(1,4);
        x.divide(y);
        Assert.assertEquals(2, x.numerator);
        Assert.assertEquals(1, x.denominator);
    }
    @Test
    public void testEquals() throws Rational.Illegal {
        Rational x = new Rational(1,2);
        Rational y = new Rational(1,2);
        Assert.assertEquals(true,x.equals(y));
    }

}
