package visitor.pattern.without_pattern.elements;

import visitor.pattern.without_pattern.interfaces.*;

public class TwoNumber implements Multi, Sum{
    private int number1;
    private int number2;

    public TwoNumber(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public int sum() {
        int sum = number1 + number2;
        System.out.println(number1 + "+" + number2 + "=" + sum);
        return number1 + number2;
    }

    public int multi() {
        int prod = number1 * number2;
        System.out.println(number1 + "*" + number2 + "=" + prod);
        return number1 * number2;
    }
}
