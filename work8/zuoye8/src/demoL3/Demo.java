package demoL3;

import org.junit.Test;

/**
 * @author psl
 */
public class Demo {
    @Test
    public void fun1(){
        long l = System.currentTimeMillis();
        System.out.println(l);
        int count = 0;
        for (int i=1970;i<=2018;i++){
            if(i%4==0&&i%100!=0||i%400==0){
                count++;
            }
        }
        int year = 365*24*60*60;
        int month = 30*24*60*60;
        int day = 1*24*60*60;
        long l1 = l % year;
        long l3 = l / year;
        long l2 = l1 % month;
        System.out.println(l3);
        System.out.println(l1);
    }
}
