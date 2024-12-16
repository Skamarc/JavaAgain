public class Student {

    public String imie;
    public String nazwisko;
    public String nick;
    public String email;
    public int numerIndexu;
    public static String nazwaUczelni = "AGH";


    public static void infoUczelnia (){
        System.out.println("Uczelnia to AGH " + nazwaUczelni);
        druga();
    }

    public static void druga(){
        System.out.println("Druga metoda");
    }
}
