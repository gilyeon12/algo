import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.StringTokenizer;

public class Solution_3431_준환이의운동관리 {
	static String str = "3\r\n" + "300 400 240\r\n" + "300 400 350\r\n" + "300 400 480";

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		br = new BufferedReader(new StringReader(str));
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			sb.append("#").append(tc).append(" ");
			st = new StringTokenizer(br.readLine());
			int L = Integer.parseInt(st.nextToken()); // 이상
			int U = Integer.parseInt(st.nextToken()); // 이하
			int X = Integer.parseInt(st.nextToken()); // 준환이의 운동량

			if (X >= U) {// X가 L과 U 사이라면
				sb.append("-1\n");
			} else if (X >= L && X <= U) {
				sb.append("0\n");
			} else {
				sb.append(L - X + "\n");
			}
		}
		System.out.println(sb);
	}
}
