package P_JunHong;

import java.util.Scanner;

public class Num1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().trim();

        if(str.isEmpty()) System.out.println("0");
        else System.out.println(str.split(" ").length);

        /*
           String str = sc.nextLine();
            int cnt=0;
            if(str.charAt(0)==' '){
                cnt--;
            }
                String[] ArrayStrings = str.split(" ");
                for (String s : ArrayStrings){
                cnt++;
            }
                if(cnt < 0) System.out.println("0");
                else System.out.println(cnt);
            }
     */
    }
}
