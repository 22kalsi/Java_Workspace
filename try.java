class Animal{
int legs;
    Animal(){
        System.out.println("A new Animal class object is created");
    }
    public void hello(String name){
System.out.println("hello " + legs);
}
    public void sound(){
        System.out.println("Animal can make sound");
    }
}

class Cat extends Animal{
    int tails;
    Cat(){
        System.out.println("A new Cat class object is created");
    }

    public void sound(){
        System.out.println("Cat is a one tail animal which makes a sound Meow");
    }
}

class Dog extends Animal{
    
    Dog(){
        System.out.println("A new Dog class object is created");
       
    }

    public void sound(){
        System.out.println("Dog is a four leg animal which Bark");
    }
}

class RunTimePollymorphism{
public static void main(String[] args){
Animal a = new Animal();
Cat c = new Cat();
Cat c1 = new Cat();
Dog d = new Dog();

c.legs = 5;
c.tails = 1;
c1.legs = 4;
c1.tails = 2;
d.legs = 4;
c.sound();
c1.sound();
d.sound();
c1.hello(" Gursewak");
c.hello(" Gursewak");
d.hello(" Gursewak");
}
}