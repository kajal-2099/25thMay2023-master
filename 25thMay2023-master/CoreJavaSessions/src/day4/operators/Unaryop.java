package day4.operators;

public class Unaryop {
	public static void main(String[] args) {

		int a = 50;
		int b = a;
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		/**
		 * pre: first perform the operation dn use the updated value 
		 * post: first use the value dn perform the operation
		 */
		int k = ++a;// a=a+1=51
		System.out.println("k: " + k);//51
		System.out.println("a: " + a);//51
		
		int j = k++;// 
		System.out.println("k: " + k);//52
		System.out.println("j: " + j);//51
	
		int r = -9;
		System.out.println("r=: " + r++);// -9 ---> -9+1
		System.out.println("r=: " + r);//  -8
		
		System.out.println("r=: " + ++r);// -7
		System.out.println("r=: " + r);// -7
		
		int x = 99;
		System.out.println("x=: " + --x);// 98
		System.out.println("x=: " + x);//   98
		System.out.println("x=: " + x--);// 98 ---->98-1
		System.out.println("x=: " + x);//  97 

	}
}

/*




*/