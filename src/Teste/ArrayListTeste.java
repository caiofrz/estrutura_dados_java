package Teste;

import java.util.ArrayList;

public class ArrayListTeste {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("1");
        arrayList.add("2");
        arrayList.add("nome");

        System.out.println(arrayList);

        if (arrayList.contains("nome")) {
            System.out.println("\nElemento existe no array!");
        } else {
            System.out.println("\nElemento não existe no array!");
        }

        var pos = arrayList.indexOf(1);
        if (pos >= 0) {
            System.out.println("\nElemento existe no array!");
        } else {
            System.out.println("\nElemento não existe no array!");
        }

        System.out.println(arrayList.get(0));

        System.out.println(arrayList);
        System.out.println(arrayList.size());

        arrayList.remove("nome");
        arrayList.remove(0);
        arrayList.removeAll(arrayList);

    }
}
