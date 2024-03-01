package activities;

import java.util.HashSet;

public class Activity10 {

    public static void main(String[] a){

        HashSet<Object> hs = new HashSet<>();
        hs.add("Obj1");
        hs.add("Obj2");
        hs.add("Obj3");
        hs.add("Obj4");
        hs.add("Obj5");
        System.out.println(hs.size());
        hs.remove("Obj5");
        hs.remove("Obj6");
        System.out.println(hs.contains("Obj4"));
        System.out.println(hs);







    }

}
