package cn.itcast.demo;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;


/**
 * 得到json数据
 * @author psl
 */
public class GetEntity {
//    public static void main(String[] args) {
//        get();
//    }
    public static String get() {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        String entityr = "";
        HttpGet httpGet = new HttpGet("http://jwzx.cqupt.edu.cn/data/json_StudentSearch.php?searchKey=04011701");
//        HttpGet httpGet = new HttpGet("http://www.itcast.cn");
        httpGet.addHeader("User-Agent",
                "Mozilla/5.0 (Windows NT 10.0; Win64; x64) " +
                        "AppleWebKit/537.36 (KHTML, like Gecko) Chrome/71.0.3573.0 Safari/537.36");
        try{
            //获得Response
            CloseableHttpResponse response = httpClient.execute(httpGet);
            if(response.getStatusLine().getStatusCode() == 200){
                //当响应状态码为200时，获得该网页源码并打印
                String entity = EntityUtils.toString(response.getEntity(),"utf-8");
                entityr = entity;
//                System.out.println(entity);
            }

        }catch(Exception e){
            e.printStackTrace();
        }
        return entityr;
    }

}

