package visitor.pattern.with_pattern.visitors;

import visitor.pattern.with_pattern.elements.*;

import java.util.List;

public class TotalSumVisitor implements NumberVisitor{
    private int totalSum = 0;

    @Override
    public void visit(TwoElement twoElement) {
        int sum = twoElement.a + twoElement.b;
        System.out.println("adicionando " + twoElement.a + "+" + twoElement.b + "=" + sum + " total");
        totalSum += sum;
    }

    @Override
    public void visit(ThreeElement threeElement) {
        int sum = threeElement.a + threeElement.b + threeElement.c;
        System.out.println("adicionando" + threeElement.a + "+" + threeElement.b + "+" + threeElement.c + "=" + sum + " total");
        totalSum += sum;
    }

    @Override
    public void visit(List<NumberElement> elementList) {
        for (NumberElement element : elementList)
            element.accept(this);
    }

    public int getTotalSum() {
        return totalSum;
    }
}
