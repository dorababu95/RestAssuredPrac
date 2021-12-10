import org.codehaus.groovy.control.customizers.builder.PostCompletionFactory;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class OAUth {
	
	@Test
	public void Twitter()
	{
		Response resp= RestAssured.given().auth().oauth("", "", "", "").
		post("https://api.twitter.com/1.1/statuses/update.json?status=thIS is my tweet");
		System.out.println(resp.getStatusCode());
	}
	

}
