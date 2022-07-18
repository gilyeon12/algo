package com.ssafy.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class SWEA_D3_1208_Flatten {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		//in = new BufferedReader(new StringReader(str));
		StringBuilder sb = new StringBuilder();
		int [] box = new int[100]; // 상자 배열 생성.
		
		// 10개의 테스트케이스.
		for (int tc = 1; tc <= 10; tc++) {
			sb.append("#").append(tc).append(" ");
			int dump = Integer.parseInt(in.readLine()); // 덤프 횟수.
			StringTokenizer st = new StringTokenizer(in.readLine());
			// 상자 배열 값 입력.
			for (int i = 0; i < box.length; i++) {
				box[i] = Integer.parseInt(st.nextToken());
			}
			// 덤프 횟수만큼 제일 높이가 큰 상자에서 작은 상자로 박스 옮기기.
			for (int i = 0; i < dump; i++) {
				Arrays.sort(box); // 먼저 배열 정렬.
				box[99] -= 1; // 최고점의 높이 -1.
				box[0] += 1; // 최저점의 높이 +1.
			}
			
			Arrays.sort(box); // 마지막으로 한번 더 정렬.
			
			int result = box[99] - box[0]; // 최고점 - 최저점.
			sb.append(result);
			sb.append("\n");

		}
		System.out.println(sb);
	}
}
