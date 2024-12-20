public class Anim{
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
    class Main{
        public static void main(String[] args) {
           Animal myanimal=new Animal();
           Animal mypig=new Animal();
           Animal mydog=new Animal();
           myanimal.animalsound();
           mypig.animalsound();
           mydog.animalsound(); 
        }
    }
}

