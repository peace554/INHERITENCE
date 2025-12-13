public class Dog extends Animal {
    public String name;
    public int age;
    String breed;

    public Dog(String name, int age, String name1, String breed, int age1) {
        super(name, age);
        this.name = name1;
        this.breed = breed;
        this.age = age1;
    }
    //@Override
    public void displaystatus(){
        super.displayInfor();
        System.out.println("Breed:"+breed);
    }
}
