package com.ssafy.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SWEA_D3_7272_안경이없어 {
	/* 처음엔 COUNT변수를 추가해서 구멍의 개수를 더해서 비교하려 했으나, B라는 문자는 위치까지 정확히 알 수 있기 때문에 단순히 구멍의 개수만 비교할 수 없었음.
	 	따라서 문자열의 각 문자가 어떤 문자인지 판별하는 배열을 추가해서, 그 배열 자체를 비교함. */
		 
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		in = new BufferedReader(new StringReader(str));
		int T = Integer.parseInt(in.readLine());
		StringBuilder sb = new StringBuilder();
		for (int tc = 1; tc <= T; tc++) {
			sb.append("#").append(tc).append(" ");
			StringTokenizer st = new StringTokenizer(in.readLine());
			String word1 = st.nextToken();
			String word2 = st.nextToken();

			int idx1[] = new int[word1.length()]; // word1의 각 문자가 무엇인지를 담을 배열.
			int idx2[] = new int[word2.length()]; // word2의 각 문자가 무엇인지를 담을 배열.

			if (word1.length() != word2.length()) // 문자 길이가 다를 경우, 바로 DIFF 출력.
				sb.append("DIFF").append("\n");
			else { // 문자 길이가 같을 경우,

				for (int i = 0; i < word1.length(); i++) { // word1의 각 문자 탐색.
					if (word1.charAt(i) == 'A' || word1.charAt(i) == 'D' || word1.charAt(i) == 'O'
							|| word1.charAt(i) == 'P' || word1.charAt(i) == 'Q' || word1.charAt(i) == 'R')
						idx1[i] = 1;

					else if (word1.charAt(i) == 'B') {
						idx1[i] = 2;
					} else {
						idx1[i] = 0;
					}
				}

				for (int i = 0; i < word1.length(); i++) { // word2의 각 문자 탐색.
					if (word2.charAt(i) == 'A' || word2.charAt(i) == 'D' || word2.charAt(i) == 'O'
							|| word2.charAt(i) == 'P' || word2.charAt(i) == 'Q' || word2.charAt(i) == 'R')
						idx2[i] = 1;

					else if (word2.charAt(i) == 'B') {
						idx2[i] = 2;
					} else {
						idx2[i] = 0;
					}

				}

				if (Arrays.equals(idx1, idx2)) // 두 배열이 모두 같을 때, SAME 출력.
					sb.append("SAME").append("\n");
				else
					sb.append("DIFF").append("\n");

			}
		}
		System.out.println(sb);
	}

	static String str = "5\r\n" + "ABCD EFGH\r\n" + "ABCD PBZO\r\n" + "PRQO OQAD\r\n" + "ZXCV HJKL\r\n" + "BBBB BBB";
}
