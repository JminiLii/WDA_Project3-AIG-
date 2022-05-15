package K_TakYoung;
import java.util.Scanner;
public class Backjoon1152 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		int count =1;
		String word = sc.nextLine();
		word = word.toUpperCase();
		
	
		for(int i = 0; i<word.length(); i++) {
			if(word.charAt(i) == ' ') {
				count++;
			}
		}
			System.out.println(count);
		}
     }
	


