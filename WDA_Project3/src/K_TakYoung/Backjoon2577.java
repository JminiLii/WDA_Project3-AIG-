package K_TakYoung;

import java.util.*;

public class Backjoon2577 {
    public static void main(String[] args) {

        int[] arr = new int[10];
        char tmp = ' ';

        Scanner sc = new Scanner(System.in);
        //String input = sc.nextLine();
        int value = (sc.nextInt()*sc.nextInt()*sc.nextInt());
        String str= Integer.toString(value);
        sc.close();

        for(int i = 0; i<str.length(); i++){
            tmp = str.charAt(i);

            for(int j =0; j<arr.length; j++){
                if((tmp -'0')==j)
                    arr[j]+=1;
            }
        }
        for(int i=0; i<arr.length;i++ ) {
            System.out.print(" "+ arr[i]);

            for(int j=0; j<arr[i]; j++){
                System.out.print("");
            }
            System.out.println();  
        }
    }
}
