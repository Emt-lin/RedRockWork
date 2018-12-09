package cn.demo2.domain;

/**
 * 部门类
 * @author psl
 */
public class Dept {
    private int deptno;
    private int fee;
    private String dname;
    private int pnumber;
    private String address;
    private String gname;

    public Dept(int deptno, int fee, String dname, int pnumber, String address, String gname) {
        this.deptno = deptno;
        this.fee = fee;
        this.dname = dname;
        this.pnumber = pnumber;
        this.address = address;
        this.gname = gname;
    }

    public Dept() {
    }

    public int getDeptno() {
        return deptno;
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public int getPnumber() {
        return pnumber;
    }

    public void setPnumber(int pnumber) {
        this.pnumber = pnumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "deptno=" + deptno +
                ", fee=" + fee +
                ", dname='" + dname + '\'' +
                ", pnumber=" + pnumber +
                ", address='" + address + '\'' +
                ", gname='" + gname + '\'' +
                '}';
    }
}
