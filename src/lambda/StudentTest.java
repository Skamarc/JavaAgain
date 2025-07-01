package lambda;

public class StudentTest {

    public static void main(String[] args) {
        Student it = new ItStudent();
        sayHello("Marcel", it, 33);

        Student med = new Student() {
            @Override
            public void sayHello(String name, int age) {
                System.out.println("I will be a failure to my parents and my wife");
                System.out.println("My name is "+ name);

            }
        };


        sayHello("Marcel", med, 30);

        //(parametr) ->  System.out.println("Im not a student, My name is "+ name);

        Student noStudent = (name, age) ->
        {
            System.out.println("Im not a student, My name is "+ name + "Im "+age );
            if (age>18){
                System.out.println("You can but a beer");
            } else {
                System.out.println("Fck off");
            }
        };
        sayHello("Marcel", noStudent, 30);
    }



    public static void sayHello(String name, Student student, int age) {
        student.sayHello(name, age);
    }





}