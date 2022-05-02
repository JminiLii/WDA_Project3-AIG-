import java.util.Scanner;

public class BJ_1712    {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        a = sc.nextInt(); //고정 비용
        b = sc.nextInt(); //가변 비용
        c = sc.nextInt(); //판매 비용

        if(c <= b)  {
            System.out.println("-1");
        }
        else    {
            System.out.println((a/(c-b))+1);
        }
            sc.close();
    }
}