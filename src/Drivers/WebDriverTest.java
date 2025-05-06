package Drivers;

public class WebDriverTest {
    public static void main(String[] args) {

//        ChromeDriver chromeDriver =  new ChromeDriver();
//        chromeDriver.get();
//        chromeDriver.findElementBy();
//
//        FirefoxDriver firefoxDriver = new FirefoxDriver();
//        firefoxDriver.get();
//        firefoxDriver.findElementBy();


        SafariDriver safariDriver =  new SafariDriver();
        safariDriver.get();
        safariDriver.findElementBy();
    }
}
