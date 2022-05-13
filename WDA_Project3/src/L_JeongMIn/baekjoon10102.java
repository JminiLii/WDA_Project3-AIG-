package L_JeongMIn;
import java.util.Scanner;

public class baekjoon10102 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = in.nextInt();
		int A=0, B=0;
		String AB = in.next();
		String[] AB_Array = AB.split("");
		for (int i = 0; i < count; i++) {
			if(AB_Array[i].equals("A")) 	A++;
			else			 				B++;
		}
		if(A > B)		System.out.println("A");
		else if(A < B)	System.out.println("B");
		else			System.out.println("Tie");
	}
}