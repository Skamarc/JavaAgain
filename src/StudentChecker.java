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
        adam.imie = "Kasia";
        adam.nick = "Test";
        adam.email = "Test@test.com";
        adam.nazwisko = "Kasiowska";
        adam.numerIndexu = 12345;
    }

}
