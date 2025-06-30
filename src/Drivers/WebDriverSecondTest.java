package Drivers;

public class WebDriverSecondTest {
    public static void main(String[] args) {

        WebDriver chrome = new ChromeDriver();
        WebDriver secondChrome = new ChromeDriver();

        WebDriver firefox = new FirefoxDriver();
        WebDriver firefoxSecond = new FirefoxDriver();
        WebDriver firefoxThird = new FirefoxDriver();


        WebDriver safari = new WebDriver() {
            @Override
            public void get() {
                System.out.println("Openin page with safari");
            }

            @Override
            public void findElementBy() {
                System.out.println("Finding element with safari");
            }
        };

        safari.get();
        safari.findElementBy();
    }
}
