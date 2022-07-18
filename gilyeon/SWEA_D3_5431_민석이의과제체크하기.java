package com.ssafy.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.StringTokenizer;

public class SWEA_D3_5431_민석이의과제체크하기 {
	/* 배열을 어떻게 활용할 것인가? 생각해보기 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		in = new BufferedReader(new StringReader(str));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(in.readLine());
		for (int tc = 1; tc <= T; tc++) {
			sb.append("#").append(tc).append(" ");
			StringTokenizer st = new StringTokenizer(in.readLine());
			int N = Integer.parseInt(st.nextToken()); // 수강생의 수.
			int K = Integer.parseInt(st.nextToken()); // 과제를 제출한 사람의 수.

			int[] student = new int[N + 1]; // 학생[번호] = 과제 제출 여부

			st = new StringTokenizer(in.readLine());
			for (int i = 0; i < K; i++) {
				int K_num = Integer.parseInt(st.nextToken()); // 과제를 제출한 사람의 번호
				student[K_num] = 1; // 이 번호의 학생의 제출 여부를 1로 변경.

			}

			for (int i = 1; i <= N; i++) {
				if (student[i] == 0) { // 제출 여부가 0이라면, 즉 과제를 제출안했다면 
					sb.append(i).append(" "); // 학생의 번호를 출력.
				}
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}

	static String str = "2\r\n" + "5 3\r\n" + "2 5 3\r\n" + "7 2\r\n" + "4 6";
}
