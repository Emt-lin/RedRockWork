package work1;

class Dog extends Animal{
    public Dog(String name, int age, int height) {
        super(name, age, height);
    }

    @Override
    public void shape() {
        System.out.println("体型一般般。。。");
    }

    @Override
    public void character() {
        System.out.println("能够保护主人");
    }
    @Override
    public String toString() {
        return "name：" + super.getName() + "\t" + "age：" + super.getAge() + "\t" + "height：" + super.getHeight();
    }
}
