
import static io.restassured.RestAssured.given;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

	public class Testng_Put {
		
		@Test
			public void put()
		{
//			
			JSONObject req =new JSONObject();
			req.put("name", "Ram");
			req.put("job", "tester");
			System.out.println(req);
			System.out.println(req.toJSONString());
			given().header("Content-type","application/json").contentType(ContentType.JSON).accept(ContentType.JSON)
			.body(req.toJSONString()).when().put("https://reqres.in/api/uesrs/2").then().statusCode(200).log().all();
		}

	}


