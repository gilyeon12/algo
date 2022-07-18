package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_D3_4466_최대성적표만들기2 {
	static String str = "2\r\n" + "3 1\r\n" + "100 90 80\r\n" + "3 2\r\n" + "100 90 80\r\n" + "";

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br = new BufferedReader(new StringReader(str));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			sb.append("#").append(tc).append(" ");

			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());

			int[] arr = new int[N];
			int MAX = Integer.MIN_VALUE;
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < N; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			Arrays.sort(arr);
			int sum = 0;
			for (int i = arr.length - 1; i > arr.length - 1 - K; i--) {
				sum += arr[i];
			}
			sb.append(sum).append("\n");
		}
		System.out.println(sb);
	}
}
