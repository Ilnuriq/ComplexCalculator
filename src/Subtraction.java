import java.math.BigDecimal;

class Subtraction implements CalculatorOperation {

    @Override
    public ComplexNumber complex(ComplexNumber num1, ComplexNumber num2) {
        BigDecimal realPart = num1.getRealPart().subtract(num2.getRealPart());
        BigDecimal imaginaryPart = num1.getImaginaryPart().subtract(num2.getImaginaryPart());
        return new ComplexNumber(realPart, imaginaryPart);
    }
}