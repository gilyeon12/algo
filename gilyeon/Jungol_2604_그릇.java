package com.ssafy.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Jungol_2604_그릇 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String str = in.readLine(); // 입력받은 괄호 문자열
		int res = 10; // 처음에 무조건 그릇이 하나는 쌓이므로 높이 10으로 초기화.
		for (int i = 1; i < str.length(); i++) { // 두번째 그릇부터 시작.
			if (str.charAt(i) == '(') { // 현재 괄호가 '('일 때,
				if (str.charAt(i - 1) == '(') // 이전 괄호 판별.
					res += 5;
				else
					res += 10;
			} else { // 현재 괄호가 ')'일 때,
				if (str.charAt(i - 1) == '(') // 이전 괄호 판별.
					res += 10;
				else
					res += 5;
			}
		}
		System.out.println(res);
	}
}
