package demoL2;

import demoL1.FileUtil;
import demoL1.Student;

import java.io.IOException;
import java.util.*;

/**
 * @author psl
 */
public class Demo {
    public static void main(String[] args) {
        String filePath = "src/students.txt";
        int count = 0;
        String name="";
        try {
            Student[] students = FileUtil.parseStudents(filePath);
            Map<String,Integer> map = new LinkedHashMap<>();

            /**
             * 放在一个map集合中
             */
            for (int i=0;i<students.length;i++){
                if (map.containsKey(students[i].getName())){
                   int cnt =  map.get(students[i].getName());
                   cnt ++;
                   map.put(students[i].getName(),cnt);
                }else {
                    map.put(students[i].getName(),1);
                }
            }

            Set<Map.Entry<String, Integer>> entries = map.entrySet();
            Iterator<Map.Entry<String,Integer>> iterator = entries.iterator();
            while (iterator.hasNext()){
                Map.Entry<String, Integer> m = iterator.next();
                if (count<m.getValue()){
                    count = m.getValue();
                    name = m.getKey();
                }
            }
            System.out.println("名字为："+ name );
            System.out.println("次数为"+count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
