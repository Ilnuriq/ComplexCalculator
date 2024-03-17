import java.math.BigDecimal;

class Addition implements CalculatorOperation {

    @Override
    public ComplexNumber complex(ComplexNumber num1, ComplexNumber num2) {
        BigDecimal realPart = num1.getRealPart().add(num2.getRealPart());
        BigDecimal imaginaryPart = num1.getImaginaryPart().add(num2.getImaginaryPart());
        return new ComplexNumber(realPart, imaginaryPart);
    }
}
