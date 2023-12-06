package map;

import java.util.HashMap;

public class Map {
  public static void main(String[] args) {
    java.util.Map<Integer, String> map = new HashMap<>();

    map.put(1, "Caio");
    map.put(2, "Ana");
    map.put(3, "Caique");
    System.out.println(map);
    map.put(3, "C");
    System.out.println(map);

    System.out.println(map.size());
    System.out.println(map.isEmpty());
    System.out.println(map.keySet());
    System.out.println(map.values());
    System.out.println(map.containsKey(1));
    System.out.println(map.containsValue("a"));
    System.out.println(map.get(1));

  }
}
