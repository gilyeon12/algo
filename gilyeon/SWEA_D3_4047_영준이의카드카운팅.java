package com.ssafy.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;

public class SWEA_D3_4047_영준이의카드카운팅 {
	/* 유의할 점 : (1) substring을 이용해서 카드의 숫자를 문자열 -> 숫자로 변환하기.
	 * 		   (2) 카드의 숫자를 카운팅할 때, flag값을 두어서 하나라도 겹치는 카드가 있으면, 무조건 ERROR 출력하기.
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		in = new BufferedReader(new StringReader(str));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(in.readLine());
		for (int tc = 1; tc <= T; tc++) {
			sb.append("#").append(tc).append(" ");
			String S = in.readLine(); // 카드에 대한 정보
			int[][] card = new int[4][13]; // 영준이가 가진 카드 덱.

			for (int i = 0; i < S.length(); i++) {
				if (i % 3 == 0) {
					char T1 = S.charAt(i); // 카드의 무늬
					String str = S.substring(i + 1, i + 3); // 카드의 숫자
					int XY = Integer.parseInt(str); // 카드의 숫자 변환.

					switch (T1) { // 카드 무늬별로 카드 카운팅.
					case 'S':
						card[0][XY - 1]++;
						break;
					case 'D':
						card[1][XY - 1]++;
						break;
					case 'H':
						card[2][XY - 1]++;
						break;
					case 'C':
						card[3][XY - 1]++;
						break;
					}
				}
			}
			
			int count[] = new int[4]; // 카드 무늬마다 가지고 있는 카드 카운팅.
			int flag = 0;
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 13; j++) {
					if (card[i][j] == 1) // 카드를 가지고 있다면,
						count[i]++; // 카드 카운팅.
					else if (card[i][j] > 1) { // 겹치는 카드가 있다면,
						flag = 1; // flag 상태 변환.
						break;
					}
				}
			}
			if (flag == 1) // 겹치는 카드가 있다면,
				sb.append("ERROR"); // 에러 출력.
			else // 겹치는 카드가 없다면,
				for (int i = 0; i < count.length; i++) { 
					sb.append(13 - count[i]).append(" "); // 부족한 카드의 수 출력.
				}

			sb.append("\n");
		}
		System.out.println(sb);
	}

	static String str = "3\r\n" + "S01D02H03H04\r\n" + "H02H10S11H02\r\n" + "S10D10H10C01";
}
