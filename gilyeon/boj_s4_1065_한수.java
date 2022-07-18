package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_s4_1065_한수 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());
		int count = 99;
		int loop = 100;
		// 한자리수, 두자리수 일 때, 계산할 필요 X
		if (N <= 99) {
			System.out.println(N);
		}
		// 세자리수일 때,
		else if (N >= 100 && N <= 999) {
			// 숫자 하나씩 한수인지 판단.
			while (N >= loop) {
				int n1 = loop / 100; // 백의 자리
				int n2 = (loop % 100) / 10; // 십의 자리
				int n3 = (loop % 100) % 10; // 일의 자리
				if ((n2 - n1) == (n3 - n2)) {
					count++;
				}
				loop++;
			}
			System.out.println(count);
		}
		// 네자리수일 때, (=1000)
		else {
			System.out.println(144);
		}
	}

}
