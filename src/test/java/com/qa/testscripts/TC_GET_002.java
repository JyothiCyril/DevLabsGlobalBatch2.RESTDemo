package com.qa.testscripts;

import org.testng.annotations.Test;


import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class TC_GET_002 {

	@Test
	public void get_BDD_Demo() {

		given().get("https://reqres.in/api/users?page=2").then().statusCode(200) // status code return is 200 or not
		.body("data.id[0]", equalTo(7));

		// Check if the id value at the index position is 7 or not?

		//	Structure of Json content

		// root-element : data
		// attributes : id, email, first_name, last_name, avatar etc.
		
		given().get("https://reqres.in/api/users?page=2").then().statusCode(200).log().all(); // logs all the response in the console after the Get request is triggered.
	}

}
