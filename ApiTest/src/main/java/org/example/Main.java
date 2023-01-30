package org.example;

import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class Main {
    public static void main(String[] args) {
    }
    @Test
    static void boredApiTest() {
        HttpResponse<JsonNode> response = Unirest.get("http://www.boredapi.com/api/activity/")
                .queryString("type", "recreational")
                .asJson();
        String result = response.getBody().getObject().getString("type");
        assertEquals("recreational", result);
        assertEquals(200, response.getStatus());
    }
}