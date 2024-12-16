public class MetodyTest {
    public static void main(String[] args) {
        Metody metody = new Metody();
        metody.policzWynik();

//        int result = metody.policzWynik();
//        int result2 = result*2;

        metody.pobierzWynik(5);

        metody.add(2,3, "Cos");

        int test1 = metody.add(5,5, "Cokolwiek");
        System.out.println( test1);



    }
}
