package C_GyuTae;

import java.util.Scanner;

public class BJ_1157 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[26];
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            int str_char = str.charAt(i);
            if (97 <= str_char && str_char <= 122) {
                arr[str_char - 97]++;
            } else {
                arr[str_char - 65]++;
            }
        }
        int max = -1;
        char index = 0;

        for (int i = 0; i < 26; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = (char) (i + 65);
            } else if (arr[i] == max) {
                index = '?';
            }
        }
        System.out.println(index);
        sc.close();
    }
}