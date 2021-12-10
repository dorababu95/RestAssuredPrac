import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static io.restassured.matcher.RestAssuredMatchers.*;



public class Testng_Post {
	@Test
	public void m1()
	{
//		Map<String, Object> map =new HashMap<String, Object>();
//		map.put("name","Dora");
//		map.put("job", "Tester");
//		System.out.println(map);
		JSONObject req =new JSONObject();
		req.put("name", "Ram");
		req.put("job", "tester");
		System.out.println(req);
		given().header("Content-type","application/json").contentType(ContentType.JSON).accept(ContentType.JSON)
		.body(req.toJSONString()).when().post("https://reqres.in/api/uesrs").then().statusCode(201);
	}

}
