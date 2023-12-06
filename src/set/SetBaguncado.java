package set;

import java.util.HashSet;

public class SetBaguncado {

  public static void main(String[] args) {
    HashSet set = new HashSet();

    set.add(1.2);
    set.add(true);
    set.add("aaaaaaaaa");
    set.add(1);

    System.out.println(set.size());
    System.out.println(set.remove(1));
    System.out.println(set.remove(1));
    System.out.println(set.size());
    System.out.println(set.contains(true));

    java.util.Set Set = new HashSet<>();
    Set.add("X");
    Set.add(1.2);
    Set.add(true);
    Set.add("aaaaaaaaa");
    Set.add(1);
    Set.add("X");


    System.out.println("---------------------------------------------------");
    System.out.println(Set.contains(false));
    System.out.println(Set.size());
    System.out.println(Set.remove(1));
    System.out.println(Set.remove(1));
    System.out.println(Set.size());
    System.out.println(Set.contains(true));
    System.out.println(Set.contains(false));

  }
}
