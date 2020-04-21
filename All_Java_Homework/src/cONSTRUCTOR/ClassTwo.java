package cONSTRUCTOR;

public class ClassTwo {

public ClassTwo () {
	System.out.println("This is constructor being auto invoked");


	}
// make it unique by adding parameters


public ClassTwo (int a) {
	this ("a");
	System.out.println("This is constructor that asking for integer " + a);
	

	}

public ClassTwo (String a) {
	this (75,100);
	System.out.println("This is constructor that asking for string ");


	}


public ClassTwo (int a,int b) {

	System.out.println("This is constructor that asking for two integers " + a +" and "+ b);


	}


public  void abc() {
	System.out.println("This is me calling ABC");
}

}
