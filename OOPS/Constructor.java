package OOPS;

//constructor : constructor is a special method which is invoked automatically at the time of object creation
//It have same name as class or structure
//Dont have return type (not even void type)
//constructor are called only once during object creation time
//memory allocation happens when it is called


//Destructor : 


public class Constructor {

    public static void main(String args[]){
        //here according to need constructor getting called
        //constructor overloading : during creation suitable constructor is getting called
        Student s1 = new Student();
        s1.name = "Shubhangi";
        s1.roll = 22;
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 95;

        Student s2 = new Student("sakshi");

        Student s3 = new Student(21);

        Student s4 = new Student(s1);

        //In this when we are changing the value of s1 marks of any index it is making change in s2 marks array as well
        //this is because of s2 has reference copy of s1
        s1.marks[2] = 100;
        for(int i=0; i<3; i++){
            System.out.println(s4.marks[i]);
        }
    }

}

class Student{
    String name;
    int roll;
    int marks[];

    //non-parameterized constructor
    // this is constructor in java if we didn't made any contructor then it automatically makes dafault constructor
    Student(){          
        marks = new int[3];  
        System.out.println("Constructor is called..");   
    }

    // parameterized constructor
    Student(String name){   
        marks = new int[3];
        this.name = name;
    }

    //parameterized constructor
    Student(int roll){     
        marks = new int[3]; 
        this.roll = roll;
    }

    //shallow copy constructor
    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        this.marks = s1.marks;
    }

    //deep copy constructor
    // Student(Student s1){
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     for(int i=0; i<3; i++){
    //         this.marks[i] = s1.marks[i];
    //     }
    // }
    
}
