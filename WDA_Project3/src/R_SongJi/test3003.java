package beakjoon;
import java.util.Scanner;
public class test3003 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("킹, 퀸, 룩, 비숍, 나이트, 폰 순서대로 몇개인지 입력하세요: ");
        int K = sc.nextInt();
        int Q = sc.nextInt();
        int L = sc.nextInt();
        int B = sc.nextInt();
        int N = sc.nextInt();
        int P = sc.nextInt();

        System.out.println((1 - K) + (1 - Q) + (2 - L) + (2 - B) + (2 - N) + (8 - P));
    }
    
}
