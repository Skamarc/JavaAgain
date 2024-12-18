import Drivers.FirefoxDriver;
import Drivers.Webdriver;

public class ConversionCasting {
    public static void main(String[] args) {

        int a  =  2;
        double b = 4.23;

        double c =a/b;

        int d = a/(int)b;

        System.out.println(c);
        System.out.println(a);
        System.out.println(b);

        Webdriver driver = new FirefoxDriver();
        FirefoxDriver firefoxDriver = (FirefoxDriver) driver;

        firefoxDriver.get();
        driver.get();

    }
}
