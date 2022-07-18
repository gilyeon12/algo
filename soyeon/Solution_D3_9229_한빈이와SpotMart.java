package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.StringTokenizer;

public class Solution_D3_9229_한빈이와SpotMart {
	/*
	 * i를 start로 해버림.. 근데 start로 해도 정답으로 나온 이유도 몰라서 그게 열받음;
	 */
	static String str = "5\r\n" + "3 45\r\n" + "20 20 20\r\n" + "6 10\r\n" + "1 2 5 8 9 11\r\n" + "4 100\r\n"
			+ "80 80 60 60\r\n" + "4 20\r\n" + "10 5 10 16\r\n" + "4 25\r\n" + "4 21 4 1";
	static int[] input, numbers;
	static int N, M;
	static int max, sum;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		br = new BufferedReader(new StringReader(str));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());// 테케
		for (int tc = 1; tc <= T; tc++) {
			sb.append("#").append(tc).append(" ");

			st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());// 과자 봉지의 개수
			M = Integer.parseInt(st.nextToken());// 과자 봉지 무게 합 제한

			// 과자의 무게를 배열안에 넣기
			input = new int[N];
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < N; i++) {
				input[i] = Integer.parseInt(st.nextToken());
			}

			numbers = new int[2];// 선택될 과자의 배열
			max = -1;// 어차피 모든 수를 돌고도 초과한다면 -1이니까 애초에 -1로 설정

			// 과자 2개를 골라 최대의 무게의 합 구하기
			pick(0, 0);
			sb.append(max).append("\n");
		}
		System.out.println(sb);
	}

	public static void pick(int cnt, int start) {
		if (cnt == 2) {
			sum = 0;
			for (int i = 0; i < 2; i++) {
				sum += numbers[i];
			}
			if (sum > M)
				return;
			else {
				if (sum > max) {
					max = sum;
				}
				return;
			}
		}
		for (int i = start; i < N; i++) {
			numbers[cnt] = input[i];
			pick(cnt + 1, i + 1);
		}
	}
}
