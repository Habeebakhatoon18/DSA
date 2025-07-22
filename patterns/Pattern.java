public class Pattern {
	public static void print4(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

	public static void print5(int n) {
		// *****
		// ****
		// ***
		// **
		// *
		for (int i = n; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void print6(int n) {
		// 12345
		// 1234
		// 123
		// 12
		// 1
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i + 1; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	public static void print7(int n) {
		// *
		// ***
		// *****
		// *******
		// *********
		for (int i = 1; i <= n; i++) {
			for (int k = 0; k < n - i; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void print8(int n) {
		// *********
		// *******
		// *****
		// ***
		// *
		for (int i = 1; i <= n; i++) {
			for (int k = 1; k < i; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= (2 * n) - (2 * i - 1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void print9(int n) {
		// *
		// ***
		// *****
		// *******
		// *********
		// *********
		// *******
		// *****
		// ***
		// *
		print7(n);
		print8(n);
	}

	public static void print10(int n) {
		// *
		// **
		// ***
		// ****
		// *****
		// ****
		// ***
		// **
		// *

		for (int i = 1; i <= 2 * n - 1; i++) {
			if (i <= n) {
				for (int j = 1; j <= i; j++) {
					System.out.print(("*"));
				}
			} else {
				for (int j = 1; j <= 2 * n - i; j++) {
					System.out.print(("*"));
				}
			}
			System.out.println();
		}
	}

	public static void print11(int n) {
		// 1
		// 01
		// 101
		// 0101
		// 10101
		int start = 1;
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0)
				start = 1;
			for (int j = 0; j <= i; j++) {
				System.out.print(start);
				start = 1 - start;
			}
			System.out.println();
		}
	}

	public static void print12(int n) {
		//1         1
		//12       21
		//123     321
		//1234   4321
		//12345 54321
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			for (int j = 0; j <= 2 * (n - i); j++) {
				System.out.print(" ");
			}
			for (int j = i; j >= 1; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	public static void print13(int n) {
		// 1
		// 2 3
		// 4 5 6
		// 7 8 9 10
		// 11 12 13 14 15
		int num = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(num++ + " ");
			}
			System.out.println();
		}
	}

	public static void print14(int n) {
		// A
		// A B
		// A B C
		// A B C D
		// A B C D E
		for (int i = 0; i < n; i++) {
			int charr = 65;
			for (int j = 0; j <= i; j++) {
				System.out.print((char) charr++ + " ");
			}
			// for(char j = 'A'; j <= 'A' +i ;j ++)
			// System.out.print(j);
			System.out.println();
		}
	}

	public static void print15(int n) {
		// A B C D E
		// A B C D
		// A B C
		// A B
		// A
		for (int i = n; i >= 1; i--) {
			int charr = 65;
			for (int j = 0; j < i; j++) {
				System.out.print((char) charr++ + " ");
			}
			System.out.println();
		}
	}

	public static void print16(int n) {
		// A
		// B B
		// C C C
		// D D D D
		// E E E E E
		int charr = 65;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((char) charr + " ");
			}
			charr++;
			System.out.println();
		}
	}

	public static void print17(int n) {
		//         A
		//       A B A
		//     A B C B A
		//   A B C D C B A
		// A B C D E D C B A
		for (int i = 0; i < n; i++) {
			int charr = 65;
			for (int j = 0; j < n - i - 1; j++) {
				System.out.print("  ");
			}
			for (int j = 0; j < (2 * i) + 1; j++) {
				if (j >= i) {
					System.out.print((char) charr-- + " ");
				} else {
					System.out.print((char) charr++ + " ");
				}
			}
			System.out.println();
		}
	}

	public static void print18(int n) {
		// E
		// DE                     // go for char instead of int like use char = 'A' then
		// CDE                    // do A +1 or whatever.
		// BCDE
		// ABCDE
		for (int i = 0; i < n; i++) {
			int charr = 64 + (n - i);
			for (int j = 0; j <= i; j++) {
				System.out.print((char) charr++);
			}
			System.out.println();
		}
	}

	public static void print19(int n) {
		// **********
		// ****  ****
		// ***    ***
		// **      **
		// *        *
		// *        *
		// **      **
		// ***    ***
		// ****  ****
		// **********
		for (int i = 1; i <= 2 * n; i++) {

			int star = i <= n ? (n - i + 1) : (i - n);
			int space = n - star;

			for (int j = 0; j < star; j++) { //star
				System.out.print("*");
			}
			for (int j = 0; j < 2*space; j++) { //space
				System.out.print(" ");
			}
			for (int j = 0; j < star; j++) { //star
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void print20(int n) {	
		for (int i = 1; i < 2*n; i++) {
			// *        *
			// **      **
			// ***    ***
			// ****  ****
			// **********
			// ****  ****
			// ***    ***
			// **      **
			// *        *
			int star = i <= n ? i  : (2*n - i);
			int space = n - star;

			for (int j = 0; j < star; j++) { //star
				System.out.print("*");
			}
			for (int j = 0; j < 2*space; j++) { //space
				System.out.print(" ");
			}
			for (int j = 0; j < star; j++) { //star
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void print21(int n ){
	// ****
	// *  *
	// *  *
	// ****
	for(int i = 0 ; i < n;i++){
		for(int j = 0 ; j < n;j++){
			if(i == 0 ||  j == 0 || i == n-1 || j == n-1)
			System.out.print("*");
			else
			System.out.print(" ");
		}
		System.out.println();
	}
}
	public static void print22(int n) {	
		for (int i = 0; i < 2*n-1; i++) {
			for(int j = 0; j < 2*n-1 ; j++){
				int left = j ,right = (2*n-2) - j, top = i, bottom = (2*n-2) -i;
				int min = Math.min( Math.min(left ,right), Math.min(top, bottom));
				System.out.print(n-min);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		print22(4);
	}
}