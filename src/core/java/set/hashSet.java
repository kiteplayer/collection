package core.java.set;

import java.util.*;

public class hashSet {
    public static void main(String[] args) {

        List<String> staff=new LinkedList<>();
        staff.add("amy");
        staff.add("Bob");
        staff.add("Carl");
        staff.add("angle");

        ListIterator<String> sIter=staff.listIterator();
        HashSet h=new HashSet(6,0.75f);
        System.out.println(h.isEmpty());
        System.out.println(h.spliterator().estimateSize());
        h=new HashSet( staff);

        System.out.println(h.size());
        h.add("a");
        h.add("b");
        System.out.println(h.size());
        System.out.println(h);
    }
}
