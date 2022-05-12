package L_JeongMIn;

import java.util.Scanner;

public class baekjoon1264 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		String line;
		
		while(true) {
			line = in.nextLine();
			int count=0;
			if(line.equals("#"))	break;
			line = line.toUpperCase();
			for (int j = 0; j < line.length(); j++) {
				if(line.charAt(j)=='A' || line.charAt(j)=='E' || line.charAt(j)=='I' || line.charAt(j)=='O' || line.charAt(j)=='U') {
					count++;
				}
			}
			System.out.println(count);
		}
	}
}


