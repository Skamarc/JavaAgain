public class Student {

    public String imie;
    public int wiek;
    public String nazwisko;
    public String nick;
    public String email;
    public int numerIndexu;
    public static String nazwaUczelni = "AGH";


    public static void infoUczelnia (){
        System.out.println("Uczelnia to AGH " + nazwaUczelni);
        druga();
    }

    public  Student (){};

    public Student (String imie, String nick, int wiek ){
        this.imie = imie;
        this.nick = nick;
        this.wiek = wiek;
    }

    public static void druga(){
        System.out.println("Druga metoda");
    }

    public void Dane(){
        System.out.println(imie + wiek + nick + nazwaUczelni);
    }


}
