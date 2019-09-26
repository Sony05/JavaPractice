
class Test

{
	 public static void apple()
	 {
		 System.out.print("Hi There! ");  
	 }
		
}

public class Apple extends Test

{
	public static void apple()
	 {
		System.out.print("Instance of Apple class is created"); 
	 }
	
	 public static void main(String[] args) throws Exception
	 {
		Test t1 = new Test();
		Apple a1 = new Apple();
		 
		t1.apple();
		a1.apple();
		 }
}


