package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.StringTokenizer;

public class Solution_D3_3408_세가지합구하기 {
	/*
	 * 히든 테케에 int보다 큰 값이 있어서 long (자연수 N(1 ≤ N ≤ 109)인걸 보니 int가 아니라 long이다)
	 * 시간 초과가 난다면 반복문X → 뭔가 규칙이 있는것임(찾아 좀;)
	 */
	static String str = "3\r\n" + "1\r\n" + "10\r\n" + "1001";

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		br = new BufferedReader(new StringReader(str));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			sb.append("#").append(tc).append(" ");

			long N = Long.parseLong(br.readLine());

			long S1 = 0, S2 = 0, S3 = 0;
			S2 = N * N;
			S3 = S2 + N;
			S1 = S3 / 2;
			sb.append(S1).append(" ").append(S2).append(" ").append(S3).append("\n");
		}
		System.out.println(sb);
	}
}
