package Linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class Linky {
    public static void main(String[] args) {
        LinkedList<Integer> linky = new LinkedList();
        linky.add(9);
        linky.add(34);
        linky.add(100);

        // System.out.println(linky.get(1));

        Iterator it = linky.iterator();
        while (it.hasNext()) {
            if ((int) it.next() == 34) {
                System.out.println("We found 34");

            }
        }

//       linky.add("Rob");
//       linky.add("Rave");
//       linky.add("Naomi");
//
//       System.out.println(linky);
    }
}
