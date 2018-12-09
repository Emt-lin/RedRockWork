package cn.itcast.student;

import java.util.List;

/**
 * 班级的javaBean对象
 * @author psl
 */
public class StudentBean {


    private int code;
    private String info;
    private List<ReturnDataBean> returnData;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public List<ReturnDataBean> getReturnData() {
        return returnData;
    }

    public void setReturnData(List<ReturnDataBean> returnData) {
        this.returnData = returnData;
    }

    public static class ReturnDataBean {
        /**
         * bj : 04011701
         * csrq : 19990417
         * mz : 汉族
         * nj : 2017
         * rxrq : 201709
         * xb : 女
         * xh : 2017211760
         * xjzt : 在校
         * xm : 汤尹思
         * xmEn : Tang Yin Si
         * xz : 4
         * yxh : 04
         * yxm : 计算机科学与技术学院
         * yxmen : School of Computer Science and Technology
         * zyh : 0401
         * zym : 计算机科学与技术
         * zymEn : Computer Science and Technology
         */

        private String bj;
        private String csrq;
        private String mz;
        private String nj;
        private String rxrq;
        private String xb;
        private String xh;
        private String xjzt;
        private String xm;
        private String xmEn;
        private int xz;
        private String yxh;
        private String yxm;
        private String yxmen;
        private String zyh;
        private String zym;
        private String zymEn;

        public String getBj() {
            return bj;
        }

        public void setBj(String bj) {
            this.bj = bj;
        }

        public String getCsrq() {
            return csrq;
        }

        public void setCsrq(String csrq) {
            this.csrq = csrq;
        }

        public String getMz() {
            return mz;
        }

        public void setMz(String mz) {
            this.mz = mz;
        }

        public String getNj() {
            return nj;
        }

        public void setNj(String nj) {
            this.nj = nj;
        }

        public String getRxrq() {
            return rxrq;
        }

        public void setRxrq(String rxrq) {
            this.rxrq = rxrq;
        }

        public String getXb() {
            return xb;
        }

        public void setXb(String xb) {
            this.xb = xb;
        }

        public String getXh() {
            return xh;
        }

        public void setXh(String xh) {
            this.xh = xh;
        }

        public String getXjzt() {
            return xjzt;
        }

        public void setXjzt(String xjzt) {
            this.xjzt = xjzt;
        }

        public String getXm() {
            return xm;
        }

        public void setXm(String xm) {
            this.xm = xm;
        }

        public String getXmEn() {
            return xmEn;
        }

        public void setXmEn(String xmEn) {
            this.xmEn = xmEn;
        }

        public int getXz() {
            return xz;
        }

        public void setXz(int xz) {
            this.xz = xz;
        }

        public String getYxh() {
            return yxh;
        }

        public void setYxh(String yxh) {
            this.yxh = yxh;
        }

        public String getYxm() {
            return yxm;
        }

        public void setYxm(String yxm) {
            this.yxm = yxm;
        }

        public String getYxmen() {
            return yxmen;
        }

        public void setYxmen(String yxmen) {
            this.yxmen = yxmen;
        }

        public String getZyh() {
            return zyh;
        }

        public void setZyh(String zyh) {
            this.zyh = zyh;
        }

        public String getZym() {
            return zym;
        }

        public void setZym(String zym) {
            this.zym = zym;
        }

        public String getZymEn() {
            return zymEn;
        }

        public void setZymEn(String zymEn) {
            this.zymEn = zymEn;
        }

        @Override
        public String toString() {
            return "ReturnDataBean{" +
                    "bj='" + bj + '\'' +
                    ", csrq='" + csrq + '\'' +
                    ", mz='" + mz + '\'' +
                    ", nj='" + nj + '\'' +
                    ", rxrq='" + rxrq + '\'' +
                    ", xb='" + xb + '\'' +
                    ", xh='" + xh + '\'' +
                    ", xjzt='" + xjzt + '\'' +
                    ", xm='" + xm + '\'' +
                    ", xmEn='" + xmEn + '\'' +
                    ", xz=" + xz +
                    ", yxh='" + yxh + '\'' +
                    ", yxm='" + yxm + '\'' +
                    ", yxmen='" + yxmen + '\'' +
                    ", zyh='" + zyh + '\'' +
                    ", zym='" + zym + '\'' +
                    ", zymEn='" + zymEn + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "StudentBean{" +
                "code=" + code +
                ", info='" + info + '\'' +
                ", returnData=" + returnData +
                '}';
    }
}
