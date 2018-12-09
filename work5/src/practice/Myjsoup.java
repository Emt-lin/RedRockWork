package practice;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

/**
 * @author psl
 */
public class Myjsoup {
    public static void main(String[] args) throws Exception {
        Document doc = Jsoup.connect("http://www.itcast.cn").get();
//        Elements a = doc.getElementsByTag("a");
//        System.out.println(a.text());
        Elements select = doc.select("div.nav_txt a");
//        System.out.println(select);
        for (Element e: select
             ) {
            System.out.println(e.text()+":\t"+e.attr("href"));
        }

    }
}
