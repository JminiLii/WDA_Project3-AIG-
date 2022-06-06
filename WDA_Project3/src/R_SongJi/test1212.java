package beakjoon;
import java.util.Scanner;

public class test1212 {
    public static void main(String[] args) {
        String num;
        Scanner sc = new Scanner(System.in);
        System.out.print("8진수를 입력하시오: ");
        num = sc.next();
        int num2 = Integer.parseInt(num, 8);
        String num3 = Integer.toBinaryString(num2); 
        System.out.println(num3);
    }
}
