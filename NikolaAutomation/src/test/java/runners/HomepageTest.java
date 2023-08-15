package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions
        (plugin = {
                "pretty",
                "json:target/jsonreports/homepage.json",
                "html:target/htmlreports/homepage",
                "io.qameta.allure.cucumber5jvm.AllureCucumber5Jvm"
        },
        monochrome = true,
        features = "src/test/features/homepage.feature",
        glue = "testSteps")
public class HomepageTest {
}
