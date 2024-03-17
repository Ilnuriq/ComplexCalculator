import java.math.BigDecimal;
import java.math.RoundingMode;

class Division implements CalculatorOperation {

    @Override
    public ComplexNumber complex(ComplexNumber num1, ComplexNumber num2) {
        BigDecimal realPart = (num1.getRealPart().multiply(num2.getRealPart()).add(num1.getImaginaryPart().multiply(num2.getImaginaryPart())).divide(num2.getRealPart().pow(2).add(num2.getImaginaryPart().pow(2)), 5, RoundingMode.HALF_UP));
        BigDecimal imaginaryPart = (num1.getImaginaryPart().multiply(num2.getRealPart()).subtract(num1.getRealPart().multiply(num2.getImaginaryPart())).divide(num2.getRealPart().pow(2).add(num2.getImaginaryPart().pow(2)), 5, RoundingMode.HALF_UP));;
        return new ComplexNumber(realPart, imaginaryPart);
    }
}