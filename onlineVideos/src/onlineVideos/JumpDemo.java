package onlineVideos;

public class JumpDemo {

	public static void main(String[] args) {
		System.out.println("hello Jump");
		
		//jumping statement
		// continue and break 
		System.out.println("\nthis is the implementation of continue");
		
		for(int i=1;i<10;i++) {
			if(i%2 == 0) {
				continue;//where ever the continue is come accross, that itration is skipped 
			}
			System.out.println("the odd numbers are "+ i);//even numbers are not printed because in the above if statement, if i is even, the continue statment is used 
		}
		
		System.out.println("\n this is the implimentation of break");
		
		for(int i=1; i<10;i++) {
			if(i>5)
				break;//as soon as the break is encountered, the system comes out of the for loop completely
			System.out.println("numbers below 6 are " + i);//prints till 5 after that the break statement is encountered and the itrations are terminated
		}
		//note : continue - skips that particular itration, break - skips the looping statment completely
		
	}

}
