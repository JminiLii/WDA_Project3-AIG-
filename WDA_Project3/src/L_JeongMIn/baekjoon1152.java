package L_JeongMIn;
import java.util.Scanner;

public class baekjoon1152 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

        String str = in.nextLine();

        String[] str_slice = str.split(" ");

        if(str_slice.length==0)
        {
        	System.out.println(0);
        }
        else if(str_slice[0] == "") {
        	System.out.println(str_slice.length-1);
        }
        else {
        	System.out.println(str_slice.length);
        }
	}
}
