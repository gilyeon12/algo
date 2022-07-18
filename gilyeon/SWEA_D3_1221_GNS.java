package com.ssafy.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SWEA_D3_1221_GNS {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		//in = new BufferedReader(new StringReader(str));
		int T = Integer.parseInt(in.readLine());
		StringBuilder sb = new StringBuilder();
		for (int tc = 1; tc <= T; tc++) {
			sb.append("#").append(tc).append("\n");
			StringTokenizer st = new StringTokenizer(in.readLine());
			st.nextToken();
			int N = Integer.parseInt(st.nextToken()); // 단어 개수.
			int [] arr = new int[N]; // 단어 -> 숫자 배열.
			st = new StringTokenizer(in.readLine());
			// 단어 -> 숫자
			for (int i = 0; i < N; i++) {
				String word = st.nextToken();
				switch (word) {
				case "ZRO":
					arr[i] = 0;
					break;
				case "ONE":
					arr[i] = 1;
					break;
				case "TWO":
					arr[i] = 2;
					break;
				case "THR":
					arr[i] = 3;
					break;
				case "FOR":
					arr[i] = 4;
					break;
				case "FIV":
					arr[i] = 5;
					break;
				case "SIX":
					arr[i] = 6;
					break;
				case "SVN":
					arr[i] = 7;
					break;
				case "EGT":
					arr[i] = 8;
					break;
				case "NIN":
					arr[i] = 9;
					break;
				}
			}
			
			Arrays.sort(arr); // 배열 오름차순 정렬.
			
			// 숫자 -> 단어
			for (int i = 0; i < N; i++) {
				switch (arr[i]) {
				case 0:
					sb.append("ZRO");
					break;
				case 1:
					sb.append("ONE");
					break;
				case 2:
					sb.append("TWO");
					break;
				case 3:
					sb.append("THR");
					break;
				case 4:
					sb.append("FOR");
					break;
				case 5:
					sb.append("FIV");
					break;
				case 6:
					sb.append("SIX");
					break;
				case 7:
					sb.append("SVN");
					break;
				case 8:
					sb.append("EGT");
					break;
				case 9:
					sb.append("NIN");
					break;
				}
				sb.append(" ");
			}
		}
		System.out.println(sb);
	}
}
