package work1;

class Cat extends Animal{
     int a=1;
    public Cat(String name,int age,int height){
        super(name,age,height);
    }
    public void xx(){
        System.out.println("你好");
    }
    @Override
    public void shape() {
        System.out.println("猫的体型小。。。。。");
    }

    @Override
    public void character() {
        System.out.println("温和，很好。。。");
    }
    @Override
    public String toString() {
        return "name：" + super.getName() + "\t" + "age：" + super.getAge() + "\t" + "height：" + super.getHeight();
    }
}
