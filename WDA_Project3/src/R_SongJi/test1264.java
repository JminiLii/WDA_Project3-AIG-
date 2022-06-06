package beakjoon;

import java.util.Scanner;
public class test1264 {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("모음의 개수를 셀 문장을 쓰시오(띄어쓰기 하지마세요): "); 
        String line = sc.next();
        System.out.println(line);
        for(int i = 0; i <line.length();i++){
            switch(line.charAt(i)) {
                case 'a' : case 'e' :case 'i' : case 'o' : case 'u' :
                count++;
                break;
            }
        }
        System.out.println(count);
    }
}
