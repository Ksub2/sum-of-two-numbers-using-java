//abstraction

//  public class Second {
//     public static void main(String[] args) {
//         Student myobj=new Student();
//         System.out.println("Name: "+myobj.fname);
//         System.out.println("Age: "+myobj.age);
//         System.out.println("Graduation Year: "+myobj.graduationYear);
//         myobj.study();
//     }
// }

//Java encapsulation
public class Second{
    public static void main(String[] args) {
        Main myobj=new Main();
        myobj.setname("john");
        System.out.println(myobj.getname());
    }
}

