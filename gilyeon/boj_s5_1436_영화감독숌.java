package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_s5_1436_영화감독숌 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());
		int count = 0;
		int target = 0;

//		0부터 수를 세어 666이 들어가는 숫자를 센다 ----------> 브루트포스 알고리즘 (일일히 다 세기 때문에 메모리 사용량, 시간 모두 많이 든다.)
		while (count != N) {
			target++;
			if (String.valueOf(target).contains("666")) {
				count++;
			}
		}
		System.out.println(target);
	}

}
