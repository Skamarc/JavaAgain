public class StudentChecker {
    public static void main(String[] args) {


        String uczelnia  = Student.nazwaUczelni;

        Student.infoUczelnia();

        Student adam = new Student();
        adam.imie = "Adam";
        adam.nick = "Test";
        adam.email = "Test@test.com";
        adam.nazwisko = "Adamowski";
        adam.numerIndexu = 12345;
        String uczelniaAdama = adam.nazwaUczelni;

        Student kasia = new Student();
        kasia.imie = "Kasia";
        kasia.nick = "Test";
        kasia.email = "Test@test.com";
        kasia.nazwisko = "Kasiowska";
        kasia.numerIndexu = 12345;

        Student Marcel = new Student("marcel", "marcel", 1);
        Marcel.Dane();

        adam.Dane();
    }

}
