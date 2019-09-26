class Dem{
   public static void display()
   {
	   
   }
}

public class Sample extends Dem 
{
   public static void display()
   {
      System.out.println("Hello this is a static method");
   }
   
   public static void main(String args[]) throws Exception
   {
      new Sample().display();
   }
}