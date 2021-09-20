package DriverManagerPackage;

import ConstantPackage.Constants;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class DriverManager
{
    private static WebDriver driver=null;

    public static final Logger LOGGER= LogManager.getLogger(DriverManager.class);

    public static WebDriver getDriver() {
        return driver;
    }

    public static void launchBrowser() {
        switch (Constants.BROWSER) {
            case "chrome":
                System.setProperty(Constants.CHROME_DRIVER, Constants.CHROME_DRIVER_LOCATION);
                driver =new ChromeDriver();
                break;

            default:
                System.setProperty(Constants.CHROME_DRIVER, Constants.CHROME_DRIVER_LOCATION);
                driver =new ChromeDriver();
                break;
        }
}

}
