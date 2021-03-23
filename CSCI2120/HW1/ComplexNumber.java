package HW1;

/**
 * A class which defines complex numbers
 *
 * @author Ivan Zelenkov
 * @version 1.0
 * @since Feb 11, 2021
 */
public class ComplexNumber{
    // The instance variables a and b representing the real part and imaginary part of the complex number
    private float a;
    private float b;

    /**
     * Create a complex number by float variables a and b
     * @param a real number
     * @param b imaginary number
     */
    public ComplexNumber(float a, float b){
        this.a = a;
        this.b = b;
    }

    /**
     * Addition method
     * @param otherNumber object of ComplexNumber, contain two numbers of type float
     * @return complex number after adding
     */
    public ComplexNumber add(ComplexNumber otherNumber){
        ComplexNumber newComplex;
        // formula (a + c) + (b + d)
        // newA means the first part of the complex number
        float newA = a + otherNumber.getA();
        // newB means the second part of the complex number
        float newB = b + otherNumber.getB();
        // assign the result of newA and newB to the newComplex object
        newComplex = new ComplexNumber(newA, newB);
        // returns the complex number
        return newComplex;
    }

    /**
     * Subtraction method
     * @param otherNumber object of ComplexNumber, contain two numbers of type float
     * @return complex number after subtracting
     */
    public ComplexNumber subtract(ComplexNumber otherNumber) {
        ComplexNumber newComplex;
        // formula to get a complex number (a - c) + (b - d)
        float newA = a - otherNumber.getA();
        float newB = b - otherNumber.getB();
        newComplex = new ComplexNumber(newA, newB);
        return newComplex;
    }

    /**
     * Multiplication method
     * @param otherNumber object of ComplexNumber, contain two numbers of type float
     * @return complex number after multiplication
     */
    public ComplexNumber multiply(ComplexNumber otherNumber) {
        ComplexNumber newComplex;
        // formula to get a complex number (a*c + b*d) + (b*c + a*d)
        float newA = (a * otherNumber.getA() - b * otherNumber.getB());
        float newB = (b * otherNumber.getA() + a * otherNumber.getB());
        newComplex = new ComplexNumber(newA, newB);
        return newComplex;
    }

    /**
     * Division method
     * @param otherNumber object of ComplexNumber, contain two numbers of type float
     * @return complex number after dividing
     */
    public ComplexNumber divide(ComplexNumber otherNumber) {
        ComplexNumber newComplex;
        // formula to get a complex number (a*c + b*d)/(c^2 + d^2) + (b*c + a*d)/(c^2+d^2)
        float newA = ((a * otherNumber.getA() + b * otherNumber.getB())/(otherNumber.getA()*otherNumber.getA() + otherNumber.getB()*otherNumber.getB()));
        float newB = ((b * otherNumber.getA() - a * otherNumber.getB())/(otherNumber.getA()*otherNumber.getA() + otherNumber.getB()*otherNumber.getB()));
        newComplex = new ComplexNumber(newA, newB);
        return newComplex;
    }

    /**
     * Accessor which return a representation of the float a
     * @return a representation of the float a
     */
    public float getA() {
        return a;
    }

    /**
     * Accessor which return a representation of the float b
     * @return a representation of the float b
     */
    public float getB() {
        return b;
    }

    /**
     * Override method, to check if the object is an instance of ComplexNumber class
     * {@inheritDoc}
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
        return Float.compare(that.getA(), getA()) == 0 &&
                Float.compare(that.getB(), getB()) == 0;
    }

    /**
     * Return a string representing the complex number in formatted style
     * @return return a string representing the complex number.
     */
    @Override
    public String toString() {
        // return a formatted string and at the end add i to represent complex number
        return String.format("%.1f + %.1fi", a, b);
    }
}