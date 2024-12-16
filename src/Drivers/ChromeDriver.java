package Drivers;

public class ChromeDriver implements Webdriver {
    @Override
    public void get() {
        System.out.println("Otwieram przegladarke Chrome");

    }

    @Override
    public void findElementBy() {
        System.out.println("Znajduje element w przegladarce Chrome");

    }
}
