package com.ssafy.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.StringTokenizer;

public class SWEA_6190_정곤이의단조증가하는수 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		//in = new BufferedReader(new StringReader(str));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(in.readLine());

		
		for (int tc = 1; tc <= T; tc++) {
			sb.append("#").append(tc).append(" ");
			int N = Integer.parseInt(in.readLine()); // 숫자의 개수.
			StringTokenizer st = new StringTokenizer(in.readLine());
			int arr[] = new int[N]; // 숫자 배열.
			int result = -1;
			// 숫자 배열 입력.
			for (int i = 0; i < N; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			// 곱을 string형으로 바꾸어 단조인지 판별하는 로직.
			for (int i = 0; i < N; i++) {
				for (int j = i + 1; j < N; j++) {
					int multi = arr[i] * arr[j];
					String strMulti = String.valueOf(multi);
					int danjo = 0; // 단조인지 판별하는 변수.
					for (int k = 1; k < strMulti.length(); k++) {
						if (strMulti.charAt(k - 1) > strMulti.charAt(k)) {
							danjo = 1;
							break;
						}
					}
					// 단조라면 최대값을 출력.
					if (danjo == 0) {
						result = Math.max(result, multi);
					}
				}
			}
			sb.append(result).append("\n");
		}
		System.out.println(sb);
	}

}