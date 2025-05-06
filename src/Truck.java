public class Truck implements Vehicle{

    @Override
    public void jazda(int speed) {
        System.out.println("Jade ciezarowka z predkoscia " +  speed);
    }

    @Override
    public void stop() {
        System.out.println("Hamuje ciezarowka ");
    }

    @Override
    public String info() {
        return "ciezarowka";
    }
}
