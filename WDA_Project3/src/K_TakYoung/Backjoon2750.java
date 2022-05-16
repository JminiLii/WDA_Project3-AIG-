package K_TakYoung;

import java.util.Scanner;

public class Backjoon2750 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int num[] = new int[a];
		
		for (int i=0; i<num.length; i++) {
			num[i] = sc.nextInt();
			
		}
		for(int i =0; i<num.length; i++) {
			for(int j =i+1; j<num.length; j++) {
				  if (num[i]>num[j]) {
					int temp = num[j];
					num[j]=num[i];
					num[i]=temp;
				}else {
					break;
				}
			}
		}
            for(int sort : num) {
            	System.out.println(sort);
            }
    }
}
