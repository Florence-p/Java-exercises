package Generics;

import java.util.HashSet;
import java.util.Iterator;

public class Hashes {
    public static void main(String[] args) {


//        HashSet<String> h = new HashSet<String>();
//
//        h.add("Len");
//        h.add("Wilde");
//
//        System.out.println(h.size());
//        System.out.println(h);
//        System.out.println(h.contains("Oscar"));

        HashSet<Integer> hashbrowns = new HashSet<Integer>();
        hashbrowns.add(13);
        hashbrowns.add(24);
        hashbrowns.add(5);

        Iterator<Integer> it = hashbrowns.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }



    }
}