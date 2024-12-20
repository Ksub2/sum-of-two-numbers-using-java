//java methods

// public class Method {
//     static void myMethod() {
//         System.out.println("iam keshab");
//     }
//     public static void main(String[] args) {
//         myMethod();
//     }
// }
//parameters and arguments

// public class Method {
//     static void methods(String firstname){
//         System.out.println(firstname+ " hero");

//     }
//     public static void main(String[] args) {
//         methods("abisek");
//         methods("darshan");
//         methods("yogesh");
//     }
// }

//multiple parameters

// public class Method{
//     static void method(String fname,int age) {
//       System.out.println(fname+ " is "+ age);
//     }
//     public static void main(String[] args) {
//     method("keshab ", 20);
//     method("abisek ",  30);
//     method("yogesh ",  40);
//     }
    

// }

//a method with if else

// public class Method {
//     static void Age(int age){
//         if(age<18){
//             System.out.println("access denied you\'re not old enough");
//         }
//         else {
//             System.out.println("access granted you\'re old enough");
//         }
//     }
//     public static void main(String[] args) {
//         Age(17);
//     }
// }

//return values

// public class Method{
//     static int sum(int x,int y){
//         return x+y;
//     }
//     public static void main(String[] args) {
//         System.out.println(sum(3,4));
//     }
// }

//next method

// public class Method {
//     static int sum(int x,int y){
//         return x+y;
//     }
//     public static void main(String[] args) {
//         int z=sum(3,4);
//         System.out.println(z);
//     }
// }

//method overloading

// public class Method{
//     static int Intmethod(int x,int y){
//         return x+y;
//     }
//     static double Doublemethod(double x,double y){
//         return x+y;
//     }
//     public static void main(String[] args) {
//         int num1=Intmethod(5,6);
//         double Num2=Doublemethod(4.5, 9.6);
//         int num3=(int)Num2;
//         double num4=num1;
//         System.out.println(num1);
//         System.out.println(Num2);
//         System.out.println(num3);
//         System.out.println(num4);
//     }
// }

//recursion

public class Method {
    public static void main(String[] args) {
        int result = sum(10);
       System.out.println(result);
    }
    public static int sum(int k) {
        if (k > 0) {
          return k + sum(k - 1);
        } else {
          return 0;
        }
    }
}
