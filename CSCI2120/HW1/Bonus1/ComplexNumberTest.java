package HW1.Bonus1;

import static org.junit.Assert.*;
import org.junit.*;

/**
 * Class tests addition, subtraction, multiplication, division to get a complex number
 *
 * @author Ivan Zelenkov
 * @version 1.0
 * @since Feb 15, 2021
 */
public class ComplexNumberTest {

    ComplexNumber number1, number2, number3, number4, number5, number6, number7, number8, number9, number10;
    ComplexNumber sum1, sum2, sum3, sum4, sum5, sum6, sum7, sum8, sum9, sum10;

    /**
     * Method setup two float numbers as arguments into object of ComplexNumber class
     */
    @Before
    public void setup() {
        // put as a first argument, object of RealNumber which have own float argument and second float argument is an imaginary part
        number1 = new ComplexNumber(new RealNumber(10), 3);
        number2 = new ComplexNumber(new RealNumber(9), 8);
        number3 = new ComplexNumber(new RealNumber(5), -7);
        number4 = new ComplexNumber(new RealNumber(4), -3);
        number5 = new ComplexNumber(new RealNumber(0), 0);
        number6 = new ComplexNumber(new RealNumber(1), -10);
        number7 = new ComplexNumber(new RealNumber(-11), -11);
        number8 = new ComplexNumber(new RealNumber(2), 7.7f);
        number9 = new ComplexNumber(new RealNumber(-8), 5);
        number10 = new ComplexNumber(new RealNumber(0), -5);
    }

    /**
     * Method add arguments of two objects among themselves.
     * Each object contains two arguments of type float and assign the result to the sum(1-10) object.
     * After that, the result of the complex number is checked for validity.
     */
    @Test
    public void testAdd() {
        sum1 = number1.add(number2);
        sum2 = number2.add(number3);
        sum3 = number3.add(number4);
        sum4 = number4.add(number5);
        sum5 = number1.add(number5);
        sum6 = number5.add(number6);
        sum7 = number6.add(number7);
        sum8 = number7.add(number8);
        sum9 = number8.add(number9);
        sum10 = number9.add(number10);
        //String is an Object in java, so it falls into that category of comparison rules.
        //JUnit calls the .equals() method to determine equality in the method assertEquals(Object o1, Object o2).
        assertEquals("19.0 + 11.0i", sum1.toString());
        assertEquals("14.0 + 1.0i", sum2.toString());
        assertEquals("9.0 + -10.0i", sum3.toString());
        assertEquals("4.0 + -3.0i", sum4.toString());
        assertEquals("10.0 + 3.0i", sum5.toString());
        assertEquals("1.0 + -10.0i", sum6.toString());
        assertEquals("-10.0 + -21.0i", sum7.toString());
        assertEquals("-9.0 + -3.3i", sum8.toString());
        assertEquals("-6.0 + 12.7i", sum9.toString());
        assertEquals("-8.0 + 0.0i", sum10.toString());
    }

    /**
     * Method subtract arguments of two objects among themselves.
     * Each object contains two arguments of type float and assign the result to the sum(1-10) object.
     * After that, the result of the complex number is checked for validity.
     */
    @Test
    public void testSubtract() {
        sum1 = number1.subtract(number2);
        sum2 = number2.subtract(number3);
        sum3 = number3.subtract(number4);
        sum4 = number4.subtract(number5);
        sum5 = number1.subtract(number5);
        sum6 = number5.subtract(number6);
        sum7 = number6.subtract(number7);
        sum8 = number7.subtract(number8);
        sum9 = number8.subtract(number9);
        sum10 = number9.subtract(number10);
        //String is an Object in java, so it falls into that category of comparison rules.
        //JUnit calls the .equals() method to determine equality in the method assertEquals(Object o1, Object o2).
        assertEquals("1.0 + -5.0i", sum1.toString());
        assertEquals("4.0 + 15.0i", sum2.toString());
        assertEquals("1.0 + -4.0i", sum3.toString());
        assertEquals("4.0 + -3.0i", sum4.toString());
        assertEquals("10.0 + 3.0i", sum5.toString());
        assertEquals("-1.0 + 10.0i", sum6.toString());
        assertEquals("12.0 + 1.0i", sum7.toString());
        assertEquals("-13.0 + -18.7i", sum8.toString());
        assertEquals("10.0 + 2.7i", sum9.toString());
        assertEquals("-8.0 + 10.0i", sum10.toString());
    }

    /**
     * Method multiply arguments of two objects among themselves.
     * Each object contains two arguments of type float and assign the result to the sum(1-10) object.
     * After that, the result of the complex number is checked for validity.
     */
    @Test
    public void testMultiply() {
        sum1 = number1.multiply(number2);
        sum2 = number2.multiply(number3);
        sum3 = number3.multiply(number4);
        sum4 = number4.multiply(number5);
        sum5 = number1.multiply(number5);
        sum6 = number5.multiply(number6);
        sum7 = number6.multiply(number7);
        sum8 = number7.multiply(number8);
        sum9 = number8.multiply(number9);
        sum10 = number9.multiply(number10);
        //String is an Object in java, so it falls into that category of comparison rules.
        //JUnit calls the .equals() method to determine equality in the method assertEquals(Object o1, Object o2).
        assertEquals("66.0 + 107.0i", sum1.toString());
        assertEquals("101.0 + -23.0i", sum2.toString());
        assertEquals("-1.0 + -43.0i", sum3.toString());
        assertEquals("0.0 + 0.0i", sum4.toString());
        assertEquals("0.0 + 0.0i", sum5.toString());
        assertEquals("0.0 + 0.0i", sum6.toString());
        assertEquals("-121.0 + 99.0i", sum7.toString());
        assertEquals("62.7 + -106.7i", sum8.toString());
        assertEquals("-54.5 + -51.6i", sum9.toString());
        assertEquals("25.0 + 40.0i", sum10.toString());
    }

    /**
     * Method divide arguments of two objects among themselves.
     * Each object contains two arguments of type float an assign the result to the sum(1-10) object.
     * After that, the result of the complex number is checked for validity.
     */
    @Test
    public void testDivide() {
        sum1 = number1.divide(number2);
        sum2 = number2.divide(number3);
        sum3 = number3.divide(number4);
        sum4 = number4.divide(number5);
        sum5 = number1.divide(number5);
        sum6 = number5.divide(number6);
        sum7 = number6.divide(number7);
        sum8 = number7.divide(number8);
        sum9 = number8.divide(number9);
        sum10 = number9.divide(number10);
        //String is an Object in java, so it falls into that category of comparison rules.
        //JUnit calls the .equals() method to determine equality in the method assertEquals(Object o1, Object o2).
        assertEquals("0.8 + -0.4i", sum1.toString());
        assertEquals("-0.1 + 1.4i", sum2.toString());
        assertEquals("1.6 + -0.5i", sum3.toString());
        assertEquals("NaN + NaNi", sum4.toString());
        assertEquals("NaN + NaNi", sum5.toString());
        assertEquals("0.0 + 0.0i", sum6.toString());
        assertEquals("0.4 + 0.5i", sum7.toString());
        assertEquals("-1.7 + 1.0i", sum8.toString());
        assertEquals("0.3 + -0.8i", sum9.toString());
        assertEquals("-1.0 + -1.6i", sum10.toString());
    }
}
