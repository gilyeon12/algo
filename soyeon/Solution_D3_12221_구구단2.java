package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.StringTokenizer;

public class Solution_D3_12221_구구단2 {
	static String str = "4\r\n" + "2 5\r\n" + "5 10\r\n" + "10 10\r\n" + "9 9";

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br = new BufferedReader(new StringReader(str));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			sb.append("#").append(tc).append(" ");

			st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());

			if (A >= 1 && A <= 9 && B >= 1 && B <= 9) {
				sb.append(A * B).append("\n");
			} else {
				sb.append("-1").append("\n");
			}
		}
		System.out.println(sb);
	}
}
