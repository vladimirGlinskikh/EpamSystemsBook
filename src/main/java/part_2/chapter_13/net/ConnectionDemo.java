package part_2.chapter_13.net;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class ConnectionDemo {
    public static void main(String[] args) {
        String urlName = "http://www.zhelezyaka.kz";
        int timeout = 10_000_000;
        URL url;
        try {
            url = new URL(urlName);
            final URLConnection connection = url.openConnection();
            connection.setConnectTimeout(timeout);
            System.out.println(urlName + " content type: "
                    + connection.getContentType());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
