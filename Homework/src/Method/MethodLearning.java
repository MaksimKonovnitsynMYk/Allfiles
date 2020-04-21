package Method;

public class MethodLearning {

	public static void main(String[] args) {
		int x =55; 
		int y =65; 
		System.out.println("test");
		sum(y,x);
		System.out.println("ASDasd");
		MethodLearning myObj = new MethodLearning ();
		myObj.NonStatic ();
		
	
		}
	
	public static void sum (int numberOne , int numberTwo) {
		System.out.println(numberOne + numberTwo);
		printMe();
	}
	
	public static void printMe() {
		System.out.println("Prinnt Me");
	}
	
	
	public void NonStatic() {
		System.out.println("Prinnt Me");
		
	}
	
	//HOW TO CREATE THE OBJECT
	// NAME OF THE CLASS + VARIABLE OBJECT = new + NAME OF THE CLASS AGAIN
	
}

