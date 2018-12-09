package work2;

import java.io.Serializable;

/**
 * @author psl
 * 学生的班级
 */
public class ClassOne implements Serializable {
    private Student student;
    private String classid;

    public ClassOne(Student student, String classid) {
        this.student = student;
        this.classid = classid;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getClassid() {
        return classid;
    }

    public void setClassid(String classid) {
        this.classid = classid;
    }
    @Override
    public boolean equals(Object obj) {
        if(this==obj)
            return true;
        if(obj==null)
            return false;
        if(!(obj instanceof ClassOne))
            return false;
        ClassOne classOne = (ClassOne)obj;
        if(this.getStudent().getName().equals(classOne.getStudent().getName())&&this.getStudent().getStuid()==classOne.getStudent().getStuid())
            return true;
        return  false;
    }

    @Override
    public String toString() {
        return "班级："+this.classid+"\t姓名："+this.student.getName()+"\t学号："+this.student.getStuid()+"\t\t年龄："+this.student.getAge()+"\t性别："+this.student.getGender();
    }
}
