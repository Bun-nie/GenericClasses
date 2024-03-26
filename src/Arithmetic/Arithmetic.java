package Arithmetic;

public class Arithmetic {
    private Number number1, number2;
    public Arithmetic(Number number1, Number number2) {
        this.number1 = number1;
        this.number2 = number2;
    }
    public Number add(){
        return number1.doubleValue() + number2.doubleValue();
    }
    public Number subtract(){
        return number1.doubleValue() - number2.doubleValue();
    }
    public Number multiply(){
        return number1.doubleValue() * number2.doubleValue();
    }
    public Number divide(){
        if(number2.doubleValue() == 0){
            throw new ArithmeticException("Math ERROR... Divisor cannot be zero!");
        }
        return number1.doubleValue() / number2.doubleValue();
    }
    public Number getMin(){
        return (number1.doubleValue() < number2.doubleValue() ? number1 : number2);
    }
    public Number getMax(){
        return (number1.doubleValue() < number2.doubleValue() ? number2 : number1);
    }
}
