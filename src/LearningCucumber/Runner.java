package LearningCucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/LearningCucumber/Register.feature",
plugin = {"pretty","json:Target/CucumberReports/Cucumber.json",
"junit:Target/CucumberReports/Cucumber.xml","html:Target/CucumberReports"},tags= {"@selenium"})
public class Runner {

}
