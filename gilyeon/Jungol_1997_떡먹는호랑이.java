package com.ssafy.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Jungol_1997_떡먹는호랑이 {
	/* 첫째 날 준 떡을 1부터 시작해 하나씩 늘려서 맞는 조합을 찾는 완전 탐색 문제. 그러나 날짜가 30밖에 되지 않기 때문에 계산량이 많지는 않다!
	 * 처음에는 규칙을 찾으려고 했으나 잘 되지 않아 결국 완전 탐색으로 풀 수 밖에 없었다. 
	 */
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());
		int D = Integer.parseInt(st.nextToken()); // 할머니가 넘어온 날
		int K = Integer.parseInt(st.nextToken()); // 그 날 호랑이에게 준 떡의 개수

		int[] day = new int[30]; // 날짜 별로 떡의 개수를 저장해놓은 배열

		for (int i = 1; i < K; i++) {
			day[1] = i; // 첫쨰 날의 떡의 개수
			for (int j = i + 1; j < K; j++) {
				day[2] = j; // 둘째 날의 떡의 개수
				for (int t = 3; t <= D; t++) { // 셋째 날부터 할머니가 넘어온 날까지 떡의 개수 계산.
					day[t] = day[t - 2] + day[t - 1];
				}
				if (day[D] == K) { // 입력한 떡의 조합이 맞다면,
					System.out.println(day[1] + "\n" + day[2]);
					System.exit(0); // 프로그램 종료.
				}
			}
		}
	}

}
