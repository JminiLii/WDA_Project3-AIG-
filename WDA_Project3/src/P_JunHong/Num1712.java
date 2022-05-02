package P_JunHong;

import java.util.Scanner;

public class Num1712 {
	public static void main(String[] args) {
		int a=0,b=0,c=0;
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		
		if(c <= b) {
			System.out.println(-1);
		}
		else {
			System.out.println((a/(c-b))+1);
		}
		sc.close();
	}
}
