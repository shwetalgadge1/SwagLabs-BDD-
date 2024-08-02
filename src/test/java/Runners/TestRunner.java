package Runners;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "C:\\Users\\PC\\eclipse-workspace\\Swaglabs\\src\\test\\resources\\Feature\\login.feature",
    glue = "stepdefinations",
    plugin = {"pretty", "html:target/cucumber-reports/html/report.html", "json:target/cucumber-reports/json/cucumber.json"}
)
public class TestRunner {
}
