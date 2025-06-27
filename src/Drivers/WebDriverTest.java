package Drivers;
import Drivers.WebDriver;



public class WebDriverTest {
    public static void main(String[] args) throws NoValidBrowserName {

//        ChromeDriver chromeDriver =  new ChromeDriver();
//        chromeDriver.get();
//        chromeDriver.findElementBy();
//
//        FirefoxDriver firefoxDriver = new FirefoxDriver();
//        firefoxDriver.get();
//        firefoxDriver.findElementBy();


        WebDriver driver =  getDriver("firefeox");
        driver.get();
        driver.findElementBy();

    }

    private static WebDriver getDriver(String name)  {
        if(name.equals("chrome")){
            return new ChromeDriver();
        } else if (name.equals("firefox")) {
            return new FirefoxDriver();
        }

        try {
            throw new NoValidBrowserName("No valid browser name found");
        } catch (NoValidBrowserName e) {
            throw new RuntimeException(e);
        }

    }
}
