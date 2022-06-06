package beakjoon;
import java.util.Scanner;

public class test10102 {
    public static void main(String[]args) {
        int a = 0;
        int b = 0;
        String count;
        Scanner sc = new Scanner(System.in);
        System.out.print("심사위원의 수를 입력하시오: ");
        int x = sc.nextInt();
        for(int i = 0; i <= x;i++) {
            System.out.print("A, B중 하나에 투표하세요");
            String y = sc.next();
            y = count;
            if (count == A) {
                a++;
            } else if (count == B) {
                b++;
            }
        }
        if (a > b) {
            System.out.println("A");
        }else if (a < b) {
            System.out.println("B");
        } else if(a == b) {
            System.out.println("Tie");
        }

    }
    
}
