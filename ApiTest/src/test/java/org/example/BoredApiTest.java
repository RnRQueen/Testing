package org.example;

import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.testng.AssertJUnit.assertEquals;

public class BoredApiTest {
    @Test
    public void boredApiTest() {
        HttpResponse<JsonNode> response = Unirest.get("http://www.boredapi.com/api/activity/")
                .queryString("type", "recreational")
                .asJson();
        String result = response.getBody().getObject().getString("type");
        assertEquals("recreational", result);
        assertEquals(200, response.getStatus());
    }

    @Test
    public void failedTest(){
        assertTrue(false);
    }
}