package visitor.pattern.with_pattern.elements;

import visitor.pattern.with_pattern.visitors.NumberVisitor;

public interface NumberElement {

    void accept(NumberVisitor visitor);
}