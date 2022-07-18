package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_D3_3456_직사각형길이찾기 {
/*
*모든 변의 길이가 같을 경우도 생각해야지
*/
//	static String str = "3\r\n" + "1 1 2\r\n" + "4 3 4\r\n" + "5 5 5";

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		br = new BufferedReader(new StringReader(str));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			sb.append("#").append(tc).append(" ");
			int[] arr = new int[100];

			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < 3; i++) {
				int n = Integer.parseInt(st.nextToken());
				arr[n - 1]++;
			}
//			System.out.println(Arrays.toString(arr));
			for (int i = 0; i < 100; i++) {
				if (arr[i] == 1 || arr[i] == 3) {
					sb.append(i + 1).append("\n");
				}
			}
		}
		System.out.println(sb);
	}
}
