package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.StringTokenizer;

public class Solution_D3_7272_안경이없어_풀이2 {
	static String str = "6\r\n" + "ABCD EFGH\r\n" + "ABCD PBZO\r\n" + "PRQO OQAD\r\n" + "ZXCV HJKL\r\n" + "BBBB BBB\r\n"
			+ "SFJLWQJF EEEEEDEE";
	static String str1, str2;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br = new BufferedReader(new StringReader(str));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			sb.append("#").append(tc).append(" ");

			st = new StringTokenizer(br.readLine());
			String str1 = st.nextToken();
			String str2 = st.nextToken();

			String trStr1 = trStr(str1);
			String trStr2 = trStr(str2);

			if (trStr1.equals(trStr2)) {
				sb.append("SAME").append("\n");
			} else {
				sb.append("DIFF").append("\n");
			}
		}
		System.out.println(sb);
	}

	public static String trStr(String text) {
		text = text.replaceAll("C|E|F|G|H|I|J|K|L|M|N|S|T|U|V|W|X|Y|Z", "0");
		text = text.replaceAll("A|D|O|P|Q|R", "1");
		text = text.replace('B', 'B');
		return text;
	}
}
