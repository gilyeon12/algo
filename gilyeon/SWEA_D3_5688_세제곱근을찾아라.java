package com.ssafy.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.math.BigInteger;

public class SWEA_D3_5688_세제곱근을찾아라 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		in = new BufferedReader(new StringReader(str));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(in.readLine());
		for (int tc = 1; tc <= T; tc++) {
			sb.append("#").append(tc).append(" ");
			long N = Integer.parseInt(in.readLine()); // 변수형 long으로 설정. (그런데도 런타임에러ㅠ)
			long x = 1; // N = x^3;
			long cal = 0;
			int flag = -1; 
			// 1부터 세제곱근 구해보기.
			while (true) {
				cal = x * x * x;
				if (cal == N) {
					flag = 1;
					break;
				} else if (cal > N) // 비교할 수보다 세제곱근이 많아지면 break;
					break;
				x += 1;
			}

			if (flag == 1)
				sb.append(x);
			else // 세제곱근인 수가 없을 때,
				sb.append(flag);
			sb.append("\n");
		}
		System.out.println(sb);
	}

	static String str = "3\r\n" + "27\r\n" + "7777\r\n" + "64";
}
