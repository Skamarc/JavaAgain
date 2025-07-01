package Sety;

import java.util.HashSet;
import java.util.Set;

public class SetyTest {
    public static void main(String[] args) {

        Set<String> fruits  = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Orange");

        System.out.println(fruits.contains("Orange"));
        System.out.println(fruits.size());


        Set<String> vege = new HashSet<>();
        vege.add("potatoes");
        vege.add("onion");

        vege.addAll(fruits);
        System.out.println(vege);

        for (String fruit : fruits) {
            System.out.println(fruit);
        }






    }
}
