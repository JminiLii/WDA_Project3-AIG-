package L_JeongMIn;
import java.util.Scanner;

public class baekjoon1964 {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int sum = 2;
		int count = 3;
		for(int i = 0; i < n; i++) {
			sum += count;
			count += 3;
		}
		System.out.println((sum+(n-1))%45678);
	}
}
