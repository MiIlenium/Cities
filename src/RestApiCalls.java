import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class RestApiCalls {

    public Object createConnection(String requiredUrl) throws IOException{


        Object response;
        //Specify required URL
        URL url = new URL(requiredUrl);
        //Connect to provided URL
        HttpURLConnection httpURLConnection = (HttpURLConnection)url.openConnection();

        httpURLConnection.setRequestProperty("X-RapidAPI-Key", "f885595c4cmsh8d9fc999394aa34p1170c2jsn97ab23a021d7");
        httpURLConnection.setRequestProperty("X-RapidAPI-Host", "wft-geo-db.p.rapidapi.com");
        httpURLConnection.setRequestMethod("GET");

        response = httpURLConnection.getInputStream();
        /*
        if(httpURLConnection.getResponseCode() == 200 || httpURLConnection.getResponseCode() == 201){
            response = httpURLConnection.getContentEncoding();
        }else{
            response = "Connection couldn't be established";
        }
*/
        httpURLConnection.disconnect();

        return response;
    }

    public Object getCities() throws IOException, IllegalAccessException {
        return createConnection("https://wft-geo-db.p.rapidapi.com/v1/geo/adminDivision");
    }
}
