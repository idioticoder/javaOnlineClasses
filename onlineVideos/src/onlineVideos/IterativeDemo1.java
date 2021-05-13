package onlineVideos;

public class IterativeDemo1 {

	public static void main(String[] args) {
		//use of nested loops 
		//problem statements 
		/* to print below pattern
		* * * * *
		* * * * *
		* * * * *
		* * * * *
		* * * * *
		*/
		for(int i=1; i<6;i++) {
			for(int j=1; j<6;j++) {// this j loop will iterate 5 times for each i<6
				System.out.print("* ");
			}
			System.out.println(); //and after the j loop comes out, a 'enter' is pressed 
		
		}
		
		/* to print below pattern
		1-2-3-4-5-
		1-2-3-4-5-
		1-2-3-4-5-
		1-2-3-4-5-
		1-2-3-4-5-

		*/
		
		for(int i=1; i<6;i++) {
			for(int j=1; j<6;j++) {// this j loop will iterate 5 times for each i<6
				System.out.print(j + "-");//+ is the joining or the concatination symbol
			}
			System.out.println(); //and after the j loop comes out, a 'enter' is pressed 
		
		}
	}

}
