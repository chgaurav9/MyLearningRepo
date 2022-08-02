package Switch2.RestAssured;

import static io.restassured.RestAssured.given; 
import org.testng.annotations.Test;
import files.Payload;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;import jdk.internal.net.http.common.Log;

import static org.hamcrest.Matchers.*;

public class Basics extends Payload {
	
	String place_id="";

	
	@Test(priority = 0)
	public void postWithAssertions() {
		
		

		RestAssured.baseURI = "https://rahulshettyacademy.com";
		given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json")
				.body(AddPlace())
				.when().post("/maps/api/place/add/json").then().log().all().assertThat().statusCode(200)
				.body("scope", equalTo("APP")).header("Server", "Apache/2.4.41 (Ubuntu)");
		
		
		String response=given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json")
		.body(AddPlace())
		.when().post("/maps/api/place/add/json").then().assertThat().statusCode(200)
		.body("scope", equalTo("APP")).header("Server", "Apache/2.4.41 (Ubuntu)").extract().response().asPrettyString();
		
		
		System.out.println("############################################################################################");
		
		System.out.println(response);
		
		
		JsonPath js=new JsonPath(response);
		place_id = js.getString("place_id");
		System.out.println("############################################################################################");
		System.out.println(place_id);
		
	}
	
	
	@Test(priority = 1)
	public void putWithAssertions() {

		given().log().all().queryParam("key", "qaclick123").and();
		
	}
	
	

}
