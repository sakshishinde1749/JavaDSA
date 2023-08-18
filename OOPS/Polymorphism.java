package OOPS;

// poly means many and morph means forms
// Polymorphism : when we try to achieve same thing with multiple forms like with the help of different 
// constructor we were trying to achieve one thing which is object forming

// 1. compile time polymorphism (static) : method overloading
// 2. run time polymorphism (dynamic) : method overriding

// method overloading: same functions with different parameters
// method overriding: parent and child both classes contains same function with different defination

public class Polymorphism {
    
    public static void main(String args[]){
        Calculator cal = new Calculator();
        //method overloading
        //It knows during compile time which function to call that's why this is compile type polymorphism
        System.out.println(cal.sum(2, 3));
        System.out.println(cal.sum((float)2.3, (float)4.3));
        System.out.println(cal.sum(2, 3, 4));

        //method overriding
        Dear dear = new Dear();
        dear.eat();   // considering child function
    }
}

//method overloading
class Calculator{

    int sum(int a, int b){
        return a + b;
    }

    float sum(float a, float b){
        return a + b;
    }

    int sum(int a, int b, int c){
        return a + b + c;
    }
}


//method overriding
class Animal{
    void eat(){
        System.out.println("eats anything");
    }
}

class Dear extends Animal{
    void eat(){
        System.out.println("eats grass");
    }
}
