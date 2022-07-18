package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_D3_7728_다양성측정 {
	static String str = "2\r\n" + "1512\r\n" + "20170310";
	static int count;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br = new BufferedReader(new StringReader(str));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;


		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			count=0;
			sb.append("#").append(tc).append(" ");
			String str = br.readLine();
			int[] arr = new int[10];
			for (int j = 0; j < str.length(); j++) {
				int n = str.charAt(j) - '0';
				arr[n]++;
			}
			System.out.println(Arrays.toString(arr));
			for (int i = 0; i < 10; i++) {
				if (arr[i] >= 1) {
					count++;
				}
			}
			sb.append(count).append("\n");
		}
		System.out.println(sb);
	}
}
