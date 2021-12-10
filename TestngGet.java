import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static io.restassured.matcher.ResponseAwareMatcher.*;
import static org.hamcrest.Matchers.*;

public class TestngGet {
	@Test
	void fun1()
	{
		Response resp =get("https://reqres.in/api/users?page=2");
		System.out.println(resp.getStatusCode());
		System.out.println(resp.getBody());
		System.out.println(resp.getContentType());
		System.out.println(resp.getHeader("content-type"));
		
		int statuscode =resp.getStatusCode();
		Assert.assertEquals(statuscode,200);
		
	}
@Test
void fun2()
{
	given().get("https://reqres.in/api/users?page=2").then().statusCode(200)
	.body("data.id[0]",equalTo(7));
}
}