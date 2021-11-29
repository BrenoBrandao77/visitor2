package visitor.pattern.with_pattern.elements;

import visitor.pattern.with_pattern.visitors.NumberVisitor;

public class TwoElement implements NumberElement{
  public final int a;
    public final int b;

    public TwoElement(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void accept(NumberVisitor visitor) {
        visitor.visit(this);
    }
}
