package _06_spot_the_error;

public class MakeItCount {
	// This program is supposed to print
	//			1
	//			2
	//			3
	// BUT it's not working correctly. If you don't believe me, try running it.
	// Change one line of code to fix this program. DO NOT ADD ANY EXTRA LINES OF
	// CODE.

	public static void main(String[] args) {
		int number = 0;
		for (int i=1; i<4; i++) {
			System.out.println(number);
		}
	}
}
