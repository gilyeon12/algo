package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.StringTokenizer;

public class Solution_D3_3750_Digitsum { 
	static String str = "3\r\n" + "5\r\n" + "108\r\n" + "588432";
	static String nStr;
	static int fn;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		br = new BufferedReader(new StringReader(str));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			sb.append("#").append(tc).append(" ");

			int n = Integer.parseInt(br.readLine());// 주어진 자연수
			nStr = n + "";// 자연수를 문자열로

			while (nStr.length() > 1) {
				int[] arr = new int[nStr.length()];// 길이만큼 배열 생성
				fn = 0;// 배열의 각 자리를 더한 값

				for (int i = 0; i < nStr.length(); i++) {
					arr[i] = nStr.charAt(i) - '0';
					fn += arr[i];
				}

				n = fn;
				nStr = n + "";
			}
			sb.append(n).append("\n");
		}
		System.out.println(sb);
	}
}
