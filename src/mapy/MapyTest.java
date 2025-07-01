package mapy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapyTest {
    public static void main(String[] args) {
        Map<Integer, String> students = new HashMap<>();
        students.put(1,"Basia");
        students.put(2,"Mike");
        students.put(3,"Basia");
        students.put(2,"Ryszard");

        System.out.println(students.get(2));


        //Scaner do pobrania liczby-----
        Integer a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbe");
        a = sc.nextInt();
        //-------------------------------

        System.out.println(students.get(a));

       Map<Integer, String> otherStudents = new HashMap<>();

       //Dodanie wszystkich ludzi z poprzedniej mapy
       otherStudents.putAll(students);
        System.out.println(otherStudents);
        //---------------

        System.out.println("Podaj liczbe");
        a = sc.nextInt();
        System.out.println(otherStudents.get(a));


        System.out.println(students.containsKey(1));
        System.out.println(students.containsValue("Basia"));
        System.out.println(students.isEmpty());

        students.remove(1);
        System.out.println(students);

        System.out.println("------------------------");
        for(Integer key : students.keySet()){
            System.out.println(students.get(key));
        }
        System.out.println("------------------- 2");
        for(String student : students.values()){
            System.out.println(student);
        }






    }
}
