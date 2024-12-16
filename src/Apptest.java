public class Apptest {
    public static void main(String[] args) {


        androidApp Android = new androidApp("Calculator");
        Android.appInfo();
        Android.runAndroidApp();


        IphoneApp Iphone = new IphoneApp("Calculator");
        Iphone.appInfo();
        Iphone.runIphoneApp();

    }
}
