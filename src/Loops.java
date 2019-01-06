
public class Loops {

  public static void main (String args[]) {

  }

  public void print1to10() {
    int counter = 1;
    while (counter <= 10) {
      System.out.println(counter);
      counter++;
    }
  }

  public void print1to10again() {
    for (int i = 1; i <= 10; i++) {
      System.out.println(i);
    }
  }

  public void printN(int n) {
    for (int i = 1; i <= n; i++) {
      System.out.println(i);
    }
  }

  public void printEvenN(int n) {
    for (int i = 2; i <= n; i+=2) {
      System.out.println(i);
    }
  }

  public void printSum10() {
    int sum = 0;
    for (int i = 1; i <= 10; i++) {
      sum = sum + i;
    }
    System.out.println(sum);
  }

  public void printSum(int n) {
    int sum = 0;
    for (int i = 1; i <= n; i++) {
      sum = sum + i;
    }
    System.out.println(sum);
  }

  printSum(10000);

  public void printStringNTimes(int n, String s) {
    StringBuilder newString = new StringBuilder();
    if (n > 0) {
      for (int i = 0; i < n; i++) {
        newString.append(" " + s);
      }
      System.out.println(newString.toString());
    } else {
      System.out.println("");
    }
  }

  public static int sumNumbers(String string) {
      String allNumbers = "";
      int intString;
      int sumOfAllNums = 0;
      ArrayList<Integer> numArray = new ArrayList<>();
      for (int i = 0; i < string.length(); i++) {
          if (Character.isDigit(string.charAt(i))) {
              numArray.add(Integer.parseInt(String.valueOf(string.charAt(i))));
          }
      }
      for (int j = 0; j < numArray.size(); j++) {
          sumOfAllNums = sumOfAllNums + numArray.get(j);
      }
      return sumOfAllNums;
  }


}
