package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.StringTokenizer;

public class Solution_D3_9317_석찬이의받아쓰기 {

	static String str = "2\r\n" + "16\r\n" + "MyNameIsSeokChan\r\n" + "mynameisseokchan\r\n" + "15\r\n"
			+ "SamsungSoftware\r\n" + "MembershipZzang\r\n" + "";
	static int count;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br = new BufferedReader(new StringReader(str));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			sb.append("#").append(tc).append(" ");

			int N = Integer.parseInt(br.readLine());
			char[] arr = new char[N];
			String str = br.readLine();
			for (int i = 0; i < N; i++) {
				char c = str.charAt(i);
				arr[i] = c;
			}
			String sukStr = br.readLine();
			char[] sukArr = new char[N];
			for (int i = 0; i < N; i++) {
				char c = sukStr.charAt(i);
				sukArr[i] = c;
			}

			count = 0;
			for (int i = 0; i < N; i++) {
				if (arr[i] == sukArr[i]) {
					count++;
				}
			}
			sb.append(count).append("\n");
		}
		System.out.println(sb);
	}
}
