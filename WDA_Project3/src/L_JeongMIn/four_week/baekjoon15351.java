package L_JeongMIn.four_week;
import java.util.Scanner;

public class baekjoon15351 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();					//즐기는 것의 개수 입력 받기
		String[] life = new String[N];			//즐기는 것의 개수 만큼 배열 생성
		
		life[0]=in.nextLine();
		for (int i = 0; i < life.length; i++) { //즐기는 것의 개수 만큼 입력 받기
			life[i] = in.nextLine();
		}
		
		for (int i = 0; i < life.length; i++) {				//즐기는 것의 개수(행)
			int hap=0;
			for (int j = 0; j < life[i].length(); j++) {	//즐기는 것의 문자 개수(열)
				if(life[i].charAt(j)-'A' + 1 != -32) {		//문자 하나 뽑아서 A를 빼고 문제에서 1부터 A라고 해서 1 더해준다. / -32는 공백이라서 hap에 더해주지 않는다.
					hap += life[i].charAt(j)-'A' + 1;		//공백이 아닌 것들은 hap에 더해준다
				}
			}
			if(hap == 100)	System.out.println("PERFECT LIFE"); //hap이 100점이면 "PERFECT LIFE" 출력
			else	System.out.println(hap);					//아니면 그냥 점수 출력
		}
	}
}

