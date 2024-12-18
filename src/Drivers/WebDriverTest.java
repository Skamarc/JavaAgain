package Drivers;

public class WebDriverTest {

    public static void main(String[] args) throws NoValidBrowserName {

        Webdriver driver = getDriver("firsefox");
        driver.get();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();


//        FirefoxDriver Firefox = new FirefoxDriver();
//        Firefox.get();
//        Firefox.findElementBy();
//    }

    }

    private static Webdriver getDriver(String name) //throws NoValidBrowserName
     {
        if (name.equals("chrome")){
            return new ChromeDriver();
        } else if (name.equals("firefox")){
            return new FirefoxDriver();
        }
         try {
             throw new NoValidBrowserName("No valid browser name");
         } catch (NoValidBrowserName e) {
             throw new RuntimeException(e);
         }
     }
}
