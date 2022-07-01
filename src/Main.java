import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException, IllegalAccessException {
        RestApiCalls callApi = new RestApiCalls();
        MenuList printMenu = new MenuList();

        System.out.println(callApi.createConnection("https://wft-geo-db.p.rapidapi.com/v1/geo/adminDivisions"));
    }
}
