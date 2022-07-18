package com.ssafy.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.StringTokenizer;

public class SWEA_D3_1873_상호의배틀필드 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		in = new BufferedReader(new StringReader(str));
		int T = Integer.parseInt(in.readLine());
		StringBuilder sb = new StringBuilder();
		for (int tc = 1; tc <= T; tc++) {
			sb.append("#").append(tc).append(" ");
			StringTokenizer st = new StringTokenizer(in.readLine());
			int H = Integer.parseInt(st.nextToken()); // 열의 수.
			int W = Integer.parseInt(st.nextToken()); // 행의 수.
			char[][] map = new char[H][W]; // 게임 맵 배열.

			int x = 0; // 전차의 위치(행).
			int y = 0; // 전차의 위치(열).
			int dir = 0; // 전차의 방향. 1:위, 2:아래, 3:좌, 4:우

			// 맵 입력.
			for (int i = 0; i < H; i++) {
				String temp = in.readLine();
				for (int j = 0; j < W; j++) {
					map[i][j] = temp.charAt(j);
					// 테케에서 전차의 위치와 방향 저장.
					if (map[i][j] == '^' || map[i][j] == 'v' || map[i][j] == '<' || map[i][j] == '>') {
						x = i;
						y = j;
					}
					switch (map[i][j]) {
					case '^':
						dir = 1;
						break;
					case 'v':
						dir = 2;
						break;
					case '<':
						dir = 3;
						break;
					case '>':
						dir = 4;
						break;

					}
				}
			}

			int N = Integer.parseInt(in.readLine()); // 전차의 행동 수.
			String tmp = in.readLine();
			for (int i = 0; i < N; i++) {
				int idx = 0;
				char move = tmp.charAt(i); // 전차의 행동.
				switch (move) {
				case 'U': // Up : 전차가 바라보는 방향을 위쪽으로 바꾸고, 한 칸 위의 칸이 평지라면 위 그 칸으로 이동한다.
					dir = 1;
					map[x][y] = '^';
					if (x > 0 && map[x - 1][y] == '.') {
						map[x - 1][y] = map[x][y]; // 지도 상에서 전차 위치 이동.
						map[x][y] = '.'; // 전에 전차가 있던 곳을 평지로 바꾼다.
						x--; // 전차의 위치를 바꾼다.
					}
					break;
				case 'D': // Down : 전차가 바라보는 방향을 아래쪽으로 바꾸고, 한 칸 아래의 칸이 평지라면 그 칸으로 이동한다.
					dir = 2;
					map[x][y] = 'v';
					if (x < H - 1 && map[x + 1][y] == '.') {
						map[x + 1][y] = map[x][y];
						map[x][y] = '.';
						x++;
					}
					break;
				case 'L': // Left : 전차가 바라보는 방향을 왼쪽으로 바꾸고, 한 칸 왼쪽의 칸이 평지라면 그 칸으로 이동한다.
					dir = 3;
					map[x][y] = '<';
					if (y > 0 && map[x][y - 1] == '.') {
						map[x][y - 1] = map[x][y];
						map[x][y] = '.';
						y--;
					}
					break;
				case 'R': // Right : 전차가 바라보는 방향을 오른쪽으로 바꾸고, 한 칸 오른쪽의 칸이 평지라면 그 칸으로 이동한다.
					dir = 4;
					map[x][y] = '>';
					if (y < W - 1 && map[x][y + 1] == '.') {
						map[x][y + 1] = map[x][y];
						map[x][y] = '.';
						y++;
					}
					break;
				case 'S': // Shoot : 전차가 현재 바라보고 있는 방향으로 포탄을 발사한다.
					switch (dir) {
					case 1: // 위
						idx = x; // 포탄 위치.
						while (true) {
							if (idx - 1 < 0 || map[idx - 1][y] == '#') // 전차 위가 막혀있거나 강철이면 break.
								break;
							if (map[idx - 1][y] == '*') { // 전차 위가 벽돌이면,
								map[idx - 1][y] = '.'; // 평지로 바꿈.
								break;
							}
							idx--; // 포탄 위치 이동.
						}
						break;
					case 2: // 아래
						idx = x;
						while (true) {
							if (idx + 1 >= H || map[idx + 1][y] == '#')
								break;
							if (map[idx + 1][y] == '*') {
								map[idx + 1][y] = '.';
								break;
							}
							idx++;
						}
						break;
					case 3: // 좌
						idx = y;
						while (true) {
							if (idx - 1 < 0 || map[x][idx - 1] == '#')
								break;
							if (map[x][idx - 1] == '*') {
								map[x][idx - 1] = '.';
								break;
							}
							idx--;
						}
						break;
					case 4: // 우
						idx = y;
						while (true) {
							if (idx + 1 >= W || map[x][idx + 1] == '#')
								break;
							if (map[x][idx + 1] == '*') {
								map[x][idx + 1] = '.';
								break;
							}
							idx++;
						}
						break;
					}
					break;
				}
			}

			// 맵 출력.
			for (int i = 0; i < H; i++) {
				for (int j = 0; j < W; j++) {
					sb.append(map[i][j]);
				}
				sb.append("\n");
			}
		}
		System.out.println(sb);
	}

	static String str = "1\r\n" + "3 7\r\n" + "***....\r\n" + "*-..#**\r\n" + "#<.****\r\n" + "23\r\n"
			+ "SURSSSSUSLSRSSSURRDSRDS";
}
