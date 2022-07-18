package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.StringTokenizer;

public class Solution_D3_4047_영준이의카드카운팅 {
	/*
	 * case문에 꼭 break좀..
	 * 겹치는 카드가 중간에 나오면 flag를 하고 break!
	 */

//	static String str = "3\r\n" + "S01D02H03H04\r\n" + "H02H10S11H02\r\n" + "S10D10H10C01\r\n" + "";

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		br = new BufferedReader(new StringReader(str));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int TC = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= TC; tc++) {
			sb.append("#").append(tc).append(" ");

			String str = br.readLine();
			int[][] map = new int[4][13];

			for (int i = 0; i < str.length(); i++) {
				if (i % 3 == 0) {
					char T = str.charAt(i);
					String s = str.substring(i + 1, i + 3);
					int XY = Integer.parseInt(s);

					switch (T) {
					case 'S':
						map[0][XY - 1]++;
						break;
					case 'D':
						map[1][XY - 1]++;
						break;
					case 'H':
						map[2][XY - 1]++;
						break;
					case 'C':
						map[3][XY - 1]++;
						break;
					}
				}
			}

			int[] arr = new int[4];
			int flag = 0;
			int count = 0;

			for (int i = 0; i < 4; i++) {
//				flag = 0;//여기서 할 필요 없지. 1개 테케에서 무조건 flag가 나오면 error니까 
				count = 0;
				for (int j = 0; j < 13; j++) {
					if (map[i][j] == 0) {// 몇 장의 카드가 부족한지 출력
						arr[i]++;
					} else if (map[i][j] > 1) {
						flag = 1;
						break;
					}
				}
			}

			if (flag == 1) {
				sb.append("ERROR");
			} else {
				for (int i = 0; i < 4; i++) {
					sb.append(arr[i]).append(" ");
				}
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}
