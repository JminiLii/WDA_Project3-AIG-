package P_JunHong;

import java.util.Scanner;

public class Num1964 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long num=4;
		long sum=4;
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt()-1;
		
		for(int i=0; i<n;i++) {
			num+=3;
			sum+=num;
		}
		System.out.println((sum+1)% 45678);
	}

}
