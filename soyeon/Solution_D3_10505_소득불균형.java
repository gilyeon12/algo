package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.StringTokenizer;

public class Solution_D3_10505_소득불균형 {
	static String str = "3\r\n" + "7\r\n" + "15 15 15 15 15 15 15\r\n" + "10\r\n" + "1 1 1 1 1 1 1 1 1 100\r\n"
			+ "7\r\n" + "2 7 1 8 2 8 4";
	static int[] map;
	static int sum, avg, count;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br = new BufferedReader(new StringReader(str));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			sum = 0;
			avg = 0;
			count = 0;
			sb.append("#").append(tc).append(" ");
			int N = Integer.parseInt(br.readLine());// 정수의 개수 N
			map = new int[N];
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < N; i++) {
				map[i] = Integer.parseInt(st.nextToken());
				sum += map[i];
			}
			avg = sum / N;
			for (int i = 0; i < N; i++) {
				if (map[i] <= avg) {
					count++;
				}
			}
			sb.append(count).append("\n");
		}
		System.out.println(sb);
	}
}
