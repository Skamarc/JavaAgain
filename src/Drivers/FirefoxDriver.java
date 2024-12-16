package Drivers;

public class FirefoxDriver implements Webdriver {
    @Override
    public void get() {
        System.out.println("Otwieram przegladarke Firefox");

    }

    @Override
    public void findElementBy() {
        System.out.println("Znajduje element w przegladarce Firefox");

    }
}
