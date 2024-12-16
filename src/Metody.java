public class Metody {

    public int policzWynik (){
        System.out.println("Licz wynik");
        int result = 0;
        for (int i = 0; i< 100; i ++) {
            result = result + i;
        }
        System.out.println("Rezultat to: " + result);
        return result;
    }

    public int pobierzWynik (int number){
        System.out.println("Licz wynik");
        int result = 0;
        for (int i = 0; i< 100; i ++) {
            result = result + i;
        }
        System.out.println("Rezultat to: " + result);
        return result;
    }

    public int add(int a, int b, String word) {
        int addWynik = a + b;
        System.out.println("Wynik add to: " + addWynik);
        System.out.println(word);
        return addWynik;
    }
}
