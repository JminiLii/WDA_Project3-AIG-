package beakjoon;
import java.util.Scanner;
public class test2739 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 1;  //변수값이 1이니까 int를 사용한다.
        int n;
        System.out.print("출력할 단: ");  //변수를 입력받기전 문구가 나오게 입력한다.
		n = input.nextInt();
        while (i <= n) {  //while(조건식) 조건식은 반복하는 조건이고 조건이 참이면 반복을 계속 한다.
            System.out.println(n + " * " + i + " = " + n*i);  //반복되는 문장이다.
            i++;
        }
    }    
}
