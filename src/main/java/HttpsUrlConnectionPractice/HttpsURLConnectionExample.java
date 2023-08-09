package HttpsUrlConnectionPractice;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HttpsURLConnectionExample {
    private static final String baseURL = "http://api.weatherstack.com/";

    public static void main(String[] args) throws IOException, ParseException {
        //The code follows an example from https://www.twilio.com/blog/5-ways-to-make-http-requests-in-java

        //Create URL to access
        URL url = new URL(baseURL + "current?access_key=" + API_KEYS.WEATHER_KEY + "&query=Indiana");
        //Open a connection
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        if (connection.getResponseCode() == HttpURLConnection.HTTP_OK) {
            System.out.printf("Connection successful! (%d)\n", connection.getResponseCode());
            BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            JSONObject response = (JSONObject) new JSONParser().parse(br.readLine());
            System.out.println(response.toJSONString());
        } else {
            System.out.print("Connection failed!\n");
        }
    }
}
