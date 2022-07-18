package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.StringTokenizer;

public class Solution_D3_5549_홀수일까짝수일까 {
	/*
	 * 10^60이기 때문에 Long으로 받아도 런타임 에러가 발생한다. 
	 * charAt에서 index처리 잘하기
	 */

	static String str = "5\r\n" + "1\r\n" + "10\r\n" + "100\r\n" + "185787124368712386825387273871\r\n"
			+ "82518881239123819238912929292";

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br = new BufferedReader(new StringReader(str));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			sb.append("#").append(tc).append(" ");
			String str = br.readLine();
			int n = str.charAt(str.length() - 1) - '0';
			if (n % 2 == 1) {
				sb.append("Odd").append("\n");
			} else {
				sb.append("Even").append("\n");
			}
		}
		System.out.println(sb);
	}
}
