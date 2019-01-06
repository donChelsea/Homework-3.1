
public class Methods {

  public static void main (String args[]) {

  }

  public double calculateSquare(int num) {
    return num^2;
  }

  public double calculateSquareRoot(int num) {
    return Math.sqrt(num);
  }

  public String toLowerCase(String str) {
    for (int i = 0; i < str.length(); i++) {
      char strChar = str.charAt(i);
      if (Character.isUpperCase(strChar)) {
        char strChar2 = Character.toLowerCase(strChar);
        str = str.replace(strChar, strChar2);
      }
    }
    return str;
  }

  public boolean isMultiple(int a, int b) {
    if (b % a == 0) {
      return true;
    }
    return false;
  }

  // prettyInteger helper method
  public String makeStars(int amount) {
    StringBuilder stars = new StringBuilder();
    for (int i = 1; i <= amount; i++) {
      stars.append("*");
    }
    return stars.toString();
  }

  public void prettyInteger(int num) {
    System.out.println(makeStars(num) + " " + num + " " + makeStars(num));
  }

  public int random(int a, int b) {
    Random r = new Random();
    return r.nextInt(b) + a;
  }

}
