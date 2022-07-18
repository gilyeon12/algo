package com.ssafy.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.StringTokenizer;

import javax.print.DocFlavor.STRING;

public class boj_단계별로풀어보기_문자열 {

	public static void main(String[] args) throws IOException {
		/*
		 * 아스키 코드 BufferedReader in = new BufferedReader(new
		 * InputStreamReader(System.in)); String C = in.readLine(); char c =
		 * C.charAt(0); // String형 -> char형 변환
		 * 
		 * int res = (int)c; // char형을 int로 형변환. System.out.println(res);
		 */

		/*
		 * 11720 숫자의 합 BufferedReader in = new BufferedReader(new
		 * InputStreamReader(System.in)); int T = Integer.parseInt(in.readLine());
		 * String S = in.readLine(); int res = 0; for (int i = 0; i < T; i++) { res +=
		 * S.charAt(i) - '0'; // char형 -> int형 } System.out.println(res);
		 */

		/*
		 * 10809 알파벳 찾기 BufferedReader in = new BufferedReader(new
		 * InputStreamReader(System.in)); String S = in.readLine(); StringBuilder sb =
		 * new StringBuilder();
		 * 
		 * for (int i = 'a'; i <= 'z'; i++) { // 알파벳 소문자 하나씩 검사 int idx = 0; // 문자열에 해당
		 * 알파벳이 어디에 있는지 위치 저장. int flag = 0; // 문자열에 해당 알파벳이 있는지 판별. (초기화 위치 중요!) for
		 * (int j = 0; j < S.length(); j++) { // 문자열 하나씩 검사 if((int)S.charAt(j) == i) {
		 * // 해당 문자에 해당 알파벳이 있다면, flag = 1; idx = j; // 위치 저장. break; } } // flag값에 따라서
		 * 출력을 다르게 if(flag == 1) sb.append(idx).append(" "); else
		 * sb.append(-1).append(" "); } System.out.println(sb);
		 */

		/*
		 * 2675 문자열 반복 BufferedReader in = new BufferedReader(new
		 * InputStreamReader(System.in)); in = new BufferedReader(new
		 * StringReader(str)); int T = Integer.parseInt(in.readLine()); StringBuilder sb
		 * = new StringBuilder(); for (int tc = 1; tc <= T; tc++) { StringTokenizer st =
		 * new StringTokenizer(in.readLine()); int R = Integer.parseInt(st.nextToken());
		 * // 한 문자를 몇 번 반복할 것인지 반복 횟수 String S = st.nextToken(); // 반복할 문자열 for (int i =
		 * 0; i < S.length(); i++) { char c = S.charAt(i); for (int j = 0; j < R; j++) {
		 * sb.append(c); } } sb.append("\n"); } System.out.println(sb);
		 */

		/* 1157 단어 공부 */
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String S = in.readLine();
		int[] count = new int[122 - 97 + 1]; // 문자열에 각 알파벳이 몇개 있는지 횟수를 저장하는 배열
		for (int i = 0; i < S.length(); i++) { // 문자열에 알파벳이 몇개 있는지 횟수 검사
			// 대문자
			for (int j = 'A'; j <= 'Z'; j++) {
				if ((int) S.charAt(i) == j)
					count[j - 65]++; // 'A'의 아스키코드 값을 빼준다.(인덱스 값을 맞춰주기 위해)
			}
			// 소문자
			for (int j = 'a'; j <= 'z'; j++) {
				if ((int) S.charAt(i) == j)
					count[j - 65 - 32]++; // 'A'와 'a'의 아스키코드 값을 뺴준다. (대문자와 소문자가 같이 체크되기 위해)
			}
		}
		
		int max = 0; // 최대 횟수
		int idx = 0; // 최대 횟수가 저장된 위치
		for (int i = 0; i < count.length; i++) { // 최대 횟수 세기.
			if (count[i] > max) {
				max = count[i];
				idx = i;
			}
		}
		
		// 같은 최대값이 배열에 여러개 있다면 "?" 출력.
		for (int i = idx + 1; i < count.length; i++) { // 처음 최대값이 나온 위치 다음부터 검사.
			if(max == count[i]) {
				System.out.println("?");
				System.exit(0);
			}
		}


		idx += 65; // 아스키 코드
		char res = (char) idx; // 아스키 코드값을 문자로 변환.
		System.out.println(res);
	}
}
