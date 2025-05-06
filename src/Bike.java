public class Bike implements Vehicle {


    @Override
    public void jazda(int speed) {
        System.out.println("jade rowerem z predkoscia " + speed);

    }

    @Override
    public void stop() {
        System.out.println("hamuje rowerem  ");

    }

    @Override
    public String info() {
        return "rower";
    }

    public  void zatankuj(){
        System.out.println(" aby miec duzo sily musze cos zjesc");
    }
}
