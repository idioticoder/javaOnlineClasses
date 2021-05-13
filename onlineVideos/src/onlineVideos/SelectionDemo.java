package onlineVideos;

public class SelectionDemo {
	/*selection statements
	 * if
	 * switch
	 * ternary 
	  */
	public static void main(String[] args) {
		//Switch case statement 
		int n;
		//problem statement : whatever value of n is inputed, the same should be displayed in word format
		//example
		 n=5;
		 if(n==5) {
			 System.out.println("five");
		 }
		 
		 //switch case syntax
		 switch(n) {
		 case 1: //if n is 1 
			 System.out.println("one");
		 case 2: //if n is 2 
			 System.out.println("two");
		 case 3: //if n is 3 
			 System.out.println("three");
		 case 4: //if n is 4 
			 System.out.println("four");
		 case 5: //if n is 1 
			 System.out.println("five");// this is out puted along with the default statemnet
		 default :
			 System.out.println("re-enter the value of n ");
		 
		 }
		 
		 n= 3;
		 switch(n) {
		 case 1: //if n is 1 
			 System.out.println("one");
		 case 2: //if n is 2 
			 System.out.println("two");
		 case 3: //if n is 3 
			 System.out.println("three");// now this statement and all the statement below is executes
		 case 4: //if n is 4 
			 System.out.println("four");
		 case 5: //if n is 1 
			 System.out.println("five");
		 default :
			 System.out.println("re-enter the value of n ");
		 
		 }
		 //to prevent multiple statements getting exicuted we add break statement after each case 
		 n = 2;
		 System.out.println(" below is the usage of switch with break statement ");
		 switch(n) {
		 case 1: //if n is 1 
			 System.out.println("one");
			 break;
		 case 2: //if n is 2 
			 System.out.println("two");
			 break;
		 case 3: //if n is 3 
			 System.out.println("three");
			 break;
		 case 4: //if n is 4 
			 System.out.println("four");
			 break;
		 case 5: //if n is 1 
			 System.out.println("five");
			 break;
		 default :
			 System.out.println("re-enter the value of n ");
			 break;//switch doesnt support double 
		 
		 }
		 System.out.println(" implementation of switch using string is below");
		 
		 String d ="abc";
		 switch(d) {
		 
		 case "abc" :
			 System.out.println("switch works for charecter and string ");
		 }
		 
	}

	

}
