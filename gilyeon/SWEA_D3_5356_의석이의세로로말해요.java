package com.ssafy.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SWEA_D3_5356_의석이의세로로말해요 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		in = new BufferedReader(new StringReader(str));
		int T = Integer.parseInt(in.readLine());
		StringBuilder sb = new StringBuilder();
		for (int tc = 1; tc <= T; tc++) {
			sb.append("#").append(tc).append(" ");
			char[][] arr = new char[5][15];

			// 배열 입력.
			for (int i = 0; i < 5; i++) {
				String temp = in.readLine();
				for (int j = 0; j < temp.length(); j++) { // 공백이 있을 수도 있으므로 행에 길이만큼만 입력받기.
					arr[i][j] = temp.charAt(j);
				}
			}

			// (0,0)(1,0)(2,0)(3,0)(4,0)(1,1)(2,1)(3,1)(~5, ~15)
			for (int i = 0; i < 15; i++) {
				for (int j = 0; j < 5; j++) {
					if (arr[j][i] != 0) // 공백이 아닐경우 출력하기.
						sb.append(arr[j][i]);
				}
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}

	static String str = "2\r\n" + "ABCDE\r\n" + "abcde\r\n" + "01234\r\n" + "FGHIJ\r\n" + "fghij\r\n" + "AABCDD\r\n"
			+ "afzz\r\n" + "09121\r\n" + "a8EWg6\r\n" + "P5h3kx";
}
