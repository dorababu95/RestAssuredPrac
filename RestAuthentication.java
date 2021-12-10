
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAuthentication extends Baseclass{
	@Test
	public void Test()
	{ 
		int code =RestAssured.given()
		.get("http://restapi.demoqa.com/authentication/CheckForAuthentication")
		.getStatusCode();
		System.out.println("Response code from server is"+code);
	}
}

