import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Solution_D3_4406_모음이보이지않는사람 {
	static String str = "3\r\n" + "congratulation\r\n" + "synthetic\r\n" + "fluid";

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		br = new BufferedReader(new StringReader(str));
		StringTokenizer st;
		ArrayList<String> al = new ArrayList<>();

		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			sb.append("#").append(tc).append(" ");
			String str = br.readLine();

			for (int i = 0; i < str.length(); i++) {
				char c = str.charAt(i);
				if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
					sb.append(c);
				}
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}
