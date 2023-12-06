package set;

import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

//SET É UM CONJUNTO
public class Set {

  public static void main(String[] args) {
    java.util.Set<String> set = new HashSet<>();

    set.add("Caio");
    set.add("Ana");
    set.add("XXXXX");
    set.add("Caio");

    System.out.println(set);
    System.out.println(set.size());
    System.out.println(set.contains("Caio"));

    set.stream()
            .map(item -> item + "A")
            .forEach(System.out::println);

    System.out.println("---------------------------------------------------");

    //TreeSet mantem a ordem dos elementos
    java.util.Set<Integer> setInt = new TreeSet<>();
    //Outra forma de manter a ordem
//    SortedSet<Integer> setInt = new TreeSet<>();

    setInt.add(1);
    setInt.add(2);
    setInt.add(3);
    setInt.add(4);
    setInt.add(4);

    System.out.println(setInt);
    System.out.println(setInt.size());
    System.out.println(setInt.contains(2));

    var list = setInt.stream()
            .map(num -> num + 1)
            .filter(num -> num%2!=0)
            .toList();

    System.out.println(list);
  }
}
