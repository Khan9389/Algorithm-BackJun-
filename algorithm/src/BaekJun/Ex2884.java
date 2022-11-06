package BaekJun;

import java.util.Scanner;

public class Ex2884 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt(); // 시간
		int M = sc.nextInt(); // 분

		if (H < 0 || H > 24) {
			System.err.println("시간은 1~24까지 입력 가능합니다.");
			sc.close();
			return;
		}
		if (M < 0 || M > 59) {
			System.err.println("시간은 0~59까지 입력 가능합니다.");
			sc.close();
			return;
		}

		if (M >= 45) {
			M -= 45;
		} else {
			M = 60 - (45 - M);
			H -= 1;
		}

		if (M == 60) {
			M = 0;
		}
		
		if (H == -1 ) {
			H = 23;
		}
		System.out.println(H + " " + M);
	}

}
