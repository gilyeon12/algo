package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.StringTokenizer;

public class Solution_D3_4466_최대성적표만들기 {
	static String str = "2\r\n" + "3 1\r\n" + "100 90 80\r\n" + "3 2\r\n" + "100 90 80\r\n" + "";
	static int[] input, numbers;
	static int N, K, MAX, sum;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br = new BufferedReader(new StringReader(str));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			sb.append("#").append(tc).append(" ");

			st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			K = Integer.parseInt(st.nextToken());

			input = new int[N];
			numbers = new int[K];

			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < N; i++) {
				input[i] = Integer.parseInt(st.nextToken());
			}

			MAX = Integer.MIN_VALUE;
			combination(0, 0);
			sb.append(MAX).append("\n");
		}
		System.out.println(sb);
	}

	public static void combination(int cnt, int start) {
		if (cnt == K) {
			sum=0;
			for (int i = 0; i < K; i++) {
				sum += numbers[i];
			}
			if (sum > MAX) {
				MAX = sum;
			}
			return;
		}

		for (int i = start; i < N; i++) {
			numbers[cnt] = input[i];
			combination(cnt + 1, i + 1);
		}
	}
}
