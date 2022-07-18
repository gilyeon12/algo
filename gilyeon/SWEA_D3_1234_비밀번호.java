package com.ssafy.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class SWEA_D3_1234_비밀번호 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		//in = new BufferedReader(new StringReader(str));
		StringBuilder sb = new StringBuilder();
		for (int tc = 1; tc <= 10; tc++) {
			sb.append("#").append(tc).append(" ");
			StringTokenizer st = new StringTokenizer(in.readLine());
			int N = Integer.parseInt(st.nextToken()); // 문자열의 길이
			String S = st.nextToken(); // 문자열

			Stack<Character> stack = new Stack<>();
			String result = "";

			for (int i = 0; i < N; i++) {
				if (stack.isEmpty() || S.charAt(i) != stack.peek()) { // 스택이 비어있거나, 스택의 peek가 넣을 문자와 다르다면, 스택 push
					// 이때 조건문이 if (S.charAt(i) != stack.peek() || stack.isEmpty()) 라면, stackEmpty 오류남!!!!
					// 무조건 stack.isEmpty()이 조건문에 먼저 나와야함!!!!!
					stack.push(S.charAt(i)); // 스택에 문자 push.
				} else { // 같다면 stack에서 문자 제거.
					stack.pop();
				}
			}

			// 스택 출력.
			while (true) {
				if (stack.empty())
					break;
				result += stack.pop();
			}

			StringBuilder sb1 = new StringBuilder(result);
			sb.append(sb1.reverse()).append("\n"); // 스택의 결과를 담은 문자열을 reverse해서 출력.
		}
		System.out.println(sb);
	}
}
