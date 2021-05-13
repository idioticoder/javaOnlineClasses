package onlineVideos;

public class IterativeAssignment {

	public static void main(String[] args) {
		/* to print the following pattern using nested loops
		
		question 1 :
		1 
		1 2 
		1 2 3 
		1 2 3 4 
		1 2 3 4 5 
		
		question 2 :
			
		*
		* *
		* * *
		* * * *
		* * * * *
		
		quesstion 3 :
		
		A
		A B
		A B C
		A B C D
		
		question 4 
		
		$ $ $ $
		$     $
		$     $
		$ $ $ $
		*/
		
		System.out.println(" question 1");
		System.out.println();
		
		byte i,j;
		
		for( i=1;i<=5;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(j+ " ");//print prints in the same line, printlln prints in the new line
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println(" question 2");
		System.out.println();
		

		
		for( i=1;i<=5;i++) {
			for(j=1;j<=i;j++) {
				System.out.print("* ");//print prints in the same line, printlln prints in the new line
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println(" question 3");
		System.out.println();
		
		char alpha='A';
		
		for( i=1;i<=5;i++) {
			alpha='A';
			for(j=1;j<=i;j++) {
				System.out.print(alpha++ +" ");//as soon as alpha is increamented, it goes to the next ascii value, which has the next alphabet
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println(" question 4");
		System.out.println();
		
		for( i=1;i<=4;i++) {
			for(j=1;j<=4;j++) {
				if(i==1 || i==4) {// using the co-ordinates of the matrix
					System.out.print("$ ");
				}
				else if(j==1 || j==4) {
					System.out.print("$ ");
				}
				else {
					System.out.print("  ");
				}
			
				
			}
			System.out.println();
		}
		

		
	}

}
