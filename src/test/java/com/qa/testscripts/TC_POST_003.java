package com.qa.testscripts;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class TC_POST_003 {
	
	@Test
	public void post_Demo() {
		
		
		JSONObject req = new JSONObject();
		req.put("name", "Kim Smith");
		req.put("job", "QA Lead");
		//System.out.println(req.toString());
		
		//given().body(req.toJSONString()).when().post("https://reqres.in/api/users").then().statusCode(201);
		
		given().header("content-Type", "application/json").contentType(ContentType.JSON).accept(ContentType.JSON)
		.body(req.toJSONString()).when().post("https://reqres.in/api/users").then().statusCode(201).log().all();
	}

}
