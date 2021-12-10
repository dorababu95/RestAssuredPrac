
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class OAuthvresion2 {
	
	@Test
	public void Test()
	{
		Response resp =RestAssured.given().auth().oauth2("48a737054ab0be9357e5820051815df2d2407934").
		post("http://coop.apps.symfonycasts.com/api/2526/chickens-feed");
		System.out.println(resp.getStatusCode());
		System.out.println("Code "+resp.jsonPath().prettify());
		System.out.println("Code"+resp.getBody().asString());
	}
	

}
