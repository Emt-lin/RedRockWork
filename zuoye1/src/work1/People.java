package work1;

 class People {
     private String name;
     private String gender;
     private int age;
     private int height;
     private String mind;

     public People(String name, String gender, int age, int height, String mind) {
         this.name = name;
         this.gender = gender;
         this.age = age;
         this.height = height;
         this.mind = mind;
     }
     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public String getGender() {
         return gender;
     }

     public void setGender(String gender) {
         this.gender = gender;
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

     public String getMind() {
         return mind;
     }

     public void setMind(String mind) {
         this.mind = mind;
     }

     @Override
     public String toString() {
         return "{"+ "name："+this.name+ "，gender："+this.gender +"，age："+this.age+ "，height："+this.height+ "，mind："+this.mind+ "}";
     }
 }
