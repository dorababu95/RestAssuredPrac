
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssuredDelete {
	@Test
	public void Test()
	{ 
		RequestSpecification req =RestAssured.given();
		Response resp = req.delete("http://localhost:3000/posts/1");
		int code=resp.getStatusCode();
		Assert.assertEquals(code,200);
	}
}

