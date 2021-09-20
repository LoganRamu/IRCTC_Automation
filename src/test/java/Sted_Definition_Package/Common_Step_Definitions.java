package Sted_Definition_Package;

import DriverManagerPackage.DriverManager;
import Utilities.CommonUtils;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class Common_Step_Definitions {
    //public static WebDriver driver; Initialized in DriverManager Class

    @Before
    public void beforeScenario() throws IOException {
        CommonUtils.loadProperties();
        if (DriverManager.getDriver() == null) {
            DriverManager.launchBrowser();
        }

    }
}

