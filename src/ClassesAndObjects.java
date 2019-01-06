
public class ClassesAndObjects {

  public static void main (String args[]) {

  }

  public Cat garfield = new Cat("Garfield");
  cat1.setAge(8);
  cat1.setFavoriteFood("Lasanga");

  public Cat pinkPanther = new Cat("Pink Panther");
  cat2.setAge(10);
  cat2.setFavoriteFood("Eggs and bacon");

  public Cat catwoman = new Cat("Catwoman");
  cat3.setAge(4);
  cat3.setFavoriteFood("Calamari");

  public boolean isOlder(Cat c1, Cat c2) {
    if (c1.getAge() > c2.getAge()) {
      return true;
    }
  }

  public void makeBestFriends(Cat c1, Cat c2) {
    c1.setFavoriteFood("Pasta");
    c2.setFavoriteFood("Pasta");
  }

  public String makeKitten(Cat c1, c2) {
    String c1Name = c1.getName();
    String c2Name = c2.getName();
    String kittenName = "" + c1Name + c2Name;
    return kittenName;
  }

  public void adoption(Cat cat, Person person) {
    if (cat.getName() == "Catwoman") {
      System.out.println("Catwoman will never be anyone's pet!");
    } else {
      cat.setOwner(person);
    }
  }

  public boolean isFree(Cat cat) {
    return cat.getOwner() != null;
  }

  public boolean isSibling(Cat c1, Cat c2) {
    return c1.getOwner() == c2.getOwner();
  }
}
