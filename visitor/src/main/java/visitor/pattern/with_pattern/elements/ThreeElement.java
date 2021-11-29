package visitor.pattern.with_pattern.elements;

import visitor.pattern.with_pattern.visitors.NumberVisitor;

public class ThreeElement implements NumberElement{
    public int a;
    public int b;
    public int c;


    public ThreeElement(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }


    @Override
    public void accept(NumberVisitor visitor) {
        visitor.visit(this);
    }
}
