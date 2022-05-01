package com.qa.testscripts;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class TC_PUT_005 {
	
	@Test(priority=1)
	public void putDemo() {
		
		
		JSONObject req = new JSONObject();
		req.put("name", "Kim Smith");
		req.put("job", "QA Lead");
		
		given().body(req.toJSONString()).when().put("https://reqres.in/api/users/2").then().statusCode(200).log().all();
		
		
		given().header("content-Type", "application/json").contentType(ContentType.JSON).accept(ContentType.JSON)
		.body(req.toJSONString()).when().put("https://reqres.in/api/users/2").then().statusCode(200).log().all();
		
	}
	
	@Test(priority=2)
	public void patchDemo() {
		
		
		JSONObject req1 = new JSONObject();
		req1.put("name", "Jones");
		req1.put("job", "QA");
		
		given().body(req1.toJSONString()).when().patch("https://reqres.in/api/users/2").then().statusCode(200).log().all();
		
		
		given().header("content-Type", "application/json").contentType(ContentType.JSON).accept(ContentType.JSON)
		.body(req1.toJSONString()).when().patch("https://reqres.in/api/users/2").then().statusCode(200).log().all();
		
	}


}
