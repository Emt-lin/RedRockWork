package practice;

import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.conn.params.ConnRoutePNames;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.CoreConnectionPNames;
import org.apache.http.util.EntityUtils;
import sun.plugin.dom.core.CoreConstants;


/**
 * @author psl
 */
public class MyHttpClient {
    public static void main(String[] args) throws Exception {
        //创建HttpClient对象
        HttpClient hc = new DefaultHttpClient();
        //设置响应时间，设置传播源码时间，设置代理服务器
        hc.getParams().setParameter(CoreConnectionPNames.CONNECTION_TIMEOUT,10000).
                setParameter(CoreConnectionPNames.SO_TIMEOUT,10000).
                setParameter(ConnRoutePNames.DEFAULT_PROXY,new HttpHost("116.7.176.170",8118));
        //url是get请求
        HttpGet hg = new HttpGet("http://www.itcast.cn/");
        //发送请求，获取网页源码
        HttpResponse response = hc.execute(hg);
        //解析转换成字符串
        String s = EntityUtils.toString(response.getEntity(), "utf-8");
        System.out.println(s);
    }
}
