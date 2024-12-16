public class UserTest {
    public static void main(String[] args) {
        User user = new User();
        User user2 = new User("Marcel", "Haslo");
        User user3 = new User("Michał", "Haslo2");

//        user.username = "Marcel";
//        user.password = "Haslo";

        System.out.println(user2.password);
        System.out.println(user2.username);

        System.out.println(user3.password);
        System.out.println(user3.username);




    }
}
