package TestRunner;



import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\jahan\\eclipse-workspace\\com.amazon.com\\src\\main\\resources\\feature", //the path of the feature files
		glue={"com.qa.Stepdef"}, //the path of the step definition files
		format= {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"},//to generate different types of reporting
		dryRun = false //to check the mapping is proper between feature file and step def file
		//tags = {"@Test"}			
		)
 


public class MyTestRunner {

}
