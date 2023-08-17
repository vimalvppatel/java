package login;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class FormDataExample {
    public static void main(String[] args) {
        // Set the base URI for the API endpoint
        RestAssured.baseURI = "https://api.example.com";

        // Create a RequestSpecification object
        RequestSpecification requestSpec = RestAssured.given();

        // Add form data parameters using multiPart() method
        requestSpec.multiPart("name", "John Doe");
        requestSpec.multiPart("email", "john.doe@example.com");
        // Add more form fields as needed

        // Send the POST request to the API endpoint with the form data
        Response response = requestSpec.post("/endpoint");

        // Get and print the response body
        String responseBody = response.getBody().asString();
        System.out.println(responseBody);
    }
}
