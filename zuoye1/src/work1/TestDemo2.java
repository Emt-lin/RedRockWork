package work1;

public class TestDemo2 {
    public static void main(String[] args) {
        Cat cat = new Cat("加菲猫",3,20);
        Dog dog = new Dog("中华田园犬",2,30);
        Tiger tiger = new Tiger("东北虎",7,40);
//        Animal A= new Cat("加菲猫",3,20);
//        System.out.println(cat.a);
//        System.out.println(A.a);

//        System.out.println(cat);
        function(cat);
        System.out.println(dog);
        function(dog);
        System.out.println(tiger);
        function(tiger);
    }
    public static void function(Animal animal){
        System.out.println(animal);
        animal.shape();
        animal.character();
    }
}
