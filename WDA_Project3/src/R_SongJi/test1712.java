package beakjoon;
import java.util.Scanner;
public class test1712 {
    public static void main(String[]args) {
        int A = 1000;
        int B = 70;
        int total, total2;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("노트북 가격을 적어주세요: ");
        int C = sc.nextInt();
        for(int i = 0; i < 10000; i++) {
            total = A + B * i;
            total2 = C * i;
            count++;
            if (total < total2) {
                break;
            }
        }System.out.println(count);


    }
    
}
