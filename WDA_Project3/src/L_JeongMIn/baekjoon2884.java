package L_JeongMIn;
import java.util.Scanner;

public class baekjoon2884 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int h = in.nextInt();
		int m = in.nextInt();
		
		if(m < 45) {
			h -= 1;
			m = 60-(45-m);
			
			if(h < 0)
				h=23;
			System.out.println(h + " " + m);
		}
		else
			System.out.println(h + " " + (m-45));
	}
}