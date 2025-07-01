package ZliczenieWystapien;

import java.util.HashMap;
import java.util.Map;

public class ZliczenieWystapien {
    public static void main(String[] args) {
        //int[} numbers = new int[] {1,2,3,2,5,3}
        liczWystepienia(new int[] {1,2,3,2,5,33,3,3,3,3,3,3});
    }
// Zliczenie ile raty wystepi jakas liczba w zbiore (hashmapie)
    public static void liczWystepienia(int[] numbers){

        Map<Integer, Integer> occurences = new HashMap<>();
            for(int i = 0; i < numbers.length; i++){
                if(occurences.containsKey(numbers[i])){
                    Integer value = occurences.get(numbers[i]);
                    occurences.put(numbers[i], value + 1);
                } else {
                    occurences.put(numbers[i], 1);
                }
            }

        System.out.println("Podaj ilosc elementow w mapie: "+ occurences.size());

    }
}
