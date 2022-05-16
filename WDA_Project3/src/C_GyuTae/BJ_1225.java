package C_GyuTae;
import java.util.Scanner;

public class BJ_1225 {
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        int num2 = sc.nextInt();
        
        int cnt = 1;
        int cnt1 = 1;

        int qu = num;
        int qu1 = num2;
        
        while(qu > 10) {
            qu = qu / 10;
            cnt++;
        }
        
        while(qu1 > 10) {
            qu1 = qu1 / 10;
            cnt1++;
        }
        
        int[] numArray = new int[cnt];   
        int[] numArray2 = new int[cnt1];
        int[] numArray3 = new int[cnt * cnt1];
        
        int i = 0;
        
        while(num > 0) {        
            numArray[i] = num % 10;
            num = num / 10;
            i++;
        }
        
        int j = 0;
        while(num2 > 0) {
            numArray2[j] = num2%10;
            num2 = num2/10;    
            j++;
        }
        
        int k = 0;

        for(i = 0; i < numArray.length; i++) {
            for(j = 0; j < numArray2.length; j++) {
                numArray3[k] = numArray[i] * numArray2[j];
                k++;
            }
        }
        
        int sum =0;

        for(i=0; i<numArray3.length; i++) {
            sum += numArray3[i];
        }        
        System.out.println(sum);
    }
 
}
