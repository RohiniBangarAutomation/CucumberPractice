package AutomationDemo;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/AutomationDemo/Register2.feature",
plugin = {"pretty","json:Target/CucumberReports/Cucumber.json",
"junit:Target/CucumberReports/Cucumber.xml","html:Target/CucumberReports"})


public class Runner2 {

}
