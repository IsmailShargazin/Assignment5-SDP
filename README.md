# Assignment 5 — Strategy Pattern

A simple Java calculator that demonstrates the Strategy design pattern.

## Requirements

- JDK 17
- IntelliJ IDEA or a terminal

## Project Structure

- `OperationStrategy` — common interface for arithmetic operations.
- `AddStrategy` — adds two numbers.
- `SubtractStrategy` — subtracts the second number from the first.
- `MultiplyStrategy` — multiplies two numbers.
- `Calculator` — context that delegates calculations to a strategy.
- `Main` — client that selects and changes strategies.

## How to Run

### IntelliJ IDEA

1. Open the project.
2. Select JDK 17 as the project SDK.
3. Open `src/Main.java`.
4. Run the `main` method.

### Terminal

Run these commands from the project root:

```bash
javac --release 17 -d out src/*.java
java -cp out Main
```

## Expected Output

```text
Addition: 16.0
Subtraction: 8.0
Multiplication: 48.0
```

## Runtime Strategy Switching

The program creates one Calculator object.

It starts with AddStrategy, then changes to SubtractStrategy and
MultiplyStrategy using setStrategy().

The Calculator object stays the same while its algorithm changes.

## How to Add a New Strategy

For example, to support exponentiation:

1. Create a file named `PowerStrategy.java` inside `src`.
2. Implement the OperationStrategy interface:

```java
public class PowerStrategy implements OperationStrategy {

    @Override
    public double execute(double firstNumber, double secondNumber) {
        return Math.pow(firstNumber, secondNumber);
    }
}
```

3. Select the new strategy in the client:

```java
calculator.setStrategy(new PowerStrategy());
System.out.println(calculator.calculate(2, 3));
```

The result is `8.0`.

Calculator, OperationStrategy, and the existing strategies do not need
to change. Only the client configuration selects the new operation.

## Report

See `REPORT.md` for the UML diagram, Clean Code examples, and
the comparison between Strategy and State.