package beakjoon;
import java.util.Scanner;

public class test1110 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("0 보다 크거나 같고, 99보다 작거나 같은 정수를 입력하시오: ");  //변수를 입력받기전 문구가 나오게 입력한다.
		int num = input.nextInt();
        int num1 = num % 10;
        int num10 = num / 10;
        int count = 0;
        int sum = 0;
        int sum3 = 0;
        int sum2 = num1 + num10;
        if (num == sum) {
            System.out.println(count);
        }
        else {
            for(int i = 0 ;i < 100; i++  ) {
                sum3 = sum2 + sum; 
                sum2 = 0;
                if (i > 10) {
                    i = i % 10;
                }
                count++;
            }
        }
    }
}
