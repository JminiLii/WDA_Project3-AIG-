package L_JeongMIn;
import java.util.Scanner;
import java.util.Arrays;

public class baekjoon2750 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt(); //몇줄인지 입력 받기
		
		int[] N_Array = new int[N];
		
		for (int i = 0; i < N; i++) { //N개 만큼 입력받기
			N_Array[i] = in.nextInt();
		}
		Arrays.sort(N_Array);       //정렬 메서드 사용
		for (int i : N_Array) {     //for each? 문으로 출력
			System.out.println(i);
		}
	}
}

