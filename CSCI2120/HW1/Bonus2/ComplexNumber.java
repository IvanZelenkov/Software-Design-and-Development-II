package HW1.Bonus2;

/**
 * ComplexNumber abstract superclass
 *
 * @author Ivan Zelenkov
 * @version 1.0
 * @since Feb 17, 2021
 *
 */
public abstract class ComplexNumber {
    private float realNumber;
    private float imaginaryNumber;

    /**
     * Construct a complex number
     *
     * @param realNumber real number
     * @param imaginaryNumber imaginary number
     */
    public ComplexNumber(float realNumber, float imaginaryNumber) {
        this.realNumber = realNumber;
        this.imaginaryNumber = imaginaryNumber;
    }

    /**
     * Addition method
     *
     * @param complexNumber object of ComplexNumber, contain two numbers of type float
     * @return complex number after adding
     */
    public abstract RealNumber add(RealNumber complexNumber);

    /**
     * Subtraction method
     *
     * @param complexNumber object of ComplexNumber, contain two numbers of type float
     * @return complex number after subtracting
     */
    public abstract RealNumber subtract(RealNumber complexNumber);

    /**
     * Multiplication method
     *
     * @param complexNumber object of ComplexNumber, contain two numbers of type float
     * @return complex number after multiplication
     */
    public abstract RealNumber multiply(RealNumber complexNumber);

    /**
     * Division method
     *
     * @param complexNumber object of ComplexNumber, contain two numbers of type float
     * @return complex number after dividing
     */
    public abstract RealNumber divide(RealNumber complexNumber);

    /**
     * Accessor which return a representation of the float realNumber
     *
     * @return a representation of the float variables
     */
    public float getRealNumber() {
        return realNumber;
    }

    /**
     * Accessor which return a representation of the float imaginaryNumber
     *
     * @return a representation of the float variable
     */
    public float getImaginaryNumber() {
        return imaginaryNumber;
    }

    /**
     * Override method, to check if the object is an instance of ComplexNumber class
     * {@inheritDoc}
     *
     * @return boolean result if the object is an instance of ComplexNumber class
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ComplexNumber)) return false;
        ComplexNumber that = (ComplexNumber) o;
        return Float.compare(that.getRealNumber(), getRealNumber()) == 0 &&
                Float.compare(that.getImaginaryNumber(), getImaginaryNumber()) == 0;
    }

    /**
     * Return a string representing the complex number in formatted style
     *
     * @return return a string representing the complex number.
     */
    @Override
    public String toString() {
        // return a formatted string and at the end add i to represent complex number
        return String.format("%.1f + %.1fi", realNumber, imaginaryNumber);
    }
}