public class Bike implements vehicle {


    @Override
    public void jazda(int speed) {
        System.out.println("Jade Rowerem z predkoscia " + speed);


    }

    @Override
    public void stop() {
        System.out.println("Hamuje rowerem");

    }
}
