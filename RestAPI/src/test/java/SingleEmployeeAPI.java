import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;


public class SingleEmployeeAPI {
    public String baseUrl = "http://info.venturepulse.org:8080/service-webapp";

    @Test
    public void callSingleEmployeeResources() {
        Response response = given().when().get(baseUrl + "/api/SingleEmployeeResources/590a4acd35522970c7956cdf").then().statusCode(200).extract().response();
        String statusLine = response.getStatusLine();
        int statusCode = response.getStatusCode();
        String body = response.getBody().prettyPrint();
        Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");
        Assert.assertEquals(statusCode, 200);
    }

    //@Test
    public void callRiveraDup() {
        Response response = given().when().get(baseUrl + "/api/SingleEmployeeResources/590cd940355229a483d89e1f").then().statusCode(200).extract().response();
        String statusLine = response.getStatusLine();
        int statusCode = response.getStatusCode();
        String body = response.getBody().prettyPrint();
        Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");
        Assert.assertEquals(statusCode, 200);
    }

    @Test
    public void callDavidLenard() {
        Response response = given().when().get(baseUrl + "/api/SingleEmployeeResources/590cd847355229a408ba9d06").then().statusCode(200).extract().response();
        String statusLine = response.getStatusLine();
        int statusCode = response.getStatusCode();
        String body = response.getBody().prettyPrint();
        Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");
        Assert.assertEquals(statusCode, 200);
    }

    @Test
    public void getEmployeeTImani() {
        Response response = given().when().get(baseUrl + "/api/SingleEmployeeResources/5da2f2942fc2131d32a5d20f").then().statusCode(200).extract().response();
        String statusLine = response.getStatusLine();
        int statusCode = response.getStatusCode();
        String body = response.getBody().prettyPrint();
        Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");
        Assert.assertEquals(statusCode, 200);
    }
}
