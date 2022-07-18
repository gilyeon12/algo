package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Solution_D3_6190_정곤이의단조증가하는수 {
	/*
	 * 나는 이런 문제를 꼭 하나의 정수엔 한 자리 정수만 올 수 있다고 생각한다;;
	 */
	static String str = "5\r\n" + "4\r\n" + "2 4 7 10\r\n" + "6\r\n" + "9 9 9 8 8 8\r\n" + "6\r\n" + "2 3 3 3 5 9\r\n"
			+ "5\r\n" + "1 2 3 4 3\r\n" + "3\r\n" + "1 1 1";

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br = new BufferedReader(new StringReader(str));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			sb.append("#").append(tc).append(" ");
			int N = Integer.parseInt(br.readLine());
			int max = 0;
			int flag = 0;

			// 배열에 단조 넣기
			ArrayList<Integer> arr = new int[N];
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < N; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}

			
			for (int i = 0; i < N-1; i++) {
				String str = arr[i] + "";
				for (int j = 0; j < str.length() - 1; j++) {
					int n = str.charAt(j) - '0';
					int m = str.charAt(j + 1) - '0';

					flag = 0;
					if (n > m) {
						flag = 1;
						break;
					}
				}

//						sb.append("-1").append("\n");
				if (flag == 0) {
					ArrayList<Integer> al = new ArrayList<>();
					al=arr[i];
				}
			}
			sb.append(max).append("\n");
		}
		System.out.println(sb);
	}
}
