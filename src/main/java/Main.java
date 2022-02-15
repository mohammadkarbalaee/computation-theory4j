import language.StringOperator;

public class Main {
  public static void main(String[] args) {
    char[] chars = {'a','b','c'};
    StringOperator stringOperator = new StringOperator(chars);
//    System.out.println(stringOperator.power(3));
    System.out.println(stringOperator.reverse());
  }
}
