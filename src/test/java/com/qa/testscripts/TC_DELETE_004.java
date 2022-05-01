package com.qa.testscripts;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


public class TC_DELETE_004 {
	
	
	@Test
	public void delete_Demo() {
		
		when().delete("https://reqres.in/api/users/2").then().statusCode(204).log().all();
	}

}
