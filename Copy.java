
    class Animal {
        public void animalsound(){
            System.out.println("animal makes a sound");
        }
    }
    class Pig extends Animal{
        public void animalsound(){
            System.out.println("the pig says wee weee");
        }
    }
    class Dog extends Animal{
        public void animalsound(){
            System.out.println("dog says bow bow");
        }
    }
public class Copy{
        public static void main(String[] args) {
           Animal myanimal=new Animal();
           Animal mypig=new Pig();
           Animal mydog=new Dog();
           myanimal.animalsound();
           mypig.animalsound();
           mydog.animalsound(); 
        }
    
}


