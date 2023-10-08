package day4.operators;

public class UnaryOp2 {

	public static void main(String[] args) {

		int a = -95, b;
		b = a++;//b=-95 & a=-94
		int x = a, y;
		System.out.println(x);// -94
		y = ++x;// y=-93 & x=-93
		System.out.println(a);// -94
		System.out.println(b);// -95
		System.out.println(x);// -93
		System.out.println(y);// -93

		int p = 15, q = 30, res;

		res = p++ + --q;
	 // res = 15  + 29
	//final = 16    29
		System.out.println("res: " + res);// 44
		System.out.println("p: " + p);// 16
		System.out.println("q: " + q);// 29
		System.out.println("*****************************");
		int res1 = ++p + ++q;
	// 		res1 = 17  + 30
	//final =      17    30
		System.out.println(res1);// 47
		System.out.println("p: " + p);//17
		System.out.println("q: " + q);//30
	}

}
