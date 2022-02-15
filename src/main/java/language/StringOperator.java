package language;

public class StringOperator {
  private char[] string;

  public StringOperator(char[] string) {
    this.string = string;
  }

  public char[] power(int power) {
    char[] result = new char[power * this.string.length];
    int k = 0;
    for (int i = 0; i < power; i++) {
      for (int j = 0; j < this.string.length; j++) {
        result[k] = this.string[j];
        k++;
      }
    }
    return result;
  }

  public char[] reverse() {
    int length = this.string.length;
   char[] result = new char[length];
    for (int i = 0; i < length; i++) {
      result[i] = this.string[length - i - 1];
    }
    return result;
  }

  public char[] getString() {
    return string;
  }

  public void setString(char[] string) {
    this.string = string;
  }
}
