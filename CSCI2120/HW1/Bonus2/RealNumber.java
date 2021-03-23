package HW1.Bonus2;

/**
 * Concrete class represents a real number and imaginary number which can be written as a real number multiplied by the imaginary unit i
 *
 * @author Ivan Zelenkov
 * @version 1.0
 * @since Feb 17, 2021
 */
public class RealNumber extends ComplexNumber {
    /**
     * Construct real number and part which is an imaginary number
     * @param realNumber real number
     * @param imaginaryNumber imaginary number
     */
    public RealNumber(float realNumber, float imaginaryNumber) {
        super(realNumber, imaginaryNumber);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RealNumber add(RealNumber otherNumber) {
        // formula (a + c) + (b + d)
        float newA = super.getRealNumber() + otherNumber.getRealNumber();
        float newB = super.getImaginaryNumber() + otherNumber.getImaginaryNumber();
        return new RealNumber(newA, newB);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RealNumber subtract(RealNumber otherNumber) {
        // formula to get a complex number (a - c) + (b - d)
        float newA = super.getRealNumber() - otherNumber.getRealNumber();
        float newB = super.getImaginaryNumber() - otherNumber.getImaginaryNumber();
        return new RealNumber(newA, newB);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RealNumber multiply(RealNumber otherNumber) {
        // formula to get a complex number (a*c + b*d) + (b*c + a*d)
        float newA = (super.getRealNumber() * otherNumber.getRealNumber() - super.getImaginaryNumber() * otherNumber.getImaginaryNumber());
        float newB = (super.getImaginaryNumber() * otherNumber.getRealNumber() + super.getRealNumber() * otherNumber.getImaginaryNumber());
        return new RealNumber(newA, newB);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RealNumber divide(RealNumber otherNumber) {
        // formula to get a complex number (a*c + b*d)/(c^2 + d^2) + (b*c + a*d)/(c^2+d^2)
        float newA = ((super.getRealNumber() * otherNumber.getRealNumber() + super.getImaginaryNumber() * otherNumber.getImaginaryNumber())/
                (otherNumber.getRealNumber()*otherNumber.getRealNumber() + otherNumber.getImaginaryNumber()*otherNumber.getImaginaryNumber()));

        float newB = ((super.getImaginaryNumber() * otherNumber.getRealNumber() - super.getRealNumber() * otherNumber.getImaginaryNumber())/
                (otherNumber.getRealNumber()*otherNumber.getRealNumber() + otherNumber.getImaginaryNumber()*otherNumber.getImaginaryNumber()));
        return new RealNumber(newA, newB);
    }
}