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
        Chicken baby = new Chicken();
    }
}

abstract class Animal{
    void eat(){
        System.out.println("animal eats");
    }

    abstract void walk();
}

class Dog extends Animal{
    void walk(){
        System.out.println("walks on 4 legs");
    }
}

class Chicken extends Animal{
    void walk(){
        System.out.println("walks on 2 legs");
    }
}
