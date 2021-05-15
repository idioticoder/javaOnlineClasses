package onlineVideos;

class Calc1{
	int num1;
	int num2;
	int result;
	
	public Calc1(){
		num1 = 10;
		num2 = 25;
		System.out.println(" statement inside the constructor 1");// executed as soon as the constructor is called 
	}
	
	public Calc1(int numx, int numy) {
		num1 = numx;
		num2 = numy;
		System.out.println("inside the constructor 2");
		
	}
	
	public void caluclate() {
		result = num1 + num2 ;
		//return result;
	}
	
	
}

public class ConstructorDemo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc1 obj = new Calc1();// here obj is the reference, here the constructor Calc is called, the variables are intitialized in the constructor    
		//obj = new Calc();// new keyord will assign memmory , and Calc() is a constructor 
		//when object is created lots of stuff is loaded in the memory , like variables, methods(known as fucntions)
		// obj is the reference, we cant directly access them from the main statement 
		
		System.out.println(obj.result);// but this gives is out put of 0 , whyy?
		// in java the default value of integer is 0
		obj.caluclate();
		
		System.out.println(" here the result is generated " + obj.result);// num1 and num2 are added and their values have been assigned in the constructor in th class
		Calc1 obj1 = new Calc1(5,6);// constructor 2 is called and num1 and num2 are given values 5 and 6 respectively
		obj1.caluclate();
		System.out.println(" the result of Object 1 is " + obj1.result);//num1 + num2 => 5 + 6
		
	}

}
