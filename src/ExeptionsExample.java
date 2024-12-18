import Drivers.ChromeDriver;
import Drivers.FirefoxDriver;
import Drivers.Webdriver;

public class ExeptionsExample {
    public static void main(String[] args) {
//        int[]numbers = new int[2];
//        numbers[0] = 1;
//        numbers[1] = 3;
//
//
//        for(int i = 0; i < numbers.length; i++){
//            System.out.println(numbers[i]);
//        }

        Webdriver driver = getDriver("firefoax");
        driver.get();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();
        driver.findElementBy();



    }
    private static Webdriver getDriver(String name) {
        if (name.equals("chrome")){
            return new ChromeDriver();
        } else if (name.equals("firefox")){
            return new FirefoxDriver();
        }
        return null;
        }
    }

