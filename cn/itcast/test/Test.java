package cn.itcast.test;

import cn.itcast.dataBase.Update;
import cn.itcast.demo.GetEntity;
import cn.itcast.json.Demo1;
import cn.itcast.student.StudentBean;

/**
 * 最终的测试结果
 * @author psl
 */
public class Test {
    public static void main(String[] args) {
        String s = GetEntity.get();
        StudentBean solve = Demo1.solve(s);
        Update.add(solve);
    }
}
