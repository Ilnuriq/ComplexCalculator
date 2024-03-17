import java.math.BigDecimal;

public class ComplexNumber {
    private BigDecimal realPart;
    private BigDecimal imaginaryPart;

    public ComplexNumber(BigDecimal realPart, BigDecimal imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public BigDecimal getRealPart() {
        return realPart;
    }

    public BigDecimal getImaginaryPart() {
        return imaginaryPart;
    }

    @Override
    public String toString() {
        String sign = null;
        if (imaginaryPart.compareTo(BigDecimal.ZERO) < 0) {
            sign = "-";
        } else {
            sign = "+";
        }
        return realPart + " " + sign + " " + imaginaryPart.abs() + "i";
    }
}
