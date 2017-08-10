package example.dcf.restapp.dto;

import static io.restassured.RestAssured.get;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import io.restassured.response.Response;

@RunWith(SpringRunner.class)
public class GreetingControllerTest {

	@Test
	public void testsStart() throws Exception {
		assertTrue(true);
	}

	@Test
	public void getGreetingTest() throws Exception {
		Response response = get("/greeting");

		System.out.println(response.getBody().asString());

		assertTrue(false);
	}

}
