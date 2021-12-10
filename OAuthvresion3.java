
import org.apache.groovy.parser.antlr4.GroovyParser.FormalParameterContext;
import org.codehaus.groovy.control.customizers.builder.PostCompletionFactory;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class OAuthvresion3 {
	
	@Test
	public void Test()
	{
		Response resp= RestAssured.given().
		formParam("client_id","Restapi").
		formParam("client_secret","a63be1569939934e0f4dd16498269b63")
		.formParam("grant_type","client_credentials")
		.post("http://coop.apps.symfonycasts.com/token");
		System.out.println(resp.jsonPath().prettify());
		
	}
	

}
