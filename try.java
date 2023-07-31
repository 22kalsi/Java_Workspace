


class Student{
String name;
int age;

private void printInfo(){
    System.out.println("Hello " + this.name + " Your age is " + this.age + " years.");
}

public void printInfo(int age){
    System.out.println(this.name + "'s age is " + this.age);
}

public void printInfo(String name){
    System.out.println(this.name + " is of " + this.age + " years old.");
}

Student( String name, int age) {
    if (age < 10){
        age = 0;
    } else {
        age = age;
    }
    this.name = name;
    System.out.println("A new object Naming " + name + " & of Age " + age + " has been created" );
}

// Student() {

//     System.out.println("A new object Naming " + name + " & of Age " + age + " has been created" );
// }
}

class Try{
    public static void main(String[] args){
Student s1 = new Student("Gursewak Singh", 19);
// s1.name = "Gursewak Singh";
// s1.age  = 32;
Student s2 = new Student("Amandeep Kaur", 8);
// Student s2 = new Student() ;
// s2.name = "Amandeep Kaur";
// s2.age = 31;

// s1.printInfo();
    }
}

