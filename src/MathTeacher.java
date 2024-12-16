public class MathTeacher extends Person {


    public String school;

    public MathTeacher(String name, int age, String school) {
        super(name, age);
        System.out.println("Jestem w konstruktorze mathTeacher");

    }


    public void teachMath(){
        System.out.println("Im teaching math");

        eat();
    }

    public void sayHello(){
        System.out.println("Hello my name is " + name);
        System.out.println("I am "+ age + " old");
    }
}
