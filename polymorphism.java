import java.util.*;

class Animal{
    int legs;
    String name;
    protected void setLegs(int legs){
        this.legs = legs;
    }
    Animal(){
        System.out.println("New animal object is created!");
    }
}

class Cat extends Animal{
    Cat(){
System.out.println("New cat object is created!");
    }

    protected void sound(String name, int legs){
    System.out.println(name + " has " + legs + " legs and it sounds MEOW.");
    }
}

class Dog extends Animal{
        Dog(){
System.out.println("New dog object is created!");
    }
        
    protected void sound(String name, int legs){
    System.out.println(name + " has " + legs + " legs and it sounds BHOW.");
    }
}

class Main{
    public static void main(String[] args){
        String text = "hi";
        Animal animal = new Animal();
        Animal animal1 = new Animal();
        Cat cat = new Cat();
        Dog dog = new Dog();
        dog.sound("Ballu", 4);
        cat.sound("Billu", 4);
        animal.setLegs(6);
        animal1.setLegs(5);
        Scanner scan = new Scanner(System.in);
        int choice = scan.nextInt();
        String choice1 = scan.next();
        if (choice == 0){
            System.out.println(animal.legs);
        } else if (choice == 1){
            System.out.println(animal1.legs);
        } 
         if (choice1 == text){
            System.out.println(choice1);
        }
        
    }
}