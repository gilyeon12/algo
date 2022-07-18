package com.ssafy.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;

public class SWEA_D3_9997_미니멀리즘시계 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		//in = new BufferedReader(new StringReader(str));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(in.readLine());
		for (int tc = 1; tc <= T; tc++) {
			sb.append("#").append(tc).append(" ");
			int angle = Integer.parseInt(in.readLine());
			int time = angle * 2;
			int h = time / 60;
			time -= (60 * h);
			sb.append(h).append(" ").append(time).append("\n");
			
			
//			테케 1000개 중 999개 맞음, 왜 틀렸는지 모르겠음			
/*			int h = (angle * 2) / 60;
			// angle = 360일 때,
			if (h == 12) {
				h = 0;
			}
			int m = (angle * 2) % 60;
*/
		}
		System.out.println(sb);
	}
}
