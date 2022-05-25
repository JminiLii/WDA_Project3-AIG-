package L_JeongMIn.four_week;
import java.util.Scanner;

public class baekjoon1110 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int sum = N;
		int a, b;
		String asdf;
		
		
		int count = 0;
		do {
			a = (N%10);
			b = (((N/10)+(N%10))%10);
			asdf = Integer.toString(a) + Integer.toString(b);
			N = Integer.parseInt(asdf);
			count++;
		}while(sum!=N);
		System.out.println(count);
	}
}
