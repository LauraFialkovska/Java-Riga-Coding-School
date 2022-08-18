package lesson_20220728;

// Add "json-20220320.jar" to "lib" folder
import org.json.JSONArray;
import org.json.JSONObject;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class JavaHttpURLConnectionDemo {
    public static void main(String[] args) {

        String URL = "https://jsonplaceholder.typicode.com/posts";

        HttpClient  client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(URL)).build();

        client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::body)
//                .thenAccept(System.out::println)
                .thenApply(JavaHttpURLConnectionDemo::format)
                .join();

        // -> lambda
        // :: method reference
    }

    // ToDo: make a "formatting" method
    public static String format(String responseBody) {
        JSONArray posts = new JSONArray(responseBody);

        for (int i = 0; i < posts.length(); i++) {
            JSONObject post = posts.getJSONObject(i);

            int id = post.getInt("id");
            String title = post.getString("title");
            String body = post.getString("body");

            System.out.println(id + "\n" + title + "\n" + body);
        }

        return null;
    }
}
