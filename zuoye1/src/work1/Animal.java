package work1;

abstract class Animal {
    int a=9;
    private String name;
    private int age;
    private int height;

    public Animal(String name, int age, int height) {
        this.name=name;
        this.age=age;
        this.height=height;
    }

    public abstract void shape();
    public abstract void character();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

}
