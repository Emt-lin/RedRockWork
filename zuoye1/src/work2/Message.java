package work2;


import java.io.*;
import java.util.*;


/**
 * @author psl
 *
 */
public class Message {
    public static void main(String[] args) {
        List<ClassOne> list = new ArrayList<>();//创建ClassOne类型的集合
        //添加元素到集合中
        listAdd(list,"张三",2017211900,19,"男","04011701");
        listAdd(list,"李四",2017211905,18,"男","04011701");
        listAdd(list,"王二",2017211908,19,"男","04011701");
        listAdd(list,"桐人",2017211903,18,"男","04011701");
        listAdd(list,"亚丝娜",2017211910,18,"女","04011701");
        //删除集合中某个元素
        //list.remove(new ClassOne(new Student("张三",2017211900,19,"男"),"04011701"));
        //outPut1(list);//第一种输出方法
        //outPut2(list);//第二种和第三输出方法
        sort1(list);//升序排序
        //outPut1(list);//升序排序后输出
        sort2(list);//降序排序
        //outPut1(list);//降序排序后的输出
//        ser(list);//序列化
//        dser();//反序列化
    }


    public static void listAdd(List<ClassOne> list,String name,int stuid,int age,String gender,String classid){//添加元素到集合中
        list.add(new ClassOne(new Student(name,stuid,age,gender),classid));
    }

    public static void outPut1(List<ClassOne> list){//第一种输出方法
        System.out.println("第一种输出");
        for (ClassOne c:list
             ) {
            System.out.println(c);
        }
    }
    public static void outPut2(List<ClassOne> list) {//第二种和第三输出方法
        System.out.println("第二种输出");
        Iterator<ClassOne> iter = list.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        System.out.println("第三种输出");
        System.out.println(list);
    }
    public static void sort1(List<ClassOne> list){//进行升序排序
        Collections.sort(list, new Comparator<ClassOne>() {
            @Override
            public int compare(ClassOne c1, ClassOne c2) {
                if (c1.getStudent().getStuid()>c2.getStudent().getStuid())
                    return 1;
                else if (c1.getStudent().getStuid()==c2.getStudent().getStuid())
                    return 0;
                else
                    return -1;
            }
        });
    }
    public static void sort2(List<ClassOne> list){//进行降序排序
        Collections.sort(list, new Comparator<ClassOne>() {
            @Override
            public int compare(ClassOne c1, ClassOne c2) {
                if (c1.getStudent().getStuid()<c2.getStudent().getStuid())
                    return 1;
                else if (c1.getStudent().getStuid()==c2.getStudent().getStuid())
                    return 0;
                else
                    return -1;
            }
        });
    }
    public static void ser(List<ClassOne> list){//序列化
        ObjectOutputStream outputStream =null;
        ClassOne classOne = new ClassOne(new Student("张三",2017211900,19,"男"),"04011701");
        try {
             outputStream= new ObjectOutputStream(new FileOutputStream("text.txt"));
            outputStream.writeObject(classOne);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void dser(){//反序列化
        ObjectInputStream inputStream = null;
        try {
             inputStream = new ObjectInputStream(new FileInputStream("text.txt"));
             Object obj = inputStream.readObject();
             ClassOne classOne = (ClassOne)obj;
            System.out.println(classOne);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
