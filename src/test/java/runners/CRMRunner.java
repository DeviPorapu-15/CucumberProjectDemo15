package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

	@CucumberOptions(
			features="src//test//resources//taggedFeatures//Tasks.feature//",
			glue = {"stepDefs"},
			monochrome=true,
			plugin= {"pretty",
					"html:target//Reports//HtmlReport.html"},
		     tags = "@PhaseOne and(@SmokeTest or @RegressionTest)"
//	         tags = "@PhaseOne and not (@SmokeTest or @RegressionTest)"
			//tags = "@PhaseOne and not @SmokeTest and @RegressionTest"
			)
	public class CRMRunner extends AbstractTestNGCucumberTests {

}
