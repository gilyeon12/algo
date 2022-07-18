package com.ssafy.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;

public class SWEA_D3_2806_NQueen {
	/* 백트래킹을 활용한 기본적인 문제 
	 * 백트래킹 : 모든 조합을 시도해서 문제의 해를 찾는다. 다만 어떤 노드의 유망성을 점검한 후에 유망하지 않다면 그 노드의 부모로 돌아가기 때문에, 불필요한 경로를 조기에 차단할 수 있다.
	 * 태희쌤 강의를 참고*/

	static int N;
	static int[] col; // n번째 퀸은 무조건 n행에 놓으므로 행의 위치까지 아는 것은 필요없음. 따라서 1차원 배열을 생성해서 열의 위치만 저장. ex) col[2] : 두번쨰 퀸의 열.
	static int ans;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		// in = new BufferedReader(new StringReader(str));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(in.readLine());
		for (int tc = 1; tc <= T; tc++) {
			sb.append("#").append(tc).append(" ");
			N = Integer.parseInt(in.readLine());
			col = new int[N + 1]; // 1열부터 시작.
			ans = 0;
			setQueen(1); // 1행부터 두기.

			sb.append(ans).append("\n");
		}
		System.out.println(sb);
	}

	public static void setQueen(int rowNo) { // rowNo : 퀸을 두어야하는 현재 행
		/*
		 * if (!isAvailable(rowNo - 1)) // 직전까지의 상황이 유망하지 않다면 return. 
		 * 		return; 
		 */
		
		// 기본파트 : 퀸을 모두 놓았다면,
		if (rowNo > N) { // 현재 행이 N보다 크다면 주어진 퀸을 모두 놓았다는 것과 같음.
			ans++; // 결과값 더해주기.
			return;
		}

		// 1열부터 n열까지 퀸을 놓는 시도
		for (int i = 1; i <= N; i++) {
			col[rowNo] = i;
			if (isAvailable(rowNo)) // 현재 상황이 유망하다면,
				setQueen(rowNo + 1); // 다음 행에 퀸 놓기.
		}
	}

	public static boolean isAvailable(int rowNo) { // rowNo : 놓아진 마지막 퀸

		for (int i = 1; i < rowNo; i++) { // 지금까지 놓아진 퀸의 수만큼 체크.
			if (col[rowNo] == col[i] || rowNo - i == Math.abs(col[rowNo] - col[i])) 
				// 퀸이 같은 열에 놓아졌거나, 대각선 산에 있다면 ((행-열)의 차이가 같으면 대각선 상에 위치) false.
				return false;
		}
		return true; // false 되지않고 넘어갔다면 true.
	}
}
