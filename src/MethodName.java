public class MethodName {


    // Method overloading
    // Ta sama nazwa metody lecz z innymi wartosciami tez dziala
    public void add(int a, int b){
        System.out.println("Suma to " + a+b);
    }

    public void add(int a){
        System.out.println("Suma to " + a);
    }

    public void add(String a){
        System.out.println("Suma to " + a);
    }

    public void add(){
        System.out.println("Suma to " + 2+1);
    }
    public void add(int a, int b, int c){
        System.out.println("Suma to " + a+b+c);
    }


}
