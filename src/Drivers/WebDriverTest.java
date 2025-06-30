package Drivers;
import Drivers.WebDriver;



public class WebDriverTest {
    public static void main(String[] args) throws NoValidBrowserName {

        DriverType[] driverTypes = DriverType.values();
        for (int i = 0; i < driverTypes.length; i++) {
            System.out.println(driverTypes[i].name());
            System.out.println(driverTypes[i].path);
        }

        WebDriver driver =  getDriver(DriverType.CHROME);
        driver.get();
        driver.findElementBy();

//        WebDriver firefoxDriver = new FirefoxDriver();
//        firefoxDriver.get();
//        firefoxDriver.findElementBy();

//        WebDriver driver =  getDriver(DriverType.SAFARI);
//        driver.get();
//        driver.findElementBy();
    }

    private static WebDriver getDriver(DriverType type)  {
     if (type.name().equals("chrome")) {
         System.out.printf(type.path);
         return new ChromeDriver();
    }
        System.out.println(type.path);
     return new FirefoxDriver();
    }}
