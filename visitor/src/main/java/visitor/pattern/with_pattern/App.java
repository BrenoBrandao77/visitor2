package visitor.pattern.with_pattern;

import visitor.pattern.with_pattern.elements.*;
import visitor.pattern.with_pattern.visitors.*;

import java.util.ArrayList;
import java.util.List;

public class App {

  public static void main( String[] args ){
    TwoElement two1 = new TwoElement(3, 3);
    TwoElement two2 = new TwoElement(2, 7);
    ThreeElement three = new ThreeElement(3, 4, 5);

    List<NumberElement> numberElementList = new ArrayList<NumberElement>();
    numberElementList.add(two1);
    numberElementList.add(two2);
    numberElementList.add(three);
    new SumVisitor().visit(numberElementList);

    TotalSumVisitor visitor = new TotalSumVisitor();
    visitor.visit(numberElementList);

    System.out.println(visitor.getTotalSum());

    new MultiplyVisitor().visit(numberElementList);

    TotalMultiplyVisitor prodVisitor = new TotalMultiplyVisitor();
    prodVisitor.visit(numberElementList);

    System.out.println(prodVisitor.getTotalProd());
  }
}
