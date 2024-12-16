public class Person {


    // Zmienne ------------
    public String name;
    public int age;

    public Person(String name, int age){
        System.out.println("Jestem w konstruktorze person");

        this.name = name;
        this.age = age;
    }
    //Metody -----------
    public void eat(){
        System.out.println("I like pizza");
    }

    public void walk(){
        System.out.println("I like walking - retest");
    }


}
