package OOPS;

//objects : Entities in the real world
//class : group of these entities

//class has attributes (properties) and functions (behaviors)
//first letter of name of class should be capital
//always try to write any class below public class

public class OOPS {
    
	public static void main(String args[]){
		Pen p1 = new Pen();
		p1.setColor("Blue");
        p1.setTip(2);
        System.out.println(p1.getColor());
        System.out.println(p1.getTip());
	}

}


//pen class example
class Pen{
    private String color;
    private int tip;

    void setColor(String newColor){         //this is setter function to set the color value
        color = newColor;
    }

    String getColor(){                      //this is getter function to get the color value
        return this.color;
    }

    void setTip(int newTip){
        tip = newTip;
    }

    int getTip(){
        return this.tip;
    }
}


//Student class example
class Student{
    String name;
    int age;
    float percentage;

    void calculatePercentage(int phy, int chem, int maths){
        percentage = (phy + chem + maths) / 3;
    }
}