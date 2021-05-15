package onlineVideos;

class Calc{
	int num1;
	int num2;
	int result;
	
	public void caluclate() {
		result = num1 + num2 ;
		//return result;
	}
	
	
}

public class ObjectsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc obj = new Calc();// here obj is the reference   
		//obj = new Calc();// new keyord will assign memmory , and Calc() is a constructor 
		//when object is created lots of stuff is loaded in the memory , like variables, methods(known as fucntions)
		obj.num1 = 10;
		obj.num2 = 20; // obj is the reference, we cant directly access them from the main statement 
		
		System.out.println(obj.result);// but this gives is out put of 0 , whyy?
		// in java the default value of integer is 0
		obj.caluclate();
		
		System.out.println(" here the result is generated " + obj.result);
	}

}
