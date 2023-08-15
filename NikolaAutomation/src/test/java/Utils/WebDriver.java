package Utils;

import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver {

    static ChromeDriver driver;

    public static void setUp() {

        // Specify the path to ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\gdnik\\Desktop\\Nikola's Projects\\automation\\NikolaAutomation\\src\\test\\driver\\chromedriver.exe");

        // Create a new ChromeDriver instance
        driver = new ChromeDriver();

    }

    public static void shutdown() {
        driver.quit();
    }

}
