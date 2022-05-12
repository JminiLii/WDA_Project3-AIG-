package K_TakYoung;

import java.util.Scanner;

public class Backjoon1264 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        for(;;){
        String str = sc.nextLine();
        int sum = 0;
        if(str.equals("#")){
            break;
        }
        for(int i= 0; i<str.length(); i++) {
            if(str.charAt(i)=='a' || str.charAt(i)=='e'|| str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
        
                sum++;   
        }
            
            System.out.println(sum);
    
         }
    }
}
