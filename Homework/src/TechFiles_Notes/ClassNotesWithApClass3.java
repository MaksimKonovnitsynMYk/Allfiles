package TechFiles_Notes;

public class ClassNotesWithApClass3 {

	public static void main(String[] args) {
		
		String [] moreNames = {"John", "Test","Steve", "Amanda"};
		
		
	//	System.out.println(moreNames [0]);
	//	System.out.println(moreNames [1]);
	//	System.out.println(moreNames [2]);
	//	System.out.println(moreNames [3]);
		
		
		
		// Formula for Loops 
	//	for (int i=0; i<4; i++) {
			//	===========================================================
			// where is starts - where it ends - how many steps ?
		//	===========================================================
			
			// int i - is your iterator ( where does is start from)
			//i++ = we are increasing by 1 up
			//I-- = when we go down one item 
			//i=i+2 - when we go up or down twice
			//i+i+3 - when go up or down by three
			// MIDDLE i<4 - shows where to stop the loop 
		
		// You can print as many numbers as you want by printing 'i'
	//	for (int i+0;i<=100; i++) {
	//		System.out.println(i);
	
			
	//	for (int i=0; i<=3; i++) {
	//		System.out.println(moreNames [i]);
//			
//			for (int i=0; i< moreNames.length;i++) {
//			System.out.println(moreNames[i]);
//			
//		}
		
//		String data = "Hello World";
//		
//		char [] myDataArr = data.toCharArray();
//		for (int i= myDataArr.length-1;i>=0; i--) {
//			
//			System.out.println(i+"=" + myDataArr [i]+ "!");
//		}
//		
//		
	//	Splitting Items
		// Pseudo - code, English language with code. 
		
		String data = "hello world";
		char [] abcArray = data.toCharArray();
		
		String accountNum = "123123123,12312312,123123123";
		String [] myArray = accountNum.split(" ");
		int [] myNum = {43, 23, 7, 76, 8};
		
		for (int item : myNum) {
			System.out.println(item);
		}
	}

	
	
	
	
	
	
	
	
	
}
