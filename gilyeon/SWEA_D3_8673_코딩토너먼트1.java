package com.ssafy.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class SWEA_D3_8673_코딩토너먼트1 {
	/* 반드시 arraylist를 사용해야 하는 것은 아니지만, 다음 라운드로 넘어갈 때를 생각하면 점수가 낮은 사람을 아예 배제하는게 편하기 때문에 
	 * 그부분은 arraylist의 remove를 사용하여 해결했다. 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		in = new BufferedReader(new StringReader(str));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(in.readLine());
		for (int tc = 1; tc <= T; tc++) {
			sb.append("#").append(tc).append(" ");
			int K = Integer.parseInt(in.readLine()); 
			int k_num = (int) Math.pow(2, K); // 2^K를 미리 구해놓음.
			int total = 0;
			ArrayList<Integer> arr = new ArrayList<>(); // 1라운드 경기 점수 (2^K개)
			StringTokenizer st = new StringTokenizer(in.readLine());
			// 배열 입력.
			for (int i = 0; i < k_num; i++) {
				arr.add(Integer.parseInt(st.nextToken()));
			}
			
			// 경기는 총 K라운드로 진행.
			for (int i = 0; i < K; i++) {
				k_num = k_num / 2; // 다음 라운드로 갈수록 경기의 수는 2로 나누어짐.
				for (int j = 1; j <= k_num; j++) { // 1팀부터 시작.
					int diff = arr.get(j - 1) - arr.get(j); // 각 팀의 점수 차이
					total += Math.abs(diff); // 차이만 더해주면 되므로 절댓값을 더해줌.
					
					// 두 팀 중 점수가 높은 팀이 남고, 적은 팀은 아예 배열에서 제거.
					// 따라서 점수가 높은 팀은 첫번째 원소에 그대로 남아있기 때문에 j와 j-1를 비교해야함.
					if (arr.get(j - 1) > arr.get(j)) 
						arr.remove(j);
					else if (arr.get(j - 1) < arr.get(j))
						arr.remove(j - 1);
					else
						arr.remove(j - 1);
				}
			}

			sb.append(total).append("\n");
		}
		System.out.println(sb);
	}

	static String str = "2\r\n" + "2\r\n" + "7 1 4 3\r\n" + "3\r\n" + "31 46 13 29 27 45 10 57";
}
