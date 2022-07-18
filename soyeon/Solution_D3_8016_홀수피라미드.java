package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.StringTokenizer;

public class Solution_D3_8016_홀수피라미드 {
	/*
	 * 수학적 문제는 내 영역이 아님..이런 문제가 나오면 어떡하지?ㅋㅋㅋㅋㅋ
	 * 규칙을 찾아야 하는 문제(계차수열)
	 * 일단 2씩 증가 + N값이 영향을 무조건 주겠지 + 그외 규칙찾기
	 */
	static String str = "3\r\n" + "1\r\n" + "2\r\n" + "3";

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br = new BufferedReader(new StringReader(str));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			sb.append("#").append(tc).append(" ");
			long N = Integer.parseInt(br.readLine());

			long left = 0;
			long right = 0;

			left = 2 * (N - 1) * (N - 1) + 1;
			right = 2 * N * N - 1;
			sb.append(left).append(" ").append(right).append("\n");
		}
		System.out.println(sb);
	}
}
