package OOPS;

// Inheritance : Inheritance is when properties and methods of base class are passed onto derived class
// parent or base class - from which properties or methods are getting passed
// child or derived class - In which properties are getting passed

public class Inheritance {
   
    public static void main(String args[]){
        Fish shark = new Fish();
        shark.swim();
        shark.eat();
    }
    
}

// base class
class Animal{
    String color;

    void eat(){
        System.out.println("eats");
    }

    void breathes(){
        System.out.println("breathes");
    }
}

// derived or subclass
class Fish extends Animal{
    int fins;

    void swim(){
        System.out.println("swims in water");
    }
}
