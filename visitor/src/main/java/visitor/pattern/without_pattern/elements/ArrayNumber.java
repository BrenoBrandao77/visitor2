package visitor.pattern.without_pattern.elements;

import java.util.List;

import visitor.pattern.without_pattern.interfaces.*;

public class ArrayNumber {
  
  public int multi(List<Multi> numbers){
    return numbers.stream().map(Multi::multi).reduce(0, Integer::sum);
  }
  
  public int sum(List<Sum> numbers) {
    return numbers.stream().map(Sum::sum).reduce(0, Integer::sum);
  }


}
