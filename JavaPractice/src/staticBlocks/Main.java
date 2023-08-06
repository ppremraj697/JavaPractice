package staticBlocks;

class Test{
    
    static{
        System.out.println("Block 1 in Test");
    }
    
    public static void display(){
        System.out.println("Heyy! I'm displaying");
    }
    
    static{
        System.out.println("Block 2 in Test");
    }   
}

public class Main {

	static{
        System.out.println("Block 1 in Main before main method");
   }

   public static void main(String[] args) {
       Test t1 = new Test();    
       System.out.println("Hello World!");
       Test.display();
   }
   
   static{
       System.out.println("Block 2 in Main after main method");
   }
}
