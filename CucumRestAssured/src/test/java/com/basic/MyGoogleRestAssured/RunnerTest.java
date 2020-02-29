package com.basic.MyGoogleRestAssured;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = {"src/test/resources/com/basic/MyGoogleRestAssured/MyFeatureFile.feature",
					"src/test/resources/com/basic/MyGoogleRestAssured/MyFeatureFile2.feature"},
		glue 	= {"com/basic/MyGoogleRestAssured/"},
		monochrome= true

//features = {"src/test/resources/com/basic/MyGoogleRestAssured",
	//	"src/test/resources/com/basic/MyGoogleRestAssured/"},
//glue 	= {"com/basic/MyGoogleRestAssured/"}

)

public class RunnerTest {

	
}
