import java.util.Scanner;
import java.math.BigDecimal;

public class ViewCalculator {
    public void run() {
        BigDecimal rPart1 = promptInt("Введите вещественную часть для первого комплексного числа: ");
        BigDecimal iPart1 = promptInt("Введите мнимую часть для первого комплексного числа: ");
        String operation = prompt("Введите команду (+, -, *, /) : ");
        BigDecimal rPart2 = promptInt("Введите вещественную часть для второго комплексного числа: ");
        BigDecimal iPart2 = promptInt("Введите мнимую часть для второго комплексного числа: ");

        Calculator Calculator = new Calculator(OperationFactory.createOperation(operation));
        ComplexNumber compNum1 = new ComplexNumber(rPart1,iPart1);
        ComplexNumber compNum2 = new ComplexNumber(rPart2,iPart2);

        String result = ("(" + compNum1 + ")" + " " +  operation + " " + "(" + compNum2 + ") = " + Calculator.calculate(compNum1, compNum2));
        System.out.println(result);

        Log log = new Log();
        log.addlog(result);
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    private BigDecimal promptInt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return new BigDecimal(in.nextLine());
    }
}
