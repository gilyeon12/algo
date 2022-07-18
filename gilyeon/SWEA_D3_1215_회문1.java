package com.ssafy.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.Arrays;
import java.util.Iterator;

public class SWEA_D3_1215_회문1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		//in = new BufferedReader(new StringReader(str));
		StringBuilder sb = new StringBuilder();
		for (int tc = 1; tc <= 10; tc++) {
			sb.append("#").append(tc).append(" ");
			int N = Integer.parseInt(in.readLine()); // 회문의 길이.

			// 배열 입력
			char arr[][] = new char[8][8];
			for (int i = 0; i < 8; i++) {
				String temp = in.readLine();
				for (int j = 0; j < 8; j++) {
					arr[i][j] = temp.charAt(j);
				}
			}
			// 원래는 하나의 배열을 상하좌우로 나누어서 탐색하려고 했으나, 너무 복잡해져서 파리퇴치 문제와 비슷하게 풀음.!!
			
			int result = 0;
			// 행 계산 ===================================================================================
			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 8 - N + 1; j++) { // 행에서 나올 수 있는 단어의 개수만큼 연산. 
					char word[] = new char[N]; // 회문을 담을 배열.
					for (int k = 0; k < N; k++) { // 단어 입력.
						word[k] = arr[j + k][i];
					}
					// word배열에 담긴 단어가 회문인지 판별.
					int check = 0;
					for (int k = 0; k < N / 2; k++) {
						if (word[k] != word[N - k - 1]) {
							check = 1;
							break;
						}
					}
					if (check == 0)
						result++;
				}
			}
			// 열 계산 ===================================================================================
			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 8 - N + 1; j++) { // 행에서 나올 수 있는 단어의 개수만큼 연산. 
					char word[] = new char[N]; // 회문을 담을 배열.
					for (int k = 0; k < N; k++) { // 단어 입력.
						word[k] = arr[i][j + k];
					}
					// word배열에 담긴 단어가 회문인지 판별.
					int check = 0;
					for (int k = 0; k < N / 2; k++) {
						if (word[k] != word[N - k - 1]) {
							check = 1;
							break;
						}
					}
					if (check == 0)
						result++;
				}
			}
			sb.append(result).append("\n");
		}
		System.out.println(sb);
	}
}
