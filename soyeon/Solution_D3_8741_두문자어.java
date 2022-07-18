package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.StringTokenizer;

public class Solution_D3_8741_두문자어 {
	/*
	 * 1) '0'은 int로 만드는 까먹지마
	 * 2) 소문자→대문자 (char가 아닌 String에서 toUpperCase() 설정)
	 */

	static String str = "3\r\n" + "knuth morris pratt\r\n" + "recurrent neural network\r\n"
			+ "advanced encryption standard\r\n" + "\r\n" + "";

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br = new BufferedReader(new StringReader(str));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			sb.append("#").append(tc).append(" ");

			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < 3; i++) {
				String str = st.nextToken().toUpperCase();
				char c = str.charAt(0);
				sb.append(c);
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}
