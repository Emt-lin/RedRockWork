package work2;

import java.io.Serializable;

/**
 * @author psl
 * 学生的基本信息
 */
public class Student implements Serializable {
    private String name;
    private int stuid;
    private int age;
    private String gender;

    public Student(String name, int stuid, int age, String gender) {
        this.name = name;
        this.stuid = stuid;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStuid() {
        return stuid;
    }

    public void setStuid(int stuid) {
        this.stuid = stuid;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
