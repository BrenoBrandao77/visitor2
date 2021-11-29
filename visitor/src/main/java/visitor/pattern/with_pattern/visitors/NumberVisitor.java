package visitor.pattern.with_pattern.visitors;

import visitor.pattern.with_pattern.elements.*;

import java.util.List;

public interface NumberVisitor {

  void visit(TwoElement twoElement);

  void visit(ThreeElement threeElement);

  void visit(List<NumberElement> elementList);
}
