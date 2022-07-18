package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Solution_D3_5948_새샘이의735게임 {
	/*
	 * 내림차순으로 정렬 Collections.sort(list, Collections.reverseOrder()); 
	 * 중복은 삭제해야하므로 arraylist보다 hashset이용 
	 * hashset은 정렬 안되므로 arralist로 바꿔서 사용
	 * 큰 순서대로 출력해야 하므로 Collections.reverseOrder()사용
	 */
	static String str = "2\r\n" + "1 2 3 4 5 6 7\r\n" + "5 24 99 76 1 77 6";
	static int[] input, numbers;
	static int N, R, sum;
	static HashSet<Integer> set;
	static ArrayList<Integer> list;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br = new BufferedReader(new StringReader(str));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			sb.append("#").append(tc).append(" ");

			N = 7;
			R = 3;
			input = new int[N];
			numbers = new int[R];

			set = new HashSet<>();

			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < N; i++) {
				input[i] = Integer.parseInt(st.nextToken());
			}

			combination(0, 0);
			list = new ArrayList<>(set);
			Collections.sort(list, Collections.reverseOrder());
			sb.append(list.get(4)).append("\n");
		}
		System.out.println(sb);
	}

	public static void combination(int cnt, int start) {
		if (cnt == R) {
			sum = 0;
			for (int i = 0; i < R; i++) {
				sum += numbers[i];
			}
			set.add(sum);
			return;
		}

		for (int i = start; i < N; i++) {
			numbers[cnt] = input[i];
			combination(cnt + 1, i + 1);
		}
	}
}
