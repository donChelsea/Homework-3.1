
public class DataStructures {

  public static void main (String args[]) {

      HashMap<String, Integer> groupHashMap = new HashMap<>();
      groupHashMap.put("Marly", 25);
      groupHashMap.put("Gregg", 25);
      groupHashMap.put("Khai", 25);

  }

  Cat garfield = new Cat("Garfield");
  Cat catwoman = new Cat("Catwoman");
  Cat pinkpanther = new Cat("Pink Panther");
  Cat silvester = new Cat("Silvester");
  Cat tom = new Cat("Tom");

  public static void coolCats() {
    ArrayList<Cat> catArrayList = new ArrayList<Cat>(Arrays.asList(garfield, catwoman, pinkpanther, silvester, tom));
    for (Cat cat : catArrayList) {
      System.out.println(cat);
    }
  }

    public static void groupMap(HashMap groupHashMap) {
        for (Map.Entry<String, Integer> name : groupHashMap.entrySet()) {
            System.out.println(name);
        }
    }




}
