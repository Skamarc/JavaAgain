public class User {

    public String username;
    public String password; // poprawiona literówka

    public User() {
    }

    public User(String username, String password) {
        System.out.println("Jestem w konstruktorze");
        this.username = username;  // poprawne przypisanie
        this.password = password;  // poprawne przypisanie
    }

    public void sayHello() {
        System.out.println("hello my name is " + username);
    }
}
