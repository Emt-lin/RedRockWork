package cn.demo2.domain;

/**
 * 员工类
 * @author psl
 */
public class Emp {
    private int empno;
    private String ename;
    private String job;
    private int epnumber;
    private String eaddress;
    private int age;
    private int deptno;

    public Emp(int empno, String ename, String job, int epnumber, String eaddress, int age, int deptno) {
        this.empno = empno;
        this.ename = ename;
        this.job = job;
        this.epnumber = epnumber;
        this.eaddress = eaddress;
        this.age = age;
        this.deptno = deptno;
    }

    public Emp() {
    }

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getEpnumber() {
        return epnumber;
    }

    public void setEpnumber(int epnumber) {
        this.epnumber = epnumber;
    }

    public String getEaddress() {
        return eaddress;
    }

    public void setEaddress(String eaddress) {
        this.eaddress = eaddress;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDeptno() {
        return deptno;
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "empno=" + empno +
                ", ename='" + ename + '\'' +
                ", job='" + job + '\'' +
                ", epnumber=" + epnumber +
                ", eaddress='" + eaddress + '\'' +
                ", age=" + age +
                ", deptno=" + deptno +
                '}';
    }
}
