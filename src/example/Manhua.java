package example;

import javax.jws.WebService;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

@WebService
public class Manhua {

    //访问网络返回状态码
    public String getStatus(String url) {

        int statusCode = 0;

        try {

            HttpURLConnection httpUrlConn = (HttpURLConnection) new URL(url).openConnection();
            // 设置连接主机超时（单位：毫秒）
            httpUrlConn.setConnectTimeout(1000);
            // 设置从主机读取数据超时（单位：毫秒）
            httpUrlConn.setReadTimeout(1000);
            statusCode= httpUrlConn.getResponseCode();

            httpUrlConn.disconnect();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (statusCode == 200)
        {
            return "200";
        }else {
            return "404";
        }

    }

}
