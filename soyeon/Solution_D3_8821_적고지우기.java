package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
 * 남는 개수는 무조건 홀/짝으로 계산하기
 */
public class Solution_D3_8821_적고지우기 {
//	static String str = "4\r\n" + "121\r\n" + "0123456789\r\n" + "555555\r\n" + "2312442535253235256436\r\n" + "\r\n"
//			+ "";
	static int n, count;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		br = new BufferedReader(new StringReader(str));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			count = 0;
			sb.append("#").append(tc).append(" ");

			int[] arr = new int[10];
			String str = br.readLine();
			for (int i = 0; i < str.length(); i++) {
				n = str.charAt(i) - '0';
				arr[n]++;
			}
			for (int i = 0; i < 10; i++) {
				if (arr[i] % 2 == 1) {
					count++;
				}
			}
			sb.append(count).append("\n");
		}
		System.out.println(sb);
	}
}
