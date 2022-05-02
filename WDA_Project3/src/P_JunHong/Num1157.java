package P_JunHong;

import java.util.Scanner;

public class Num1157 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		s=s.toUpperCase();
		int arr[] = new int [26];
		for(int i=0; i<s.length();i++) {
			arr[s.charAt(i)-65]++;
		} 

		int max = -1;
		char ch = '?';
 
		for (int i = 0; i < 26; i++) {
			if (arr[i] > max) {
				max = arr[i];
				ch = (char) (i + 65);
			}
			else if (arr[i] == max) {
				ch = '?';
			}
		}
 
		System.out.print(ch);
		
	}

}
