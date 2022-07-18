package com.ssafy.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class SWEA_D3_1229_암호문2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		//in = new BufferedReader(new StringReader(str));
		StringBuilder sb = new StringBuilder();
		for (int tc = 1; tc <= 10; tc++) {
			sb.append("#").append(tc).append(" ");
			int N = Integer.parseInt(in.readLine()); // 원본 암호문의 길이
			ArrayList<Integer> arr = new ArrayList<>(); // 원본 암호문 (암호문을 삽입하면 길이가 달라지므로 ArrayList로 생성해야함.)

			StringTokenizer st = new StringTokenizer(in.readLine());
			// 원본 암호문 입력.
			for (int i = 0; i < N; i++) {
				arr.add(Integer.parseInt(st.nextToken()));
			}

			int S = Integer.parseInt(in.readLine()); // 명령어의 개수
			st = new StringTokenizer(in.readLine());
			for (int i = 0; i < S; i++) {
				char C = st.nextToken().charAt(0);
				if (C == 'I') {
					int X = Integer.parseInt(st.nextToken()); // X위치부터
					int Y = Integer.parseInt(st.nextToken()); // Y개의 숫자를 암호문에 삽입.
					for (int j = 0; j < Y; j++) {
						arr.add(X + j, Integer.parseInt(st.nextToken())); // X위치부터 Y개의 숫자가 삽입되므로 인덱스값을 하나씩 증가시켜줘야함.
					}
				} else {
					int X = Integer.parseInt(st.nextToken()); // X위치부터
					int Y = Integer.parseInt(st.nextToken()); // Y개의 숫자를 암호문에 삭제.
					for (int j = 0; j < Y; j++) {
						arr.remove(X); // X위치의 숫자들이 Y번 동안 삭제됨.
					}
				}

			}

			// 암호문 상위 10개 출력.
			for (int i = 0; i < 10; i++) {
				sb.append(arr.get(i)).append(" ");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}
