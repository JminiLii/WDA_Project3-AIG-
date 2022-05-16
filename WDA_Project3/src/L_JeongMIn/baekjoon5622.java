package L_JeongMIn;
import java.util.Scanner;

public class baekjoon5622 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int sum = 0;

        String[][] alpa = { {"","","",""},
                            {"","","",""},
                            {"","","",""},
                            {"A","B","C",""},
                            {"D","E","F",""},
                            {"G","H","I",""},
                            {"J","K","L",""},
                            {"M","N","O",""},
                            {"P","Q","R","S"},
                            {"T","U","V",""},
                            {"W","X","Y","Z"}};

        
        String[] input = in.next().split("");

        for (int i = 0; i < input.length; i++) {
            for (int j = 3; j < 11; j++) {
                for (int j2 = 0; j2 < 4; j2++) {
                    if(input[i].equals(alpa[j][j2])) {
                        sum += j;
                    }
                }
            }
        }
        System.out.println(sum);
	}
}
