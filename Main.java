// public class Main {
//     int x=5;
//     public static void main(String[] args) {
//         Main myObj1=new Main();
//         Main myObj2=new Main();

//         System.out.println(myObj1.x);
//         System.out.println(myObj2.x);
//     }
// }
   
//modify attributes

// public class Main{
//     int x=45;
//     public static void main(String[] args) {
//          Main myobj1=new Main();
//          Main myobj2=new Main();

//          myobj2.x=20;
//          System.out.println(myobj1.x);
//          System.out.println(myobj2.x);
//     }
// }

//multiple attributes

// public class Main{
//     String fname="Keshab";
//     String lname="dahal";
//     int age=23;
//     public static void main(String[] args) {
//         Main myobj=new Main();
//         System.out.println("Name:"+myobj.fname+ " "+myobj.lname);
//         System.out.println("iam" + " "+myobj.age+" "+"years old.");
//     }
// }
//
///
 //static vs public
//    public class Main {
//     static void mymain(){
//         System.out.println("static method can be callled without creating objects");
//     }
//     public void mypublicmethod(){
//         System.out.println("public method can be called after object is created");
//     }
//     public static void main(String[] args) {
//         mymain();
//         Main myobj=new Main();
//         myobj.mypublicmethod();
//     }
//    }


//access method with an object
// public class Main {
//     public void fullspeed(){
//         System.out.println("the car is going too fast");
//     }
//     public void maxSpeed(int maxspeed){
//         System.out.println("max speed is: "+maxspeed);
//     }
//     public static void main(String[] args) {
//         Main mycar=new Main();
//         mycar.fullspeed();
//         mycar.maxSpeed(230);
//     }
// }

//constructor with multiple parameter

// public class Main{
//     int modelyear;
//     String modelname;
//     public Main(int year,String name){
//         modelyear=year;
//         modelname=name;

//     }
//     public static void main(String[] args) {
//         Main mycar=new Main(1970,"mustang");
//         System.out.println(mycar.modelyear+ " "+mycar.modelname);
//     }
// }

//Abstract method

// abstract class Main {
//     public String fname="john";
//     public int age=23;
//     public abstract void study();
// }
// class Student extends Main{
//     public int graduationYear=2018;
//     public void study(){
//         System.out.println("studying all the day");
//     } 
// }

//encapsulation

public class Main {
    private String name;
    public String getname(){
        return name;
    }
    public void setname(String newname){

        this.name=newname;
    }
}
