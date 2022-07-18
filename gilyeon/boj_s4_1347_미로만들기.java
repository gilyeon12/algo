package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;

public class boj_s4_1347_미로만들기 {
	/*
	 초기 좌표 50,50으로 설정하고 좌표상에서 움직인곳은 모두 1로 처리
	 움직일때마다 x의 최소 최대좌표, y의 최소 최대좌표를 구한다. 
	 -> 나중에 for문으로 최소 최대를 범위로 잡고 배열 돌면서 
	 1로 표시된 곳은 "."을 출력, 아닌곳은 "#"을 출력한다. 
	 */

	private static String str = "5\r\n" + "RRFRF";

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		in = new BufferedReader(new StringReader(str));
		int N = Integer.parseInt(in.readLine());
		String action = in.readLine();
		int map[][] = new int[100][100];
		// 하 좌 상 우
		int[] dx = { 1, 0, -1, 0 };
		int[] dy = { 0, -1, 0, 1 };

		int minx = 50;
		int miny = 50;
		int maxx = 50;
		int maxy = 50;

		// 처음 위치를 (50,50)으로 설정.
		int x = 50;
		int y = 50;
		// 처음에 아래를 보고있음.
		int dir = 0;

		// 현재 위치는 1로 지정.
		map[x][y] = 1;

		for (int i = 0; i < N; i++) {
			char a = action.charAt(i);

			if (a == 'R') {
				// 방향 전환 (우)
				dir = (dir + 1) % 4;
			} else if (a == 'L') {
				// 방향 전환 (좌)
				dir--;
				if (dir < 0)
					dir += 4;
			} else if (a == 'F') {
				// 가고자 하는 방향으로 이동
				x += dx[dir];
				y += dy[dir];
				map[x][y] = 1;
				
				minx = Math.min(minx, x);
				miny = Math.min(miny, y);
				maxx = Math.max(maxx, x);
				maxy = Math.max(maxy, y);
			}
		}
		// 배열 출력
		for (int i = minx; i <= maxx; i++) {
			for (int j = miny; j <= maxy; j++) {
				if (map[i][j] == 1) {
					System.out.print(".");
				} else {
					System.out.print("#");
				}
			}
			System.out.println();
		}
	}

}
