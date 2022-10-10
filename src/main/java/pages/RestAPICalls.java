package pages;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import org.testng.Assert;

import javax.xml.ws.http.HTTPException;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class RestAPICalls {


    public void GetUser() {

        Response response =
                given()
                        .baseUri("https://reqres.in/api/")
                        .header("Content-Type", "application/json; charset=utf-8")
                        .queryParam("id", "10")
                        .when()
                        .get("users")
                        .then()
                        .header("Content-Type", "application/json; charset=utf-8")
                        .extract().response();

        @SuppressWarnings("rawtypes")
        ResponseBody respbody = response.body();
        String respoBody = respbody.asString();
        //System.out.println(respoBody);

        JsonPath jp = new JsonPath(respoBody);
        int id = jp.getInt("data.id");
        String email = jp.get("data.email");
        String FN = jp.get("data.first_name");
        String LN = jp.get("data.last_name");
        String avatar = jp.get("data.avatar");

        System.out.println("Id: "+id);
        System.out.println("Email: " +email);
        System.out.println("First Name: " +FN);
        System.out.println("Last Name: " +LN);
        System.out.println("Avatar: " +avatar);

        Assert.assertEquals(email, "byron.fields@reqres.in");
        Assert.assertEquals(FN, "Byron");
        Assert.assertEquals(LN, "Fields");

        String responseHeader=response.getHeader("Content-Type");
        System.out.println(responseHeader);
        Assert.assertEquals(responseHeader, "application/json; charset=utf-8");

        int responseStat = response.getStatusCode();
        System.out.println("Response Status :" + responseStat);
        Assert.assertEquals(responseStat, 200);
    }

    @SuppressWarnings("unchecked")
    public void CreateUsr() {

        @SuppressWarnings("rawtypes")
        HashMap payloadBody = new HashMap();
        payloadBody.put("name", "Bryant");
        payloadBody.put("job", "BA");

        Response response =
                given()
                        .baseUri("https://reqres.in/api/")
                        .body(payloadBody)
                        .header("Content-Type", "application/json; charset=utf-8")
                        .when()
                        .post("users")
                        .then()
                        .statusCode(201)
                        .header("Content-Type", "application/json; charset=utf-8")
                        .extract().response();

        int responseStat = response.getStatusCode();
        System.out.println("Response Status :" + responseStat);
        Assert.assertEquals(responseStat, 201);

        String responseHeader=response.getHeader("Content-Type");
        System.out.println(responseHeader);
        Assert.assertEquals(responseHeader, "application/json; charset=utf-8");

        String ResponseBody=response.getBody().asString();
        System.out.println(ResponseBody);

        JsonPath js= new JsonPath(ResponseBody);
        int ID = js.getInt("id");
        String Name = js.get("name");
        String Job = js.get("job");

        System.out.println("Id: " + ID);
        System.out.println("Name: " + Name);
        System.out.println("Job: " + Job);

        Assert.assertEquals(Name, "Bryant");
        Assert.assertEquals(Job, "BA");
    }

}
