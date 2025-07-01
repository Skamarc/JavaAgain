package lambda;

public class ItStudent implements Student{
    @Override
    public void sayHello(String name, int age) {
        System.out.println("Im It guy");
        System.out.println("My name is: "+ name);
    }
}
