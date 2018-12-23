package demoL1;

import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author psl
 */
public class Demo {
    public static void main(String[] args) {
        String  filePath = "src/students.txt";
        try {
            Student[] students = FileUtil.parseStudents(filePath);
            String uid= "2017211937";
            int low=0,high=students.length-1;
            while (low<=high){
                int mid = low+high;
                int flag = students[mid].getStuid().compareTo(uid);
                if (flag==0){
                    System.out.println(students[mid].getName());
                    break;
                }
                else if (flag>0) high = mid-1;
                else if (flag<0) low = mid + 1;
            }
            if (low>=high)
                System.out.println("该学生不存在");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
