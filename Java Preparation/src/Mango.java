
public class Mango {
	
	static int i=10;
	int j=20;


	public static void main(String[] args) throws Exception {

	Mango m1 = new Mango();
	i = 30;
	m1.j=50;
	System.out.println("i =" +m1.i);
	System.out.println("i =" +i);
	System.out.println("j =" +m1.j);
	m1.print();
	System.out.println("__________");
	new Mango().disp();
	new Mango().print();
	
	}
	
	void print(){
		Mango m2 = new Mango();
		System.out.println("print() method:" +i);
		System.out.println("i =" +m2.i);
		System.out.println("i =" +i);
		System.out.println("j =" +m2.j);
		System.out.println("j =" +j);
		disp();
		
	}
	static void disp(){
		Mango m3 = new Mango();
		System.out.println("disp method()");
		System.out.println("i =" +m3.i);
		System.out.println("i =" +i);
		System.out.println("j =" +m3.j);
		
		
}
}
