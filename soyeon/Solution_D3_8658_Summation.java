package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_D3_8658_Summation {

	static String str = "2\r\n" + "182 371 29 49 28 21 928 11 5 1\r\n" + "13 400 3010 2011 1111 40 4 103 301 100111\r\n"
			+ "";
	static int sum;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br = new BufferedReader(new StringReader(str));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			sb.append("#").append(tc).append(" ");

			int[] arr = new int[10];
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < 10; i++) {
				String str = st.nextToken();
				sum = 0;
				for (int j = 0; j < str.length(); j++) {
					int n = str.charAt(j) - '0';
					sum += n;
				}
				arr[i] = sum;

			}
			Arrays.sort(arr);
			sb.append(arr[9]).append(" ").append(arr[0]).append("\n");
		}
		System.out.println(sb);
	}
}
