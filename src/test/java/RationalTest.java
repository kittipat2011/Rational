import org.junit.Assert;
import org.junit.Test;

public class RationalTest {
    @Test
    public void testAdd1() {
        // Test Case 1: Both rational numbers are positive integers
        Rational x = new Rational();
        x.numerator = 3;
        x.denominator = 4;
        Rational y = new Rational();
        y.numerator = 2;
        y.denominator = 5;
        x.add(y);
        Assert.assertEquals(23, x.numerator);
        Assert.assertEquals(20, x.denominator);
    }
    @Test
    public void testAdd2(){
        // Test Case 2: Both rational numbers are negative integers
        Rational x = new Rational();
        Rational y = new Rational();
        x.numerator = -3;
        x.denominator = 4;
        y.numerator = -2;
        y.denominator = 5;
        x.add(y);
        Assert.assertEquals(-23,x.numerator);
        Assert.assertEquals(20,x.denominator);
    }
    @Test
    public void testAdd3(){
        // Test Case 3: One positive and one negative integer
        Rational x = new Rational();
        Rational y = new Rational();
        x.numerator = 3;
        x.denominator = 4;
        y.numerator = -2;
        y.denominator = 5;
        x.add(y);
        Assert.assertEquals(7,x.numerator);
        Assert.assertEquals(20,x.denominator);
    }
    @Test(expected = ArithmeticException.class)
    public void testAdd4(){
        // Test Case 4: Divide by zero
        Rational x = new Rational();
        Rational y = new Rational();
        x.numerator = 3;
        x.denominator = 0;
        y.numerator = -2;
        y.denominator = 0;
        x.add(y);
    }

    @Test
    public void testSubtract1(){
        // Test Case 1: Both rational numbers are positive integers
        Rational x = new Rational(3,4);
        Rational y = new Rational(2,5);
        x.subtract(y);
        Assert.assertEquals(7, x.numerator);
        Assert.assertEquals(20, x.denominator);
    }
    @Test
    public void testSubtract2(){
        // Test Case 2: Both rational numbers are negative integers
        Rational x = new Rational(-3,4);
        Rational y = new Rational(-2,5);
        x.subtract(y);
        Assert.assertEquals(-7, x.numerator);
        Assert.assertEquals(20, x.denominator);
    }
    @Test
    public void testSubtract3(){
        // Test Case 3: One positive and one negative integer
        Rational x = new Rational(3,4);
        Rational y = new Rational(-2,5);
        x.subtract(y);
        Assert.assertEquals(23, x.numerator);
        Assert.assertEquals(20, x.denominator);
    }
    @Test (expected = ArithmeticException.class)
    public void testSubtract4(){
        // Test Case 4: Divide by zero
        Rational x = new Rational(3,0);
        Rational y = new Rational(-2,0);
        x.subtract(y);
    }

    @Test
    public void testMultiply1() {
        // Test Case 1: Both rational numbers are positive integers
        Rational x = new Rational(3,4);
        Rational y = new Rational(2,5);
        x.multiply(y);
        Assert.assertEquals(3, x.numerator);
        Assert.assertEquals(10, x.denominator);
    }
    @Test
    public void testMultiply2() {
        // Test Case 2: Both rational numbers are negative integers
        Rational x = new Rational(-3,4);
        Rational y = new Rational(-2,5);
        x.multiply(y);
        Assert.assertEquals(3, x.numerator);
        Assert.assertEquals(10, x.denominator);
    }
    @Test
    public void testMultiply3() {
        // Test Case 3: One positive and one negative integer
        Rational x = new Rational(3,4);
        Rational y = new Rational(-2,5);
        x.multiply(y);
        Assert.assertEquals(-3, x.numerator);
        Assert.assertEquals(10, x.denominator);
    }
    @Test (expected = ArithmeticException.class)
    public void testMultiply4(){
        // Test Case 4: Divide by zero
        Rational x = new Rational(3,0);
        Rational y = new Rational(-2,0);
        x.multiply(y);
    }

    @Test
    public void testDivide1() {
        // Test Case 1: Both rational numbers are positive integers
        Rational x = new Rational(3,4);
        Rational y = new Rational(2,5);
        x.divide(y);
        Assert.assertEquals(15, x.numerator);
        Assert.assertEquals(8, x.denominator);
    }
    @Test
    public void testDivide2() {
        // Test Case 2: Both rational numbers are negative integers
        Rational x = new Rational(-3,4);
        Rational y = new Rational(-2,5);
        x.divide(y);
        Assert.assertEquals(15, x.numerator);
        Assert.assertEquals(8, x.denominator);
    }
    @Test
    public void testDivide3() {
        // Test Case 3: One positive and one negative integer
        Rational x = new Rational(3,4);
        Rational y = new Rational(-2,5);
        x.divide(y);
        Assert.assertEquals(-15, x.numerator);
        Assert.assertEquals(8, x.denominator);
    }
    @Test (expected = ArithmeticException.class)
    public void testDivide4(){
        // Test Case 4: Divide by zero
        Rational x = new Rational(3,0);
        Rational y = new Rational(-2,0);
        x.divide(y);
    }
    @Test
    public void testEquals1() {
        // Test Case 1: Both rational are equal
        Rational x = new Rational(1,2);
        Rational y = new Rational(2,4);
        Assert.assertEquals(x, y);
    }
    @Test
    public void testEquals2() {
        // Test Case 2: Both rational are not equal
        Rational x = new Rational(1,2);
        Rational y = new Rational(1,4);
        Assert.assertNotEquals(x,y);
    }
    @Test
    public void testCompareTo1() {
        // Test Case 1: Rational x is greater than rational y
        Rational x = new Rational(1,2);
        Rational y = new Rational(1,4);
        Assert.assertEquals(-1,x.compareTo(y));
    }
    @Test
    public void testCompareTo2() {
        // Test Case 2: Rational y is greater than rational x
        Rational x = new Rational(1,4);
        Rational y = new Rational(1,2);
        Assert.assertEquals(1,x.compareTo(y));
    }
    @Test
    public void testCompareTo3() {
        // Test Case 3: both rational are equal
        Rational x = new Rational(1,2);
        Rational y = new Rational(1,2);
        Assert.assertEquals(0,x.compareTo(y));
    }

}
