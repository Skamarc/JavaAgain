public class Truck implements vehicle {

    @Override
    public void jazda(int speed) {
        System.out.println("Jade ciezarowka z prednoscia " +  speed);
    }

    @Override
    public void stop() {
        System.out.println("Hamuje ciezarowka");
    }

    @Override
    public String info() {
        return " ciezarowka";
    }

    public void zatankuj(){
        System.out.println("Tankuje paliwo");
    }


}
