package core.java;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class listTest {

    public  static void main(String[] args){
        List<String> staff=new LinkedList<>();

        staff.add("amy");
        staff.add("Bob");
        staff.add("Carl");
        staff.add("angle");
        System.out.println(staff);
        ListIterator<String> sIter=staff.listIterator();
        sIter.next();
        //set a  new element to replace one that was visited by next() or previous()
        sIter.set("ha");
        System.out.println(staff);
        staff.set(1,"girl");
        System.out.println(staff);
        System.out.println(staff.indexOf("girl"));
        Iterator iter =staff.iterator();
        String first = (String) iter.next();
        String second= (String) iter.next();
        iter.remove();
        boolean amy = staff.contains("amy");
        System.out.println(amy);
       System.out.println(staff.toString());
    }



}
