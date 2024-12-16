package Drivers;

public class WebDriverTest {

    public static void main(String[] args) {

        ChromeDriver chrome = new ChromeDriver();
        chrome.get();
        chrome.findElementBy();

        FirefoxDriver Firefox = new FirefoxDriver();
        Firefox.get();
        Firefox.findElementBy();
    }
}
