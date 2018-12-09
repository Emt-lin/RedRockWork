package work1;

public class Demo {
    public static void main(String[] args) {
        People people = new People("小明","男",18,175,"happy");
        System.out.println(people);
        System.out.println("{");
        System.out.println("\t"+"name："+people.getName()+",");
        System.out.println("\t"+"gender："+people.getGender()+",");
        System.out.println("\t"+"age："+people.getAge()+",");
        System.out.println("\t"+"height："+people.getHeight()+",");
        System.out.println("\t"+"mind："+people.getMind());
        System.out.println("}");
    }
}
