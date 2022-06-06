package beakjoon;
import java.util.Scanner;

public class test1964 {
    public static void main(String[] args) {
        int sum = 0;
        int x = 0;
        int y = 3;
        int z = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("몇번째 단계인지 입력하시오: ");  //변수를 입력받기전 문구가 나오게 입력한다.
		int n = input.nextInt();
        for(int i = 1; i <= n; i++) {
                x = x + 5 * i;
                if(i < 2) {
                    z = y + 2;
                }
            
        }sum = x - y - z;
        System.out.println(sum);
    }
}
