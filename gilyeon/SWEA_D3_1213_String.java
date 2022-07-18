package com.ssafy.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;

public class SWEA_D3_1213_String {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		//in = new BufferedReader(new StringReader(str));
		StringBuilder sb = new StringBuilder();
		for (int tc = 1; tc <= 10; tc++) {
			sb.append("#").append(tc).append(" ");
			in.readLine();
			String find = in.readLine(); // 찾을 문자열
			String search = in.readLine(); // 검색할 문자열
			int result = 0;

			for (int i = 0; i <= search.length() - find.length(); i++) { // 부등호 필수!!
				// 검색할 문자열을 substring으로 처음부터 찾을 문자열의 길이만큼 비교해보기.
				if (find.equals(search.substring(i, i + find.length())))
					result++;
			}
			sb.append(result).append("\n");
		}
		System.out.println(sb);
	}
}
