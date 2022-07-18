import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.StringTokenizer;

/*
 * 자바의 거듭제곱 함수는 Math.pow()인데, 출력값이 double형이라서 int로 바꿔줘야한다.
 */
public class Solution_D3_1217_거듭제곱 {
	static String str = "1\r\n" + "9 8\r\n" + "2\r\n" + "2 8\r\n" + "3\r\n" + "6 5\r\n" + "4\r\n" + "10 7\r\n" + "5\r\n"
			+ "6 7\r\n" + "6\r\n" + "7 2\r\n" + "7\r\n" + "9 8\r\n" + "8\r\n" + "3 2\r\n" + "9\r\n" + "4 8\r\n"
			+ "10\r\n" + "8 6\r\n" + "";

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		br = new BufferedReader(new StringReader(str));
		StringTokenizer st;

		for (int i = 0; i < 10; i++) {
			int tc = Integer.parseInt(br.readLine());
			sb.append("#").append(tc).append(" ");
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken()); // 정수
			int M = Integer.parseInt(st.nextToken()); // 거듭제곱

			sb.append((int) Math.pow(N, M)).append("\n");
		}
		System.out.println(sb);
	}
}
