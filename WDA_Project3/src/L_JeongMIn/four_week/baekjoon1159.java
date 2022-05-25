package L_JeongMIn.four_week;
import java.util.Scanner;

public class baekjoon1159 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int cnt = in.nextInt();						//선수의 수 입력받기
		String[] player = new String[cnt];			//선수의 수 만큼 배열 생성
		int[] alp = new int[26];					//알파뱃 수 만큼 배열 생성
		for (int i = 0; i < player.length; i++) {	//선수 수 만큼 이름 입력 받기
			player[i] = in.next();
		}
		// for (int i = 0; i < alp.length; i++) {	//알파뱃배열 0으로 초기화 해주기
		// 	alp[i]=0;
		// }
		char c;
		for (int i = 0; i < player.length; i++) {
			c = player[i].charAt(0);			//플레이어 이름의 첫 글자만 c에 대입
			alp[c - 'a']++;
		}
		int a;
		cnt=0;
		for (int i = 0; i < alp.length; i++) {
			if(alp[i] >= 5) {					//만약 알파뱃 중에 5개가 중복되는게 있으면
				a = i+97;
				c = (char)a;
				System.out.print(c);			//문자로 바꿔 출력
			}
			else {								//5개 넘는게 없으면
				cnt ++;							//카운트 올려주기
			}
		}
		if(cnt == 26) System.out.println("PREDAJA"); //카운트가 26이면 즉 알파뱃중에 5개가 중복 되는게 없을때 "PREDAJA"출력
	}
}
