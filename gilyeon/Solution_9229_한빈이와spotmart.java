package com.ssafy.hw;

import java.io.*;
import java.util.*;

public class Solution_9229_한빈이와spotmart {
	static int[] input, numbers = new int[2];
	static int N, M, MAX, SUM;

	static void comb(int start, int index) {
		// 기저조건
		if (index == 2) {
			for (int i = 0; i < 2; i++) {
				SUM += numbers[i];
			}
			if (SUM <= M)
				MAX = Math.max(SUM, MAX);
			SUM = 0;
			return;
		}
		for (int i = start; i < N; i++) {
			numbers[index] = input[i];
			comb(i + 1, index + 1);
		}
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		in = new BufferedReader(new StringReader(str));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(in.readLine());

		for (int tc = 1; tc <= T; tc++) {
			sb.append("#").append(tc).append(" ");
			MAX = 0;
			StringTokenizer st = new StringTokenizer(in.readLine());
			N = Integer.parseInt(st.nextToken()); // 과자 개수
			M = Integer.parseInt(st.nextToken()); // 최대 무게
			input = new int[N];
			st = new StringTokenizer(in.readLine());
			for (int i = 0; i < N; i++) {
				input[i] = Integer.parseInt(st.nextToken());
			}
			comb(0, 0); // 조합 함수.
			
			if (MAX == 0) // 방법이 없는 경우.
				MAX--;
			sb.append(MAX);
			sb.append("\n");
		}
		System.out.println(sb);
	}

	static String str = "4\r\n" + "3 45\r\n" + "20 20 20\r\n" + "6 10\r\n" + "1 2 5 8 9 11\r\n" + "4 100\r\n"
			+ "80 80 60 60\r\n" + "4 20\r\n" + "10 5 10 16";

}
