package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.StringTokenizer;

public class Solution_D3_5431_민석이의과제체크하기 {
//	static String str = "2\r\n" + "5 3\r\n" + "2 5 3\r\n" + "7 2\r\n" + "4 6";

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		br = new BufferedReader(new StringReader(str));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			sb.append("#").append(tc).append(" ");
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());// 수강생의 수
			int K = Integer.parseInt(st.nextToken());// 과제를 제출한 사람의 수
			int[] arr = new int[N];
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < K; i++) {
				int n = Integer.parseInt(st.nextToken());
				arr[n - 1]++;
			}
			for (int i = 0; i < N; i++) {
				if (arr[i] == 0) {
					sb.append(i + 1).append(" ");
				}
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}
