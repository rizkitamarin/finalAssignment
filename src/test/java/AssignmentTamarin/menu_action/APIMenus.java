package AssignmentTamarin.menu_action;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import AssignmentTamarin.static_api.staticApi;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class APIMenus {
	

	public static void registrasi(String payload) {

		RestAssured.baseURI = staticApi.baseUrl;
		Response responseDashboard = RestAssured.given()
				.contentType("application/json")
				.body(payload)
				.when()
				.post(staticApi.userAPI);;

		System.out.println(responseDashboard.body().asPrettyString());
		assertEquals(responseDashboard.statusCode(),200);
		
	}








}
