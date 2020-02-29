package com.basic.HeaderValidationSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = {"src/test/resources/com/basic/HeaderValidationFF/HeaderValidation.feature"},
		glue 	= {"com/basic/HeaderValidationSD/"},
		monochrome= true

//features = {"src/test/resources/com/basic/MyGoogleRestAssured",
	//	"src/test/resources/com/basic/MyGoogleRestAssured/"},
//glue 	= {"com/basic/MyGoogleRestAssured/"}

)

public class RunnerTest {

	
}
