package testSteps;

import Utils.WebDriver;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {


    @Before
    public void setUp(){
        WebDriver.setUp();
    }

    @After
    public void cleanUp() {
        WebDriver.shutdown();
    }
}
