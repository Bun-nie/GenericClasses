package Arithmetic;

public class Arithmetic<X extends Number, Y extends Number> {
    private final X number1;
    private final Y number2;

    public Arithmetic(X number1, Y number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public Number add() {
        return number1.doubleValue() + number2.doubleValue();
    }

    public Number subtract() {
        return number1.doubleValue() - number2.doubleValue();
    }

    public Number multiply() {
        return number1.doubleValue() * number2.doubleValue();
    }

    public Number divide() {
        if (number2.doubleValue() == 0) {
            throw new ArithmeticException("Math ERROR... Divisor cannot be zero!");
        }
        return number1.doubleValue() / number2.doubleValue();
    }

    public Number getMin() {
        return (number1.doubleValue() < number2.doubleValue() ? number1 : number2);
    }

    public Number getMax() {
        return (number1.doubleValue() < number2.doubleValue() ? number2 : number1);
    }
}
