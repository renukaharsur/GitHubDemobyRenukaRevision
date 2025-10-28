package cucumberOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features",
glue="stepDefinitions",monochrome=true,tags="@SmokeTest or @RegressionTest",dryRun=true,
plugin= {"pretty","html:target/cucumber.html","json:target/cucumber.json"})
public class TestNGRunner  extends AbstractTestNGCucumberTests {
	
	
}

//@CucumberOptions(features="src/test/java/features",
//glue="stepDefinitions",monochrome=true,tags="@SmokeTest")

//@CucumberOptions(features="src/test/java/features",
//glue="stepDefinitions",monochrome=true,tags="@SmokeTest and @RegressionTest")

//@CucumberOptions(features="src/test/java/features",
//glue="stepDefinitions",monochrome=true,tags="@SmokeTest or @RegressionTest")

//@CucumberOptions(features="src/test/java/features",
//glue="stepDefinitions",monochrome=true,tags="not @SmokeTest")





