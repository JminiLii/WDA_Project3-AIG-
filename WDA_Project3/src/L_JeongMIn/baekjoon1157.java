package L_JeongMIn;
import java.util.*;

public class baekjoon1157 {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int[] abc = new int[26];
		
		String txt = in.next();
		txt = txt.toUpperCase();
		for (int i = 0; i < txt.length(); i++) {
			abc[txt.charAt(i)-'A']++;
		}
		int max=0, ans=0;
		for (int i = 0; i < abc.length; i++) {
			if(max < abc[i]) {
				max = abc[i];
				ans = i;
			}
			else if(max == abc[i]) {
				ans = -2;
			}
		}
		int sum = ans + 65;
		char ha = (char)sum;
		System.out.println(ha);
		in.close();
	}
}
