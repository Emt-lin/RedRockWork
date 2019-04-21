package com.example.pachong.mybatis.service;

import com.example.pachong.mybatis.domain.Kebiao;
import com.example.pachong.mybatis.domain.Student;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author psl
 * @date 2019/4/7
 */
public class GetData {

    private static final String STATUS = "必修";
    private static final String MINGDANG = "名单";


    public static String getString(Integer urlId) {
        // 创建httpClient实例
        CloseableHttpClient httpClient = HttpClients.createDefault();
        // 创建httpget实例
        HttpGet httpGet = new HttpGet("http://jwzx.cqupt.edu.cn/kebiao/kb_stu.php?xh=" + urlId);
        // 设置请求头信息Uer-Agent模拟浏览器
        httpGet.setHeader("User-Agent",
                "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:58.0) Gecko/20100101 Firefox/58.0");
        // 执行httpget请求
        CloseableHttpResponse response = null;
        String s = null;
        try {
            response = httpClient.execute(httpGet);
            HttpEntity entity = response.getEntity();
            s = EntityUtils.toString(entity, "utf-8");

        } catch (IOException e) {
            e.printStackTrace();
        }
        return s;
    }
    public static String getDataCut(Integer urlId) {
        String s = getString(urlId);
        if ( s == null){
            return null;
        }
        String s1 = s.replaceAll("\n|\t|\r", "");
        String regex = "<div id=\"kbStuTabs-list\">(.*?)<div  id=\"kbStuTabs-ttk\">";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s1);
        while (m.find()){
            return m.group(1);
        }
        return null;
    }

    public static Student getUser(Integer urlId){
        String s = getString(urlId);
        String s1 = s.replaceAll("\n|\t|\r", "");
        String regex = "<li>〉〉2018-2019学年2学期 学生课表>>(\\d+)(.+)  </li></ul></div>";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s1);

        while (m.find()){
            Student student = new Student();
            student.setId(Integer.valueOf(m.group(1)));
            student.setSname(m.group(2));
            return student;
        }
        return null;
    }
    public static List<Kebiao> getTime(Integer urlId){
        String s = GetData.getDataCut(urlId);
        if (s == null){
            return null;
        }
        String regex = "(<tr ><td rowspan='\\d' align='center'>(.{1,10})</td>\\s\\s<td rowspan='\\d'>(.{1,50})</td><td rowspan='\\d'>(\\w+?)</td><td rowspan='\\d'>(.{2})</td><td rowspan='\\d' align='center'>(.{1,5}) </td>" +
                "<td>(.{2,8})</td> <td>(星期\\d)第(.{3,4}节) ((.{1,5}周(.{2})?)(,(.{1,5})周(.周)?)*)</td><td>(.*?)</td><td rowspan='\\d'></td></tr>){1}" +
                "(<tr><td >(.{2,6}) </td><td>(星期\\d) 第(.{3,5}节)(.{1,5}周(.周)?(,(.{1,5})周(.周)?)*) </td><td>(.*?)</td></tr>)*";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);
        int count = 0;
        List<Kebiao> list = new ArrayList<>();
        while (m.find()){

            Kebiao k = new Kebiao();
            k.setCname(m.group(3));
            k.setClassNum(m.group(4));
            k.setType(m.group(5));
            if (k.getType().equals(STATUS)){
                k.setState(true);
            }
            k.setStatus(m.group(6));
            k.setTeacher(m.group(7));
            k.setDay(m.group(8));
            k.setLession(m.group(9));
            k.setWeek(m.group(10));
            String ss = "</td><td rowspan='1' ";
            if (m.group(16).contains("align='center'><a href=")){
                int in = m.group(16).indexOf("align='center'><a href=");
                k.setPlace(m.group(16).substring(0,in-ss.length()));
            }else {
                k.setPlace(m.group(16));
            }
            if (m.group(17) != null){
                String s2 = MINGDANG;
                String s3 = "</a></td><td rowspan='2'></td></tr>";
                int index = m.group().indexOf(s2);
                String substring = m.group().substring(index + s3.length()+s2.length());
                String regex2 = "<tr><td >(.{2,6}) </td><td>(星期\\d) 第(.{3,5}节)(.{1,5}周(.周)?(,(.{1,5})周(.周)?)*) </td><td>(.*?)</td></tr>";
                Pattern p1 = Pattern.compile(regex2);
                Matcher m1 = p1.matcher(substring);
                while (m1.find()){
                    Kebiao k1 = new Kebiao();
                    k1.setCname(m.group(3));
                    k1.setClassNum(m.group(4));
                    k1.setType(m.group(5));
                    if (k1.getType().equals(STATUS)){
                        k1.setState(true);
                    }
                    k1.setStatus(m.group(6));
                    k1.setTeacher(m1.group(1));
                    k1.setDay(m1.group(2));
                    k1.setLession(m1.group(3));
                    k1.setWeek(m1.group(4));
                    k1.setPlace(m1.group(9));
                    list.add(k1);
                }
            }
            list.add(k);
        }
        return list;
    }
}
