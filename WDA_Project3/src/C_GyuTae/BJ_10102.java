package C_GyuTae;
import java.util.Scanner;

public class BJ_10102	{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int x = 0;
		int y = 0;
		String vote = sc.next();
		for(int i=0;i<vote.length();i++)
		{
			if(vote.charAt(i) == 'A')
				x++;
			else if(vote.charAt(i) == 'B')
				y++;
		}
		sc.close();
		if(x > y)
			System.out.print("A");
		else if(x < y)
			System.out.print("B");
		else
			System.out.print("Tie");
			
			
	}
}