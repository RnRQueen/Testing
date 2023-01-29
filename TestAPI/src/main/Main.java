import kong.unirest.Unirest;
import org.junit.jupiter.api.Test;
public class Main {
    public static void Main (String[] args) {
    }
        @Test
        public static void boredApiTest {
            HttpResponse<JsonNode> response =
                    Unirest.get("http://www.boredapi.com/api/activity/")
                    .queryString("type", "recreational")
                            .asJson();
        }
        string result = response.getBody().getObject().getString("type");
        System.out.println();
}
