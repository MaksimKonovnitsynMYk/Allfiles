package Inheritance_super;

public class B extends C {

static int B_v = 1000; 

int a = 20;
int b = 22;
int h = 50;
	
	public void b1() {
		System.out.println("B1 - printing");
		int h = 770;
		 System.out.println(this.h + h);
		
		
	}

	public static void b2() {
		System.out.println("B2");
	}
	public static void b2(String a) {
		System.out.println("B2 - string used from Class b ");
	}
	
	public static void b2(int a) {
		System.out.println("B2 - " + a);
	}
	
	}


