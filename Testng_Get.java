import org.testng.annotations.Test;

import io.restassured.http.Header;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static io.restassured.matcher.RestAssuredMatchers.*;


public class Testng_Get {
	@Test
	public void name()
	{
		given().
		get("https://reqres.in/api/users?page=2").then().statusCode(200)
		.body("data.id[1]",equalTo(8)).log().all().body("data.first_name",hasItem("Tobias"));
	}

}
