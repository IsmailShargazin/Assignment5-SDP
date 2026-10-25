public class Main {

    public static void main(String[] args) {
        double firstNumber = 12;
        double secondNumber = 4;

        Calculator calculator = new Calculator(new AddStrategy());

        System.out.println(
                "Addition: " + calculator.calculate(firstNumber, secondNumber)
        );

        calculator.setStrategy(new SubtractStrategy());

        System.out.println(
                "Subtraction: " + calculator.calculate(firstNumber, secondNumber)
        );

        calculator.setStrategy(new MultiplyStrategy());

        System.out.println(
                "Multiplication: " + calculator.calculate(firstNumber, secondNumber)
        );
    }
}