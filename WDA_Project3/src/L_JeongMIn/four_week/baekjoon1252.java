package L_JeongMIn.four_week;
import java.util.Scanner;
import java.math.BigInteger;

public class baekjoon1252 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String a = in.next();
		String b = in.next();
		
		BigInteger ai = new BigInteger(a, 2);
		BigInteger bi = new BigInteger(b, 2);
		BigInteger ab = ai.add(bi);
		System.out.println(ab.toString(2));
	}
}
