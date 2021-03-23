package HW1.Bonus1;

import java.util.Objects;

/**
 * A class which defines complex numbers
 *
 * @author Ivan Zelenkov
 * @version 1.0
 * @since Feb 15, 2021
 */
public class ComplexNumber {
    // The object of RealNumber class representing the real part of the complex number
    RealNumber realNumberObject;
    // The instance variable b representing the imaginary part of the complex number
    private float b;

    /**
     * Construct a complex number, which contains real number and imaginary number
     *
     * @param realNumberObject real number
     * @param b imaginary number
     */
    public ComplexNumber(RealNumber realNumberObject, float b) {
        this.realNumberObject = realNumberObject;
        this.b = b;
    }

    /**
     * Addition method
     *
     * @param otherNumber object of ComplexNumber, contain two numbers of type float
     * @return complex number after adding
     */
    public ComplexNumber add(ComplexNumber otherNumber) {
        ComplexNumber newComplex;
        // formula (a + c) + (b + d)
        // newA means the first part of the complex number
        // call accessor to get a real number from RealNumber class
        float newA = realNumberObject.getRealNumber() + otherNumber.getA();
        // newB means the second part of the complex number
        float newB = b + otherNumber.getB();
        // assign the result of newA and newB to the newComplex object
        newComplex = new ComplexNumber(new RealNumber(newA), newB);
        // returns the complex number
        return newComplex;
    }

    /**
     * Subtraction method
     *
     * @param otherNumber object of ComplexNumber, contain two numbers of type float
     * @return complex number after subtracting
     */
    public ComplexNumber subtract(ComplexNumber otherNumber) {
        ComplexNumber newComplex;
        // formula to get a complex number (a - c) + (b - d)
        // call accessor to get a real number from RealNumber class
        float newA = realNumberObject.getRealNumber() - otherNumber.getA();
        float newB = b - otherNumber.getB();
        newComplex = new ComplexNumber(new RealNumber(newA), newB);
        return newComplex;
    }

    /**
     * Multiplication method
     *
     * @param otherNumber object of ComplexNumber, contain two numbers of type float
     * @return complex number after multiplication
     */
    public ComplexNumber multiply(ComplexNumber otherNumber) {
        ComplexNumber newComplex;
        // formula to get a complex number (a*c + b*d) + (b*c + a*d)
        // call accessor to get a real number from RealNumber class
        float newA = (realNumberObject.getRealNumber() * otherNumber.getA() - b * otherNumber.getB());
        float newB = (b * otherNumber.getA() + realNumberObject.getRealNumber() * otherNumber.getB());
        newComplex = new ComplexNumber(new RealNumber(newA), newB);
        return newComplex;
    }

    /**
     * Division method
     *
     * @param otherNumber object of ComplexNumber, contain two numbers of type float
     * @return complex number after dividing
     */
    public ComplexNumber divide(ComplexNumber otherNumber) {
        ComplexNumber newComplex;
        // formula to get a complex number (a*c + b*d)/(c^2 + d^2) + (b*c + a*d)/(c^2+d^2)
        // call accessor to get a real number from RealNumber class
        float newA = ((realNumberObject.getRealNumber() * otherNumber.getA() + b * otherNumber.getB()) / (otherNumber.getA() * otherNumber.getA() + otherNumber.getB() * otherNumber.getB()));
        float newB = ((b * otherNumber.getA() - realNumberObject.getRealNumber() * otherNumber.getB()) / (otherNumber.getA() * otherNumber.getA() + otherNumber.getB() * otherNumber.getB()));
        newComplex = new ComplexNumber(new RealNumber(newA), newB);
        return newComplex;
    }

    /**
     * Accessor which return a representation of the float a
     *
     * @return a representation of the float a
     */
    public float getA() {
        return realNumberObject.getRealNumber();
    }

    /**
     * Accessor which return a representation of the float b
     *
     * @return a representation of the float b
     */
    public float getB() {
        return b;
    }

    /**
     * Override method, to check if the object is an instance of ComplexNumber class
     * {@inheritDoc}
     *
     * @return boolean result if the object is an instance of ComplexNumber class
     */
    @Override
    public boolean equals(Object o) {
        // the object must equals () to itself
        if (this == o) return true;
        // if object is not instance of ComplexNumber class, method will return false
        if (!(o instanceof ComplexNumber)) return false;
        ComplexNumber that = (ComplexNumber) o;
        // function call to compare two float values
        return Float.compare(that.getB(), getB()) == 0 &&
                Objects.equals(realNumberObject, that.realNumberObject);
    }

    /**
     * Return a string representing the complex number in formatted style
     *
     * @return return a string representing the complex number.
     */
    @Override
    public String toString() {
        // return a formatted string and at the end add i to represent complex number
        return String.format("%.1f + %.1fi", realNumberObject.getRealNumber(), b);
    }
}

