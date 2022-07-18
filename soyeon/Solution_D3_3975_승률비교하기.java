package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.StringTokenizer;

public class Solution_D3_3975_승률비교하기 {
	/*
	 * 자바의 가장 기본적인 문제.. int인지 double인지
	 */
	static String str = "3\r\n" + "1 2 2 4\r\n" + "4 5 2 5\r\n" + "1 9 5 6\r\n" + "";

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		br = new BufferedReader(new StringReader(str));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			sb.append("#").append(tc).append(" ");

			st = new StringTokenizer(br.readLine());
			double A = Integer.parseInt(st.nextToken());
			double B = Integer.parseInt(st.nextToken());
			double C = Integer.parseInt(st.nextToken());
			double D = Integer.parseInt(st.nextToken());

			double aliceScore = A / B;
			double bobScore = C / D;

			if (aliceScore > bobScore) {
				sb.append("ALICE").append("\n");
			} else if (aliceScore < bobScore) {
				sb.append("BOB").append("\n");
			} else {
				sb.append("DRAW").append("\n");
			}
		}
		System.out.println(sb);
	}
}
