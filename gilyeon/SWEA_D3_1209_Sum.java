package com.ssafy.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.StringTokenizer;

public class SWEA_D3_1209_Sum {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		//in = new BufferedReader(new StringReader(str));
		StringBuilder sb = new StringBuilder();
		int[][] arr = new int[100][100]; // 100x100인 배열 생성.
		for (int tc = 1; tc <= 10; tc++) {
			int T = Integer.parseInt(in.readLine());
			sb.append("#").append(tc).append(" ");
			int wmax = 0;
			int hmax = 0;
			int lmax = 0;
			int rmax = 0;
			int temp = 0;

			// 배열 입력 받기.
			for (int i = 0; i < 100; i++) {
				StringTokenizer st = new StringTokenizer(in.readLine());
				for (int j = 0; j < 100; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
				}
			}

			// 가로 최댓값 구하기.
			for (int i = 0; i < 100; i++) {
				for (int j = 0; j < 100; j++) {
					temp += arr[i][j];
				}
				if (wmax < temp)
					wmax = temp;
				temp = 0;
			}

			// 세로 최댓값 구하기.
			for (int i = 0; i < 100; i++) {
				for (int j = 0; j < 100; j++) {
					temp += arr[j][i];
				}
				if (hmax < temp)
					hmax = temp;
				temp = 0;
			}

			// 왼쪽 대각선 최댓값 구하기.
			for (int i = 0; i < 100; i++) {
				for (int j = 0; j < 100; j++) {
					if(i == j) temp += arr[j][i];
				}
				if (lmax < temp)
					lmax = temp;
				temp = 0;
			}

			// 오른쪽 대각선 최댓값 구하기.
			for (int i = 0; i < 100; i++) {
				for (int j = 0; j < 100; j++) {
					if(i+j==99) temp += arr[j][i];
				}
				if (rmax < temp)
					rmax = temp;
				temp = 0;
			}

			int result1 = Math.max(wmax, hmax);
			int result2 = Math.max(lmax, rmax);
			int result = Math.max(result1, result2);
			sb.append(result);
			sb.append("\n");

		}
		System.out.println(sb);
	}
}
