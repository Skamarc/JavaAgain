package lambda;

public class StudentTest {

    public static void main(String[] args) {
    Student it = new ItStudent();
    sayHello("John", it, 21);


    Student med = new Student() {
        @Override
        public boolean sayHello(String name, int age) {
            System.out.println("I will be a doctor");
            System.out.println("My name is: " + name);
            return true;
        }
    };

    sayHello("Kate", med,31 );

    //(parametr) -> System.out.println("I am not a student, My name is: " + name);

        Student noStudent = (name, age) -> {

        System.out.println("I am not a student, My name is: " + name + " I am a: "+ age + " years old");
        if(age>18){
            System.out.println("Nie wiem co sie tu dzieje");
        }
            return false;
        };
        sayHello("Tom", noStudent, 31);

    }


    public static void sayHello(String name, Student student, int age){
        student.sayHello(name, age);
    }
}
