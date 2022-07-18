package com.ssafy.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;

public class SWEA_D3_3750_Digitsum {
	// ************************************런타임에러*******************************(일단 테케는 맞음!)
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		in = new BufferedReader(new StringReader(str));
		int T = Integer.parseInt(in.readLine());
		StringBuilder sb = new StringBuilder();
		for (int tc = 1; tc <= T; tc++) {
			sb.append("#").append(tc).append(" ");
			long N = Integer.parseInt(in.readLine()); // 테케 숫자 (자료형을 long으로!)
			// 각 자리수 합 구하는 반복문.
			while (true) {
				long sum = 0;
				String temp = String.valueOf(N); // 숫자 -> 문자열
				for (int i = 0; i < temp.length(); i++) {
					sum += temp.charAt(i) - '0'; // 문자 하나씩 숫자로 변환해서 더해주기.
				}
				// 종료 조건.
				if (sum < 10) {
					sb.append(sum).append("\n");
					break;
				}
				N = sum; // 다음 계산을 위해 대입.
			}

		}
		System.out.println(sb);
	}

	static String str = "3\r\n" + "5\r\n" + "108\r\n" + "588432";
}
