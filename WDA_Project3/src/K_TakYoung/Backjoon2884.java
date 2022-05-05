package K_TakYoung;

import java.util.Scanner;

public class Backjoon2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int min  = sc.nextInt();
		
		if(min < 45)
		{
			min+=15;
			if(hour == 0)
			{
				hour = 23;
				System.out.println(hour+ " " + min);
			}
			else
			{ hour--;
			System.out.println(hour+ " " + min);
			}
		}
		else {
			min -=45;
			System.out.println(hour+ " "+ min);
		}
	}

}