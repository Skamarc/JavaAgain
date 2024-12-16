public class Footballer extends Person {

    public String footballClub;

    public Footballer(String name, int age, String footballClub) {
        super(name, age);
        System.out.println("jestem w konstruktorze Footballer");
    }


    public void eat() {
        System.out.println("I like healty food, not pizza");
    }

    public void  walk() {
        super.walk();
        System.out.println("I like RUN, not walk");
    }

    public void playFootbal() {

        System.out.println("I am playing football");
    }

    public void FuckYourCarier(){
        System.out.println("Nah, bro, you are finished");
    }
}




