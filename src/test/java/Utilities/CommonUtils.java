package Utilities;

import ConstantPackage.Constants;
import DriverManagerPackage.DriverManager;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class CommonUtils {
    public static void loadProperties() throws IOException {
        Properties properties = new Properties();
        FileReader fis = new FileReader("C:\\Users\\Admin\\IdeaProjects\\IRCTC_Automation\\src\\test\\resources\\config.properties");

        properties.load(fis);

        Constants.BROWSER = properties.getProperty("browser");
        Constants.CHROME_DRIVER_LOCATION = properties.getProperty("CHROME_DRIVER_LOCATION");
        Constants.URL = properties.getProperty("url");
        Constants.USER = properties.getProperty("user");
        Constants.PASS = properties.getProperty("pass");
    }

}
