package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.StringTokenizer;

public class Solution_D3_5356_의석이의세로로말해요 {
	/*
	 * 공백을 넣고 싶지 않을 때: 길이가 정해져 있지 않는 경우는 문자열의 길이만큼을 크기로 설정한다:str.length() 
	 * 문자 배열의 공백 제거: 배열의 값이 0이 아닐 경우만 출력★★★★
	 */
	static String str = "2\r\n" + "ABCDE\r\n" + "abcde\r\n" + "01234\r\n" + "FGHIJ\r\n" + "fghij\r\n" + "AABCDD\r\n"
			+ "afzz\r\n" + "09121\r\n" + "a8EWg6\r\n" + "P5h3kx";

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		br = new BufferedReader(new StringReader(str));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			sb.append("#").append(tc).append(" ");

			char[][] map = new char[5][15];

			for (int i = 0; i < 5; i++) {
				String str = br.readLine();
				for (int j = 0; j < str.length(); j++) {
					map[i][j] = str.charAt(j);
				}
			}

			for (int i = 0; i < 15; i++) {
				for (int j = 0; j < 5; j++) {
					if (map[j][i] != 0)
						sb.append(map[j][i]);
				}
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}
