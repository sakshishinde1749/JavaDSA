package OOPS;

// Abstraction : Hiding uneccessary deatails and showing only important part to user
// difference between encapsulation and abstration is encapsulation wrap up data and methods and help to 
// implement data hiding where abstration hides unimportant stuff and show important stuff to user


// Abstract class : 1.cannot create an instance(object) of abstract class
// 2. can have abstract or non-abstract method
// 3. can have constructors

public class Abstraction {
    
    public static void main(String args[]){
        Dog puppy = new Dog();
        puppy.eat();
        puppy.walk();
        Chicken chicks = new Chicken();

        // here when I am making object from BullDog class, animal then dog then bulldog constructor is getting called
        BullDog tommy = new BullDog();        
    }
}

abstract class Animal{
    String color;

    // we make constructor to define any property for its child class
    Animal(){           
        color = "brown";
        System.out.println("Animal constructor called..");
    }
    void eat(){
        System.out.println("animal eats");
    }

    abstract void walk();
}

class Dog extends Animal{
    Dog(){
        System.out.println("Dog constructor called..");
    }

    void changeColor(){
        color = "dark golden";
    }
    void walk(){
        System.out.println("walks on 4 legs");
    }
}

class BullDog extends Dog{
    BullDog(){
        System.out.println("bulldog constructor called..");
    }
}

class Chicken extends Animal{

    void changeColor(){
        color = "white";
    }
    void walk(){
        System.out.println("walks on 2 legs");
    }
}
