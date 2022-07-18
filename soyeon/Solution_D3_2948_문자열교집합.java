package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Solution_D3_2948_문자열교집합 {
	/*
	 * 처음에 단순 for문으로 했다가 시간초과
	 * hashset을 이용한 중복제거
	 */
	static String str = "2\r\n" + "2 3\r\n" + "ab a\r\n" + "a ac ba\r\n" + "3 3\r\n" + "aa bb cc\r\n" + "dd cc aa\r\n"
			+ "";

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		br = new BufferedReader(new StringReader(str));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			sb.append("#").append(tc).append(" ");
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());// 원소의 갯수1
			int M = Integer.parseInt(st.nextToken());// 원소의 갯수2

			HashSet<String> hs = new HashSet<>();
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < N; i++) {
				hs.add(st.nextToken());
			}

			int count = 0;
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < M; i++) {
				String temp = st.nextToken();
				if (hs.contains(temp)) {
					count++;
				}
			}
			sb.append(count).append("\n");
		}
		System.out.println(sb);
	}
}
