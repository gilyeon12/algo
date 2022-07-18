package com.ssafy.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.StringTokenizer;

public class SWEA_D3_6485_삼성시의버스노선 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		in = new BufferedReader(new StringReader(str));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(in.readLine());
		for (int tc = 1; tc <= T; tc++) {
			sb.append("#").append(tc).append(" ");
			int N = Integer.parseInt(in.readLine()); // 버스 노선의 수.
			int[] A = new int[N];
			int[] B = new int[N];
			// 버스 노선 입력.
			for (int i = 0; i < N; i++) {
				StringTokenizer st = new StringTokenizer(in.readLine());
				A[i] = Integer.parseInt(st.nextToken());
				B[i] = Integer.parseInt(st.nextToken());
			}
			
			int P = Integer.parseInt(in.readLine()); // 정류장 수.
			for (int i = 0; i < P; i++) {
				int result = 0;
				int C = Integer.parseInt(in.readLine());
				// 하나의 버스가 몇 개의 정류장을 지나는지 count한다.
				for (int j = 0; j < N; j++) {
					if(A[j] <= C && C <= B[j])
						result++;
				}
				sb.append(result).append(" ");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
	static String str = "1\r\n" + 
			"2\r\n" + 
			"1 3\r\n" + 
			"2 5\r\n" + 
			"5\r\n" + 
			"1\r\n" + 
			"2\r\n" + 
			"3\r\n" + 
			"4\r\n" + 
			"5";
}
