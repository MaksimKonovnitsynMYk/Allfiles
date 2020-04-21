package Inheritance_super;

public class A extends B{
	// Super class means the parent class
	//always inherit in the class 

	public static void main(String[] args) {
		
		
		//A.a1();
	//	B.b1();
		//C.c1();
		// - before we extend each classes 
		a1();
		c1();
		b2();
		b2 (10);
		b2 ("1020");
		c1 ();
	
		
	//	System.out.println(A_v);
		System.out.println(B_v);
	//	System.out.println(C_v);
		
	A abc = new A();
		System.out.println(abc.ApplyingSupper());
		
	}
	

	public int ApplyingSupper() {
		
		return super.B_v;
		
	}
	
	

	
		static int A_v = 100; 
		static int C_v = 94;
		static int B_v = 2000;
		
		
		
		
		
		public static void a1() {
			System.out.println("A1 - printing");
		}

		public static void a2() {
			System.out.println("A2 - printing");
			
		}
		public static void c2() {
			System.out.println("C2 - printing");
		}
		
		
	
		
		
	}

