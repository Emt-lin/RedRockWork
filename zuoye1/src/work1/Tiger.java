package work1;

class Tiger extends Animal{
    public Tiger(String name, int age, int height) {
        super(name, age, height);
    }

    @Override
    public void shape() {
        System.out.println("形状很大。。。。");
    }

    @Override
    public void character() {
        System.out.println("很凶狠，很暴力");
    }

    @Override
    public String toString() {
        return "name：" + super.getName() + "\t" + "age：" + super.getAge() + "\t" + "height：" + super.getHeight();
    }
}
