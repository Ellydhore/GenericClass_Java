package arithmetic;


public class Arithmetic<T extends Number> {
    private T num1;
    private T num2;

    public Arithmetic(T num1, T num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double add() {
        return num1.doubleValue() + num2.doubleValue();
    }

    public double subtract() {
        return num1.doubleValue() - num2.doubleValue();
    }

    public double multiply() {
        return num1.doubleValue() * num2.doubleValue();
    }

    public double divide() {
        if(num2.doubleValue() == 0) {
            throw new ArithmeticException("Division by zero");
        } else {
            return num1.doubleValue() / num2.doubleValue();
        }
    }

    public T getMin() {
        if(num1.doubleValue() < num2.doubleValue()) {
            return num1;
        } else {
            return num2;
        }
    }

    public T getMax() {
        if(num1.doubleValue() > num2.doubleValue()) {
            return num1;
        } else {
            return num2;
        }
    }

}

