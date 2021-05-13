package onlineVideos;

public class OperatorDemo {
/* 
 * arthimatic operator +, -,*,/,%
 * bitwise operator 
 * relational
 * logical 
 * 
 */
	public static void main(String[] args) {
		int m,n;
		m=6;
		n=4;
		n = m+n; // java takes the RHS first computes it and assigns the value to n 
		System.out.println(n);//  here n's value is changed to m+n
		n +=m;// same as n = n+m, expressions like this is called as shorthand operators 
		System.out.println(n);//here n = n+m, n has became 10 , and m has become 6, so n+m is 16
		n += 3; // here this is the same as n = n + 3;
		System.out.println(n);// previus value of n is 16 , 16 + 3 is outputed here
		n++;// this is the increament operator same as n = n +1;
		System.out.println(n);//will increase n's previous value 19 by 1 , hence giving out put as 20
		n--;//same as n = n-1; called as decreament operator 
		System.out.println(n);// previous value of n - 1 = 19 
		m = n++;// now what will be the value of m, 19 0r 20?
		System.out.println(m);// the value of m is still 19 , because when we do n++. we use the present value and then increament 
		System.out.println(n);// see the n has been increamented by one 
		m=++n;
		//here the n is increamented first then used, so value of m will be 21 
		System.out.println(m);
		System.out.println(n);
		//++n is called pre increment , n++ is called post increment 
		
	}

}
