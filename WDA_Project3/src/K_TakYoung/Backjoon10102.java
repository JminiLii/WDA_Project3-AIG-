package K_TakYoung;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class Backjoon10102 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        int A = 0;
        int B = 0;
        String vote = sc.next();
        for(int i = 0; i<vote.length(); i++){
            if(vote.charAt(i)=='A')
                A++;
                else if(vote.charAt(i) == 'B')
                B++;
        }
        sc.close();
        if(A > B)
          System.out.print("A");
        else if (A<B)
          System.out.print("B");
        else  
          System.out.print("Tie");      
        
    }
    
}
