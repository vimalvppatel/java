package login;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.specification.RequestSpecification;

public class test {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		baseURI = "https://infograinsdevelopment.com";

		RequestSpecification Requestspec = given();

		Header h2 = new Header("Content-Type", "application/json");
		Header h3 = new Header("Content-Length", "<calculated when request is sent>");
		Header h4 = new Header("Host", "<calculated when request is sent>");
		Header h1 = new Header("Cookie",
				"XSRF-TOKEN=eyJpdiI6Im9JOFBoemNVVVQrTUgvMWVJS1J"
				+ "aMVE9PSIsInZhbHVlIjoiM2d5SmRiOUFlTm9DUFlpTWp4YnlwRmpEUkhyWU9LT0VxdTlrKzZCV0d4bnJnNWVrUXI3Ump6cHQzeFpob205d2ZrcUgvUlgvSURjSTlJckthYjV6cyt2aVVEWjFkMkZOVTEvOGMvQVpad2FlZzVCSndmUGtMUG52QlA1TnV4MU8iLCJtYWMiOiJlZTdlMDYzODcwYmE1ODQ0MGFhZTdmMDlkZWMwMzJlYWIwODQ5YTQ2MzlhN2JlYWE2ODkyMTVmNDkyMzFhZjlkIiwidGFnIjoiIn0%3D; laravel_session=KDlqZ9awOjUM12E1ozx19XmyD5choRJTTxWfeDOq");

		Header h5 = new Header("Accept-Encoding", "gzip, deflate, br");
		Header h6 = new Header("Accept", "*/*");
		Header h7 = new Header("Connection", "keep-alive");
		Headers h = new Headers(h2);

		Requestspec.headers(h);

		Requestspec.body("{\"type\":\"driver\",\"mobile_number\":\"7242621\",\"country_code\":\"+91\"}");

		io.restassured.response.Response response = Requestspec.post("/sahaltexi/admin/api/step1");

		System.out.println(response.asPrettyString());

	}

	
}
