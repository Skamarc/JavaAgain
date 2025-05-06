public class MathTeacher extends Person {


    public String school;

    public MathTeacher(String name, int age, String school) {
        super(name, age);
        this.school =  school;
        System.out.println("Jestem w konstruktorze mathTeacher");

    }


    public void teachMath(){
        System.out.println("Im teaching math");

        eat();
        cimcimrimcim();
    }

    public void walk(){

        super.walk();
        System.out.println("I walk very fast");
    }

    public void sayHello(){
        System.out.println("Hello my name is " + name);
        System.out.println("I am "+ age + " old");
    }
}
