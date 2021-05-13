package onlineVideos;

public class IterativeDemo {

	public static void main(String[] args) {
		//print hello five times 
		System.out.println("hello");
		System.out.println("hello");

		System.out.println("hello");

		System.out.println("hello");

		System.out.println("hello");

		//this makes into code redundancy , using the same code multiple times , and code redundaney is a crime 
		//print hey 5 tomes 
		// we have to use loops 
		//types of loops for,do-while, while. for-each
		int n=0; //in a loop, first there is intialization 
		while(n<5) {// then we have an condition
			System.out.println("hey");
			++n;// then we have change in the value of the variable so that the loop terminates at some point
		}
		
		n=100;
		do {
			System.out.println("hey do while ");
			
		}while(n<5);//the condition is false here but still hey do while is executed here
		//do while, will execute the statement first then the statement is checked
		
		for(int i =1; i<5;i++) {// for contains, initialization, condition, value change of the variable 
			System.out.println(" hey for ");
		}
		//for each special type of loop specialized for array 
		

	}

}
