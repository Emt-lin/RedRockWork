package cn.itcast.json;

import cn.itcast.student.StudentBean;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * 用JSONObject或者JSONArray来解析
 * @author psl
 */
public class Demo1 {
    public static StudentBean solve(String s) {
        JSONObject jsonObject =  JSONObject.fromObject(s);//获得JSONObject对象
        JSONArray returnData = jsonObject.optJSONArray("returnData");

        int code = jsonObject.optInt("code");
        String info = jsonObject.optString("info");
        //创建一个StudentBean对象
        StudentBean studentBean = new StudentBean();
        studentBean.setCode(code);
        studentBean.setInfo(info);
        //创建一个集合
        List<StudentBean.ReturnDataBean> returnDataBeans = new ArrayList<>();
        for (int i=0;i<returnData.size();i++){//遍历数组

            JSONObject jsonObject1 = returnData.optJSONObject(i);

            if (jsonObject1 != null){//添加数据到对象中
                StudentBean.ReturnDataBean returnDataBean = new StudentBean.ReturnDataBean();
                String bj = jsonObject1.optString("bj");
                returnDataBean.setBj(bj);
                String csrq = jsonObject1.optString("csrq");
                returnDataBean.setCsrq(csrq);
                String mz = jsonObject1.optString("mz");
                returnDataBean.setMz(mz);
                String nj = jsonObject1.optString("nj");
                returnDataBean.setNj(nj);
                String rxrq = jsonObject1.optString("rxrq");
                returnDataBean.setRxrq(rxrq);
                String xb = jsonObject1.optString("xb");
                returnDataBean.setXb(xb);
                String xh = jsonObject1.optString("xh");
                returnDataBean.setXh(xh);
                String xjzt = jsonObject1.optString("xjzt");
                returnDataBean.setXjzt(xjzt);
                String xm = jsonObject1.optString("xm");
                returnDataBean.setXm(xm);
                String xmEn = jsonObject1.optString("xmEn");
                returnDataBean.setXmEn(xmEn);
                int xz = jsonObject1.optInt("xz");
                returnDataBean.setXz(xz);
                String yxh = jsonObject1.optString("yxh");
                returnDataBean.setYxh(yxh);
                String yxm = jsonObject1.optString("yxm");
                returnDataBean.setYxm(yxm);
                String yxmen = jsonObject1.optString("yxmen");
                returnDataBean.setYxmen(yxmen);
                String zyh = jsonObject1.optString("zyh");
                returnDataBean.setZyh(zyh);
                String zym = jsonObject1.optString("zym");
                returnDataBean.setZym(zym);
                String zymEn = jsonObject1.optString("zymEn");
                returnDataBean.setZymEn(zymEn);
                returnDataBeans.add(returnDataBean);//数据添加到List集合中
            }
        }
        studentBean.setReturnData(returnDataBeans);
        return studentBean;
//        System.out.println(studentBean);
    }
}
