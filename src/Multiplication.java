import java.math.BigDecimal;

class Multiplication implements CalculatorOperation {

    @Override
    public ComplexNumber complex(ComplexNumber num1, ComplexNumber num2) {
        BigDecimal realPart = num1.getRealPart().multiply(num2.getRealPart()).subtract(num1.getImaginaryPart().multiply(num2.getImaginaryPart()));
        BigDecimal imaginaryPart = num1.getRealPart().multiply(num2.getImaginaryPart()).add(num1.getImaginaryPart().multiply(num2.getRealPart()));
        return new ComplexNumber(realPart, imaginaryPart);
    }
}
