package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.StringTokenizer;

public class Solution_D3_5688_세제곱근을찾아라 {
	static String str = "3\r\n" + "27\r\n" + "7777\r\n" + "64\r\n" + "";

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		br = new BufferedReader(new StringReader(str));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			sb.append("#").append(tc).append(" ");

			long N = Integer.parseInt(br.readLine());

			long i = 1;
			long result = -1;
			while (i * i * i <= N) {
				if (i * i * i == N) {
					result = i;
					break;
				}
				i++;
			}
			sb.append(result).append("\n");
		}
		System.out.println(sb);
	}
}
