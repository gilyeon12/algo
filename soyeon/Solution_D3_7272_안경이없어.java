package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.StringTokenizer;

public class Solution_D3_7272_안경이없어 {
	/*
	 * 글자수가 같다면과 다르다면을 안 나눠서 처음에 테케 0개 맞음
	 * (오답 : 10000개의 테스트케이스 중 8356개가 맞았습니다) 풀이
	 */
	static String str = "6\r\n" + "ABCD EFGH\r\n" + "ABCD PBZO\r\n" + "PRQO OQAD\r\n" + "ZXCV HJKL\r\n" + "BBBB BBB\r\n"
			+ "SFJLWQJF EEEEEDEE";

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br = new BufferedReader(new StringReader(str));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			sb.append("#").append(tc).append(" ");

			st = new StringTokenizer(br.readLine());
			String str1 = st.nextToken();
			String str2 = st.nextToken();

			char[] arr1 = new char[str1.length()];
			char[] arr2 = new char[str2.length()];

			// 문자열 → 문자
			for (int i = 0; i < str1.length(); i++) {
				arr1[i] = str1.charAt(i);
			}
			for (int i = 0; i < str2.length(); i++) {
				arr2[i] = str2.charAt(i);
			}

			int flag = 0;
			for (int i = 0; i < str1.length(); i++) {
				if (str1.length() != str2.length()) {// 글자수가 다르다면 DIFF
					flag = 1;
					break;
				} else {//글자수가 같다면 
					if (arr1[i] == 'A' || arr1[i] == 'D' || arr1[i] == 'O' || arr1[i] == 'P'
							|| arr1[i] == 'Q' | arr1[i] == 'R') {
						if (arr2[i] == 'A' || arr2[i] == 'D' || arr2[i] == 'O' || arr2[i] == 'P' || arr2[i] == 'Q'
								|| arr2[i] == 'R') {
							flag = 0;
						} else {
							flag = 1;
						}
					} else if (arr1[i] == 'B') {
						if (arr2[i] == 'B') {
							flag = 0;
						} else {
							flag = 1;
						}
					} else {
						if (arr2[i] == 'C' || arr2[i] == 'E' || arr2[i] == 'F' || arr2[i] == 'G' || arr2[i] == 'H'
								|| arr2[i] == 'I' || arr2[i] == 'J' || arr2[i] == 'K' || arr2[i] == 'L'
								|| arr2[i] == 'M' || arr2[i] == 'N' || arr2[i] == 'S' || arr2[i] == 'T'
								|| arr2[i] == 'U' || arr2[i] == 'V' || arr2[i] == 'W' || arr2[i] == 'X'
								|| arr2[i] == 'Y' || arr2[i] == 'Z') {
							flag = 0;
						} else {
							flag = 1;
						}
					}
				}
			}
			if (flag == 1) {
				sb.append("DIFF").append("\n");
			} else {
				sb.append("SAME").append("\n");
			}
		}
		System.out.println(sb);
	}
}
