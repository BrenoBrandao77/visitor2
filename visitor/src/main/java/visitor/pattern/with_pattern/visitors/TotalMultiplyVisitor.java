package visitor.pattern.with_pattern.visitors;

import visitor.pattern.with_pattern.elements.*;

import java.util.List;

public class TotalMultiplyVisitor implements NumberVisitor{
    private int totalProd = 0;

    @Override
    public void visit(TwoElement twoElement) {
        int prod = twoElement.a * twoElement.b;
        System.out.println("Adicionando " + twoElement.a + "*" + twoElement.b + "=" + prod + " total");
        totalProd += prod;
    }

    @Override
    public void visit(ThreeElement threeElement) {
        int prod = threeElement.a * threeElement.b * threeElement.c;
        System.out.println("Adicionando " + threeElement.a + "*" + threeElement.b + "*" + threeElement.c + "=" + prod + "  total");
        totalProd += prod;
    }

    @Override
    public void visit(List<NumberElement> elementList) {
        for (NumberElement element : elementList)
            element.accept(this);
    }

    public int getTotalProd() {
        return totalProd;
    }
}
