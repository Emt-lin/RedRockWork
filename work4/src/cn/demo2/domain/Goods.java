package cn.demo2.domain;

/**
 * 商品类
 * @author psl
 */
public class Goods {
    private int gnumber;
    private String gname;
    private int cost;
    private int price;
    private int deptno;
    private String sname;

    public Goods(int gnumber, String gname, int cost, int price, int deptno, String sname) {
        this.gnumber = gnumber;
        this.gname = gname;
        this.cost = cost;
        this.price = price;
        this.deptno = deptno;
        this.sname = sname;
    }

    public Goods() {
    }

    public int getGnumber() {
        return gnumber;
    }

    public void setGnumber(int gnumber) {
        this.gnumber = gnumber;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDeptno() {
        return deptno;
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "gnumber=" + gnumber +
                ", gname='" + gname + '\'' +
                ", cost=" + cost +
                ", price=" + price +
                ", deptno=" + deptno +
                ", sname='" + sname + '\'' +
                '}';
    }
}
