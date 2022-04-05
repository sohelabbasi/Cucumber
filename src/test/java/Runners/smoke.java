package Runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        glue = "steps",
        //it stops actual execution, and checks all the steps whether they have definitions or not
        dryRun = false,
        tags = "@smoke",



        plugin = {"pretty", "html:target/cucumber.html", "json:target/cucumber.json"}
)

public class smoke {
}
