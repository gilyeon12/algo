package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.StringTokenizer;

public class boj_S5_7568_덩치 {
	private static String str = "5\r\n" + "55 185\r\n" + "58 183\r\n" + "88 186\r\n" + "60 175\r\n" + "46 155";

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		in = new BufferedReader(new StringReader(str));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(in.readLine());

		int map[][] = new int[N][2];

		// 배열 입력
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(in.readLine());
			map[i][0] = Integer.parseInt(st.nextToken());
			map[i][1] = Integer.parseInt(st.nextToken());
		}

		for (int i = 0; i < N; i++) {
			int rank = 1;
			for (int j = 0; j < N; j++) {
				// 자기 자신은 건너뛰기.
				if (i == j)
					continue;

				// 자신 보다 키, 몸무게가 큰 사람이 있다면, 그 사람 수대로 등수 더해서 출력.
				if (map[i][0] < map[j][0] && map[i][1] < map[j][1]) {
					rank++;
				}
			}
			sb.append(rank).append(" ");
		}
		System.out.println(sb);
	}
}
