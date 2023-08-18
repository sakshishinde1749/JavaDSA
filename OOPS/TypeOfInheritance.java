package OOPS;

// 1. single level inheritance: It has one level of inheritance, single derived class with single base class
// 2. multi level inheritance: It has mulitple level of inheritance, take a look at animal mammal dog example below
// 3. hierarchial inheritance: It has single base class with multiple derived class, take a look at mammal,Fish,bird class example
// 4. hybrid inheritance: mixture of base and derived classes

public class TypeOfInheritance {
    
    public static void main(String args[]){
        Dog tommy = new Dog();
        tommy.legs = 4;
        tommy.color = "black";
        System.out.println(tommy.legs);
    }

}

class Animal{
    String color;

    void eat(){
        System.out.println("eats");
    }

    void breathes(){
        System.out.println("breathes");
    }
}

class Mammal extends Animal{
    int legs;

    void walk(){
        System.out.println("walk");
    }
}

class Dog extends Mammal{
    String breeds;
}

class Fish extends Animal{
    void swim(){
        System.out.println("swims");
    }
}

class Birds extends Animal{
    void fly(){
        System.out.println("fly");
    }
}
