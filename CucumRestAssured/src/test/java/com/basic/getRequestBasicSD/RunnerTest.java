package com.basic.getRequestBasicSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = {"src/test/resources/com/basic/getRequestBasicFF/ValidateGetRequest.feature"},
		glue 	= {"com/basic/getRequestBasicSD/"},
		monochrome= true

//features = {"src/test/resources/com/basic/MyGoogleRestAssured",
	//	"src/test/resources/com/basic/MyGoogleRestAssured/"},
//glue 	= {"com/basic/MyGoogleRestAssured/"}

)

public class RunnerTest {

	
}
