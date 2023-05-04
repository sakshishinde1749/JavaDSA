package OOPS;

//if our properties are private so we cant access them for this we make get and set funtion in which we set the value first then get that value back
//get : to return the value
//set : to modify the value or property

public class GettersSetters {

    public static void main(String args[]){

        Pen p1 = new Pen();

        p1.setColor("red");
        System.out.println(p1.getColor());

        p1.setTip(6);
        System.out.println(p1.getTip());

    }
    
}

class Pen{
    private String color;
    private int tip;

    void setColor(String newColor){
        color = newColor;
    }
    String getColor(){
        return this.color;       //this keyword is used to refer to the current object
    }
    void setTip(int newTip){
        tip = newTip;
    }
    int getTip(){
        return this.tip;
    }
}
