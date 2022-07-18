package com.ssafy.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.StringTokenizer;

public class SWEA_D3_3975_승률비교하기 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		in = new BufferedReader(new StringReader(str));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(in.readLine());
		for (int tc = 1; tc <= T; tc++) {
			sb.append("#").append(tc).append(" ");
			StringTokenizer st = new StringTokenizer(in.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			int C = Integer.parseInt(st.nextToken());
			int D = Integer.parseInt(st.nextToken());

			double AliceScore = (double) A / B; // double로 형변환.
			double BobScore = (double) C / D;   // double로 형변환.

			if (AliceScore > BobScore)
				sb.append("ALICE");
			else if (BobScore > AliceScore)
				sb.append("BOB");
			else
				sb.append("DRAW");

			sb.append("\n");
		}
		System.out.println(sb);
	}

	static String str = "3\r\n" + "1 2 2 4\r\n" + "4 5 2 5\r\n" + "1 9 5 6";
}
