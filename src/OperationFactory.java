public class OperationFactory {
    public static CalculatorOperation createOperation(String operator) {
        switch (operator) {
            case "+":
                return new Addition();

            case "-":
                return new Subtraction ();

            case "*":
                return new Multiplication();

            case "/":
                return new Division();

            default:
                return null;
        }
    }
}
