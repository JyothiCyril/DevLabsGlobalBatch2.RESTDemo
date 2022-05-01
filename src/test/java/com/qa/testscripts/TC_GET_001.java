package com.qa.testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class TC_GET_001 {

	@Test
	public void Get_001() {


		// uri : query that be host on the API / Webservice
		// Get Method : fetch the details based on the URi
		// Response Code: 200 --> OK

		//Response res = RestAssured.get("https://reqres.in/api/users?page=2");

		Response res = get("https://reqres.in/api/users?page=2");

		String read = res.asString();
		System.out.println(read);


		ResponseBody body = res.getBody();
		System.out.println(body.asString());

		String header = res.getHeader("content-type");
		System.out.println(header);

		int statusCode = res.getStatusCode();
		System.out.println(statusCode);
		Assert.assertEquals(statusCode, 200);

		String statusLine = res.getStatusLine();
		System.out.println(statusLine);
	}

}
