package P_JunHong;

import java.util.Scanner;

public class Num1212 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		StringBuilder sb = new StringBuilder();
		String[] bianry = {"000", "001", "010", "011", "100", "101", "110","111"};
		if(n.length()==1 && n.charAt(0) == '0') {
			sb.append(0);
		}
		else { 
			for(int i=0; i<n.length();i++) {
				int num = Character.getNumericValue(n.charAt(i));
				if(i==0 && num < 4) {
					switch (num) {
					case 1 : 
						sb.append("1");
						break;
					case 2 :
						sb.append("10");
						break;
					case 3 :
						sb.append("11");
						break;
					}
						
				}
				else {
					sb.append(bianry[num]);
				}
			}
		}
		System.out.print(sb.toString());
		sc.close();
	}	
}
