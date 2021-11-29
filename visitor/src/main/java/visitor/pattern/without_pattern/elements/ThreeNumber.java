package visitor.pattern.without_pattern.elements;

import visitor.pattern.without_pattern.interfaces.*;

public class ThreeNumber implements Multi, Sum{
    private int number1;
    private int number2;
    private int number3;

    public ThreeNumber(int number1, int number2, int number3) {
        this.number1 = number1;
        this.number2 = number2;
        this.number3 = number3;
    }

    public int sum() {
        int sum = number1 + number2 + number3;
        System.out.println(number1 + "+" + number2 + "+" + number3 + "=" + sum);
        return number1 + number2 + number3;
    }

    public int multi() {
        int prod = number1 * number2 * number3;
        System.out.println(number1 + "*" + number2 + "*" + number3 + "=" + prod);
        return number1 * number2 * number3;
    }
}
