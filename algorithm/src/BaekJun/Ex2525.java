package BaekJun;

import java.util.Scanner;

public class Ex2525 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt(); // 시간
		int B = sc.nextInt(); // 분
		int C = sc.nextInt(); // 조리 시간
		int D = B + C; // 완료

		// 23 : 59
		// 시간이 24면 시간은 0
		// 완료 분이 60을 넘어가면 시간 +1
		// 완료 분이 60아래면 시간 +0
		// 완료 분이 60이면 분은 0
		if (D >= 60) {
			A = A + (D / 60);
			D = D % 60;
			if (A >= 24) {
				A = A - 24;
			}
		}
		System.out.println(A + " " + D);
	}
}
