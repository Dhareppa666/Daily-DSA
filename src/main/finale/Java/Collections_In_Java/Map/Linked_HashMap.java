package main.finale.Java.Collections_In_Java.Map;

import java.util.LinkedHashMap;
import java.util.Map;

//The LinkedHashMap is just like HashMap with an additional feature
// of maintaining an order of elements inserted into it.
public class Linked_HashMap {
    public static void main(String[] args) {

        Map<String, String> lhm = new LinkedHashMap<>();

        // Add mappings using put method
        lhm.put("one", "practice");
        lhm.put("two", "code");
        lhm.put("four", "quiz");

        // It prints the elements in same order
        // as they were inserted
        System.out.println(lhm);

        System.out.println("Getting value for key 'one': "
                + lhm.get("one"));

        System.out.println("Size of the map: "
                + lhm.size());

        System.out.println("Is map empty? "
                + lhm.isEmpty());

        System.out.println("Contains key 'two'? "
                + lhm.containsKey("two"));

        System.out.println(
                "Contains value 'practice.geeks"
                        + "fmain.finaleeeks.main.finale'? "
                        + lhm.containsValue("practice"
                        + ".geeksfmain.finaleeeks.main.finale"));

        System.out.println("delete element 'one': "
                + lhm.remove("one"));

        // print mappings to the console
        System.out.println("Mappings of LinkedHashMap : "
                + lhm);
    }
}
