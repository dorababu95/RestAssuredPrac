import org.testng.annotations.BeforeClass;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
public class Baseclass {
	@BeforeClass
	public void setup()
	{
		RestAssured.authentication=RestAssured.preemptive().basic("ToolsQA","TestPassword");
	}

}
