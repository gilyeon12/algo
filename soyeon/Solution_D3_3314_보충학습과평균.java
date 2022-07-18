package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.StringTokenizer;

/*
 * sum과 avg 초기화 왜 안 하는거야...정신차려
 * 줄바꿈 해주기..("\n")
 * 40점 이하가 아니라 미만
 */
public class Solution_D3_3314_보충학습과평균 {
	static String str = "2\r\n" + "10 65 100 30 95\r\n" + "30 35 40 30 25";
	static int sum, avg;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		br = new BufferedReader(new StringReader(str));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			sb.append("#").append(tc).append(" ");

			sum = 0;
			avg = 0;
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < 5; i++) {
				int n = Integer.parseInt(st.nextToken());
				if (n < 40) {
					n = 40;
				}
				sum += n;
			}
			avg = sum / 5;
			sb.append(avg).append("\n");
		}
		System.out.println(sb);
	}
}
