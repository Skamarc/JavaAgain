public class User {

    public String username;
    public String password;


    public User(){};
    public User(String user, String pass){
        System.out.println("Hello z konstruktora");

        this.username = username;
        this.password = password;

        username = user;
        password = pass;

        System.out.println("Hello, my username is: " + user + " and, my password is: " + pass);
    }

    public void SayHello(){
        System.out.println("Hello, my username is: "+ username);
        System.out.println("Nie podales danych");
    }
}
