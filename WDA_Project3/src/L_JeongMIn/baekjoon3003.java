package L_JeongMIn;
import java.util.Scanner;

public class baekjoon3003 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] horse = {1, 1, 2, 2, 2, 8};
		int[] ans = new int[6];
		int count;
		for (int i = 0; i < horse.length; i++) {
			count = in.nextInt();
			ans[i] = horse[i] - count;
		}
		for (int i = 0; i < ans.length; i++) {
			System.out.println(ans[i]);
		}
	}
}
