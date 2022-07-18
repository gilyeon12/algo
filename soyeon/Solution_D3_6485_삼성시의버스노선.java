package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.StringTokenizer;

public class Solution_D3_6485_삼성시의버스노선 {
	static String str = "1\r\n" + "2\r\n" + "1 3\r\n" + "2 5\r\n" + "5\r\n" + "1\r\n" + "2\r\n" + "3\r\n" + "4\r\n"
			+ "5";

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		br = new BufferedReader(new StringReader(str));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());// 테케
		for (int tc = 1; tc <= T; tc++) {
			sb.append("#").append(tc).append(" ");

			int N = Integer.parseInt(br.readLine());// 하나의 정수 N
			int[] arr = new int[5000];// Cj ( 1 ≤ Cj ≤ 5,000) 다른방법 없을까? 메모리 너무 차지..
			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				int A = Integer.parseInt(st.nextToken());
				int B = Integer.parseInt(st.nextToken());
				for (int j = A; j <= B; j++) {
					arr[j - 1]++;
				}
			}
			int P = Integer.parseInt(br.readLine());
			for (int i = 0; i < P; i++) {
				int p = Integer.parseInt(br.readLine());
				sb.append(arr[p - 1]).append(" ");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}
