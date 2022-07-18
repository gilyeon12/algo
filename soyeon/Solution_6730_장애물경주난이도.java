package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.StringTokenizer;

public class Solution_6730_장애물경주난이도 {
//	static String str = "5\r\n" + "5\r\n" + "10 70 30 50 90\r\n" + "2\r\n" + "30 100\r\n" + "2\r\n" + "100 20\r\n"
//			+ "3\r\n" + "40 40 40\r\n" + "7\r\n" + "12 345 678 901 23 45 6" + "\r\n" + " \r\n" + "";
	static int upmax = Integer.MIN_VALUE;
	static int downmax = Integer.MIN_VALUE;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
//		br = new BufferedReader(new StringReader(str));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());// 테케
		for (int tc = 1; tc <= T; tc++) {
			sb.append("#").append(tc).append(" ");
			upmax = 0;
			downmax = 0;
			int N = Integer.parseInt(br.readLine());// 직사각형 블록의 개수
			st = new StringTokenizer(br.readLine());
			int[] arr = new int[N];
			for (int i = 0; i < N; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			for (int i = 0; i < N - 1; i++) {
				if (arr[i] < arr[i + 1]) {
					int u = arr[i + 1] - arr[i];
					if (u > upmax) {
						upmax = u;
					}
				} else {
					int d = Math.abs((arr[i + 1] - arr[i]));
					if (d > downmax) {
						downmax = d;
					}
				}
			}
			sb.append(upmax).append(" ").append(downmax).append("\n");
		}
		System.out.println(sb);
	}
}
