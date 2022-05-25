package L_JeongMIn;
import java.util.Scanner;

public class baekjoon1225 {//1225

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String[] AB = in.nextLine().split(" ");
		String[] A = AB[0].split("");
		String[] B = AB[1].split("");
		long sum = 0;

		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < B.length; j++) {
				sum += Integer.parseInt(A[i]) * Integer.parseInt(B[j]);
			}
		}
		System.out.println(sum);
	}
}