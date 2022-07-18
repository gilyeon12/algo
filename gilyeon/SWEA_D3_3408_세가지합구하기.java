package com.ssafy.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;

public class SWEA_D3_3408_세가지합구하기 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		in = new BufferedReader(new StringReader(str));
		int T = Integer.parseInt(in.readLine());
		StringBuilder sb = new StringBuilder();
		for (int tc = 1; tc <= T; tc++) {
			sb.append("#").append(tc).append(" ");
			long N = Integer.parseInt(in.readLine()); // 테케 숫자 (자료형을 long으로!)
			long S1 = 0; // 양의 정수 중에서 작은 순서대로 N개의 합.
			long S2 = 0; // 양의 정수 중 홀수인 것들 중에서 작은 순서대로 N개의 합.
			long S3 = 0; // 양의 정수 중 짝수인 것들 중에서 작은 순서대로 N개의 합.

			// 반복문으로 하면 시간 초과!!!! 규칙을 찾아야 함!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
			S2 = N * N;
			S3 = S2 + N;
			S1 = S3 / 2;

			sb.append(S1).append(" ").append(S2).append(" ").append(S3).append("\n");
		}
		System.out.println(sb);
	}

	static String str = "3\r\n" + "1\r\n" + "10\r\n" + "1001";
}
