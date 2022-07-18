package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.StringTokenizer;

public class Solution_D3_5215_햄버거다이어트 {
	static String str = "1\r\n" + "5 1000\r\n" + "100 200\r\n" + "300 500\r\n" + "250 300\r\n" + "500 1000\r\n"
			+ "400 400";
	static int N, L, ans;
	static int[] grd, kal;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br = new BufferedReader(new StringReader(str));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int TK = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= TK; tc++) {
			sb.append("#").append(tc).append(" ");
			st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());// 재료의 수
			L = Integer.parseInt(st.nextToken());// 제한 칼로리

			grd = new int[N];
			kal = new int[N];

			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				grd[i] = Integer.parseInt(st.nextToken());// 맛에 대한 점수
				kal[i] = Integer.parseInt(st.nextToken());// 칼로리
			}
			combination(0, 0, 0);
			sb.append(ans).append("\n");
		}
		System.out.println(sb);
	}

	public static void combination(int cnt, int sumt, int sumk) {
		if (sumk > L)
			return;

		if (cnt == N) {
			if (sumt > ans) {
				ans = sumt;
			}
			return;
		}

		combination(cnt + 1, sumt + grd[cnt], sumk + kal[cnt]);
		combination(cnt + 1, sumt, sumk);
	}
}
