package AssignmentTamarin.static_api;

import com.github.javafaker.Faker;

public class staticApi {

	public static final String baseUrl = "https://api-staging-builder.engineer.ai";
	public static final String userAPI = "/users";
	
	
	public static String payload () {
	Faker faker = new Faker();
	String firstName = faker.name().firstName();
	String lastName = faker.name().lastName();
	String email = firstName + "@gmail.com";
	System.out.println (firstName+ " " +lastName+ " "+ email);
	String random = "{\"user\":{\"first_name\":\""+ firstName +"\",\"last_name\":\""+ lastName +"\",\"email\":\""+ email +"\",\"password\":\"123qwe!@#QWE\",\"phone_number\":\"+62-812-9188-9811\",\"user_type\":\"User\"}}";

	return random;
	}

}
