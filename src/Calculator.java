public class Calculator {

    private final CalculatorOperation operation;

    public Calculator(CalculatorOperation operation) {
        this.operation = operation;
    }

    public ComplexNumber calculate(ComplexNumber num1, ComplexNumber num2) {
        return operation.complex(num1, num2);
    }
}
