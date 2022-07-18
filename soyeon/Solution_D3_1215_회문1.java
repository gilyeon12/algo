package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
 * N이 홀수 vs 짝수냐 고민 -> 생각해보니 홀수는 어차피 자기 자신과 같아서 비교할 필요가 없었다 N/2 하면 됨
 * map에서 map처럼 탐색하면 for 문을 행과 열로 반복문 2개를 만드는데 가로 세로로 나눠서 로직 작성하다 보니 for문을 2개 만들 필요 없다
 * break는 반복문 자체를 나가버림(for문 안에 if문 안에 break가 있으면  for문자체를 나가버림)
 * 탐색:map 반복->주어진 길이 반복->대칭반복(3번)
 * 가로 세로 반복은 행/열만 바꿔주면 됨
 */
public class Solution_D3_1215_회문1 {
//	static String str = "4\r\n" + "CBBCBAAB\r\n" + "CCCBABCB\r\n" + "CAAAACAB\r\n" + "BACCCCAC\r\n" + "AABCBBAC\r\n"
//			+ "ACAACABC\r\n" + "BCCBAABC\r\n" + "ABBBCCAA\r\n" + "4\r\n" + "BCBBCACA\r\n" + "BCAAACAC\r\n"
//			+ "ABACBCCB\r\n" + "AACBCBCA\r\n" + "ACACBAAA\r\n" + "ACCACCCB\r\n" + "AACAAABA\r\n" + "CACCABCB\r\n"
//			+ "3\r\n" + "BABBBACB\r\n" + "ABCAACCB\r\n" + "CCACBCBA\r\n" + "CACACBCA\r\n" + "CCABACCB\r\n"
//			+ "CCBAAAAA\r\n" + "BBACBACA\r\n" + "CBCCBABC\r\n" + "4\r\n" + "ACBBCCCA\r\n" + "CCBCBACB\r\n"
//			+ "ACBCABAA\r\n" + "BABCCAAA\r\n" + "ACCCCCBB\r\n" + "AABBCCBC\r\n" + "CCABBACA\r\n" + "CAACBCCC\r\n"
//			+ "7\r\n" + "AAACACAB\r\n" + "CCABCCCC\r\n" + "CABCAAAA\r\n" + "BBBCBBBA\r\n" + "ABCCACCC\r\n"
//			+ "ABACBCBB\r\n" + "CBABACAB\r\n" + "BBBBBABB\r\n" + "3\r\n" + "ABCBCBCA\r\n" + "ABCBCCCB\r\n"
//			+ "ABACCCCA\r\n" + "BBABBBAC\r\n" + "BBACBCCC\r\n" + "AAACACCA\r\n" + "BABCCCBC\r\n" + "ACCBCBCA\r\n"
//			+ "7\r\n" + "CACBCCBA\r\n" + "CBCCBCCA\r\n" + "CCBCBCAB\r\n" + "BBCCABAA\r\n" + "CACCBCCC\r\n"
//			+ "BCCACCBB\r\n" + "CBCCCBBC\r\n" + "CBACBCBC\r\n" + "5\r\n" + "BCBABCBA\r\n" + "CBBABABC\r\n"
//			+ "BCACBAAA\r\n" + "BBABACAB\r\n" + "BCBCCBAC\r\n" + "CBBCBBBB\r\n" + "CBBAACAB\r\n" + "ACCBCBCC\r\n"
//			+ "3\r\n" + "BBBBCCAA\r\n" + "BCBBCACC\r\n" + "BBCAAAAB\r\n" + "ABABBABB\r\n" + "BACAAABA\r\n"
//			+ "ABACCBCA\r\n" + "ACCAABCB\r\n" + "BACCACBA\r\n" + "5\r\n" + "BCCCACCB\r\n" + "CABCACAB\r\n"
//			+ "BAACCCAC\r\n" + "BBABBABC\r\n" + "CCABABCA\r\n" + "CABABACC\r\n" + "CBACACAB\r\n" + "CBCCCBAB\r\n" + "";
	static int flag, rsum, csum;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		br = new BufferedReader(new StringReader(str));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		for (int tc = 1; tc <= 10; tc++) {// 10개의 테케가 주어짐
			sb.append("#").append(tc).append(" ");
			int N = Integer.parseInt(br.readLine()); // 회문의 길이

			// map에 일단 숫자 넣기
			char[][] map = new char[8][8];
			for (int i = 0; i < 8; i++) {
				String str = br.readLine();
				for (int j = 0; j < 8; j++) {
					map[i][j] = str.charAt(j);
				}
			}

			// 가로
			rsum = 0;
			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 8 - N + 1; j++) {
					flag = 0;
					for (int k = 0; k < N / 2; k++) {
//						System.out.println(map[i][j + k] + ":" + map[i][j + N - 1 - k]);
						if (map[i][j + k] != map[i][j + N - 1 - k]) {
							flag = 1;
							break;
						}
//						System.out.println("flag:"+flag);//break는 반복문 자체를 나가버린다
					}
					if (flag == 0)
						rsum++;
				}
//				System.out.println(i+1+"rsum:"+rsum);
			}

			// 세로
			csum = 0;
			for (int i = 0; i < 8; i++) {
				for (int j = 0; j < 8 - N + 1; j++) {
					flag = 0;
					for (int k = 0; k < N / 2; k++) {
						if (map[j + k][i] != map[j + N - 1 - k][i]) {
							flag = 1;
							break;
						}
					}
					if (flag == 0)
						csum++;
				}
			}
			sb.append(rsum + csum).append("\n");
		}
		System.out.println(sb);
	}
}
