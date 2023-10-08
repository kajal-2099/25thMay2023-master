package day12.abstractions;

public class Example1 {

	public static void main(String[] args) {

		for(int i=0;i<5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		System.out.println("++++++++++++++++++++++++++++++++++");
		for(int i=0;i<5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		System.out.println("++++++++++++++++++++++++++++++++++");
		for(int i=0;i<5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("++++++++++++++++++++++++++++++++++");
		for(int i=5;i>0;i--) {
			for(int j=0;j<i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("++++++++++++++++++++++++++++++++++");
		for(char c1='a';c1<'e';c1++) {
			for(char c2='a';c2<=c1;c2++) {
				System.out.print(c2+" ");
			}
			System.out.println();
		}


	}

}
