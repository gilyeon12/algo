package com.ssafy.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.StringTokenizer;

public class SWEA_D3_1206_View {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		//in = new BufferedReader(new StringReader(str));
		StringBuilder sb = new StringBuilder();
		for (int T = 1; T <= 10; T++) {
			int sum = 0;
			sb.append("#").append(T).append(" ");
			int N = Integer.parseInt(in.readLine()); // 가로 길이
			int arr[] = new int[N]; // 건물 높이 배열
			StringTokenizer st = new StringTokenizer(in.readLine());
			// 건물 높이 배열 입력 받기.
			for (int i = 0; i < N; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			// 주변(+-2)에서 가장 높은 건물의 높이를 구하고 차이 더해주기.
			for (int i = 2; i < N - 2; i++) {
				int lmax = Math.max(arr[i - 2], arr[i - 1]);
				int rmax = Math.max(arr[i + 1], arr[i + 2]);
				int max = Math.max(lmax, rmax);
				if (max > arr[i]) // 높이가 더 높다면 조망권 확보 X.
					continue;
				sum += arr[i] - max;
			}
			sb.append(sum);
			sb.append("\n");

		}
		System.out.println(sb);
	}
}
