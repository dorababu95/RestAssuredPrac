


import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssuredPost {
	@Test
	public void Test()
	{ 
		RequestSpecification req =RestAssured.given();
		req.header("Content-Type","application/json");
		JSONObject json =new JSONObject();
		json.put("id","1");
		json.put("title","DEVELOPER");
		json.put("author","DEV");
		req.body((json.toJSONString()));
		Response resp = req.post("http://localhost:3000/posts");
		int code=resp.getStatusCode();
		Assert.assertEquals(code,201);
	}
}

