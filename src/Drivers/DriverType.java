package Drivers;

public enum DriverType {

    CHROME("chrome","/chromedriver"),
    FIREFOX("firefox","/firefox"),
    SAFARI("safari","/safari");


    String name;
    String path;

    DriverType(String name,String path) {
        this.name = name;
        this.path = path;
    }


}
