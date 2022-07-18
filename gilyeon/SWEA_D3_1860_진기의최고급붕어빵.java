package com.ssafy.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SWEA_D3_1860_진기의최고급붕어빵 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		in = new BufferedReader(new StringReader(str));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(in.readLine());

		for (int tc = 1; tc <= T; tc++) {
			sb.append("#").append(tc).append(" ");
			StringTokenizer st = new StringTokenizer(in.readLine());
			int N = Integer.parseInt(st.nextToken()); // 손님의 수.
			int M = Integer.parseInt(st.nextToken()); // 붕어빵을 만드는 시간.
			int K = Integer.parseInt(st.nextToken()); // 그 시간만큼 만들 수 있는 붕어빵 개수.
			int[] C = new int[N]; // 손님이 오는 시간을 담는 배열.
			boolean result = false;

			// 손님이 오는 시간 입력.
			st = new StringTokenizer(in.readLine());
			for (int i = 0; i < N; i++) {
				C[i] = Integer.parseInt(st.nextToken());
			}

			Arrays.sort(C); // 오름차순으로 정렬.
			
			for (int i = 1; i <= N; i++) {
				int time = C[i - 1]; // 손님이 오는 시간.
				int bread = time / M * K - i; // 그 시간에 있는 빵 개수 계산.(손님의 수만큼 빼주기)
				if (bread < 0) { // 빵의 개수가 0보다 작다면 impossible.
					result = true;
					break;
				}
			}

			// 결과값 출력.
			if (result == true) {
				sb.append("Impossible").append("\n");
			} else
				sb.append("Possible").append("\n");

		}
		System.out.println(sb);
	}

	static String str = "4\r\n" + "2 2 2\r\n" + "3 4\r\n" + "2 2 2\r\n" + "1 2\r\n" + "2 2 1\r\n" + "4 2\r\n"
			+ "2 2 1\r\n" + "3 2";
}
