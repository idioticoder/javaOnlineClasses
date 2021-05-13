 
package onlineVideos;

public class FirstCode {
	//every program should start with main 
	public static void main(String args[]) {
		int i=5;//int takes 4 bytes 
		short s=5;//short take only two bytes -32768 - 32767
		byte b = 5; // byte take 1 byte or 8 bits , range is -128 to 127
		long l = 5l;//8 Bytes, for long l at the end needs to be specified 
		float f=5.5f;// for float we need to use f at the end because any decimal number in java is by default taken as double 
		char c ='A';
		c = 66;
		c++;// c will increament by one 
		System.out.println(c);//will print 'c' , because c become 67 and ascii value of 67 represents 'C'
		double d1=5;//implicit conversion , if d1 is printed , it will give 5.0 as the answer
		System.out.println(d1);
		//int k = 5.5 //shows error because 5.5 is double 
		int j = (int)5.6;// type casting, //explicit conversion
		System.out.println(l);// will give out put 5 which is of type int, .6 will be removed because of type casting
		
	}

}