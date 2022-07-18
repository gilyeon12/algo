package com.ssafy.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.StringTokenizer;

public class SWEA_D3_5215_햄버거다이어트 { // 전에 풀었던 문제 다시 풀어봄!
	static String str = "1\r\n" + "5 1000\r\n" + "100 200\r\n" + "300 500\r\n" + "250 300\r\n" + "500 1000\r\n"
			+ "400 400";

	static int N, L;
	static int result;
	static int[] gred;
	static int[] cal;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		in = new BufferedReader(new StringReader(str));
		int T = Integer.parseInt(in.readLine());

		for (int tc = 1; tc <= T; tc++) {
			sb.append("#").append(tc).append(" ");
			StringTokenizer st = new StringTokenizer(in.readLine());
			N = Integer.parseInt(st.nextToken()); // 재료의 수.
			L = Integer.parseInt(st.nextToken()); // 제한 칼로리.
			gred = new int[N]; // 재료 배열 초기화. (안하면 NULL PointException 발생.)
			cal = new int[N]; // 칼로리 배열 초기화. (안하면 NULL PointException 발생.)

			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(in.readLine());
				gred[i] = Integer.parseInt(st.nextToken()); // 재료 배열 입력.
				cal[i] = Integer.parseInt(st.nextToken()); // 칼로리 배열 입력.
			}

			result = 0;
			comb(0, 0, 0); // 조합 함수.

			sb.append(result).append("\n");
		}
		System.out.println(sb);
	}

	private static void comb(int idx, int sumGred, int sumCal) {
		// 종료 조건.
		if (sumCal > L)
			return;

		if (sumGred > result)
			result = sumGred;

		if (idx == N)
			return;
		// 재료를 선택했다면, 해당 재료의 점수와 칼로리를 더해주고 다음 idx로,
		comb(idx + 1, sumGred + gred[idx], sumCal + cal[idx]);
		// 재료를 선택하지 않았다면, 다음 idx로,
		comb(idx + 1, sumGred, sumCal);

	}
}
