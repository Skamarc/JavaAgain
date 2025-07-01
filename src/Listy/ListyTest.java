package Listy;

import dokument.PdfDocument;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListyTest {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Marcel");
        names.add("Marcel");
        names.add("Kasia");
        names.add("Ola");

        System.out.println(names.get(1));
        //Pierwszy index ktory pasuje
        System.out.println(names.indexOf("Marcel"));
        //Ostatni index ktory pasuje (last)
        System.out.println(names.lastIndexOf("Marcel"));
        System.out.println(names.contains("Marcel"));

        System.out.println(names.size());

        List<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        System.out.println(numbers.getLast());
        System.out.println(numbers.size());
//        System.out.println(numbers.());

        int G = numbers.getLast();
        System.out.println("Liczba to " + G);


        List<String> diffnames = new LinkedList<>();
        diffnames.addAll(names);
        System.out.println(diffnames);

        List<PdfDocument> pdfDocuments = new ArrayList<>();
        pdfDocuments.add(new PdfDocument());

        for (int i = 0; i< names.size(); i++) {
            System.out.println(names.get(i));
        }


        // Co iteracje bedzie do zmiennej "name" przypisywany element
        for(String name: names) {
            System.out.println("-------");
            System.out.println(name);
        }








    }
}
