package OOPS;

// Objects : entities in the real world
// classes : group of these entities
// there are two memories in java one is stack another is heap in which object gets stored
// class has two things which is attributes(properties) and function(behavior)

public class BasicOops {

    public static void main(String args[]){
        Pen p1 = new Pen();                 //created a Pen object called p1
        
        p1.setColor("blue");                //we use dot operator to access property or function of object
        System.out.println(p1.color);

        p1.setTip(6);
        System.out.println(p1.tip);

        p1.setColor("yellow");
        System.out.println(p1.color);

        p1.color = "red";                  //we can also use this to set a color
        System.out.println(p1.color);
    
    }
    
}

class Pen{

   String color;
   int tip;

    String setColor(String newColor){
      color = newColor;
    }
    int setTip(int newTip){
        tip = newTip;
    }
}


class Student{

    String name;
    int age;
    float Percentage;

    void calculatePercentage(int phy,int chem,int maths){
        Percentage = (phy + chem + maths)/3;
    }

}
