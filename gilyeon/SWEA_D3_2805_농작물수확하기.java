package com.ssafy.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.StringTokenizer;

public class SWEA_D3_2805_농작물수확하기 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		//in = new BufferedReader(new StringReader(str));
		StringBuilder sb = new StringBuilder();
		int[][] map;
		int T = Integer.parseInt(in.readLine());
		for (int tc = 1; tc <= T; tc++) {
			sb.append("#").append(tc).append(" ");
			int N = Integer.parseInt(in.readLine());
			map = new int[N][N];
			// 배열 입력받기.
			for (int i = 0; i < N; i++) {
				String s = in.readLine();
				for (int j = 0; j < N; j++) {
					map[i][j] = s.charAt(j) - '0';
				}
			}

			// 농작물 수확 시작! (다이아몬드 모양으로 수확해라!)
			int mid = N/2;
			int area = 0;
			int sum = 0;
			for (int i = 0; i < N; i++) {
				int start = mid - area;
				int end = mid + area;
				for (int j = start; j <= end; j++) {
					sum += map[i][j];
				}

				if (i >= mid) {
					area--;
				} else {
					area++;
				}
			}
			sb.append(sum).append("\n");

		}
		System.out.println(sb);
	}
}
