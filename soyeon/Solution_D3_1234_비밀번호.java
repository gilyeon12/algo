package practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Solution_D3_1234_비밀번호 {
	/*
	 *  처음에 스택이 비워있을 때는 다음 조건문으로 갈 수 없게 continue!!!
	 *  스택이면 거꾸로 다시 push해야함
	 */
	static String str = "10 1238099084\r\n" + "16 4100112380990844\r\n" + "26 12380990844100112380990844\r\n"
			+ "42 123809908444100112380990844100112380990844\r\n"
			+ "55 1238099084441001123809908441001321238099084432180990844\r\n"
			+ "60 123809908444100145351123809908441001321238099084432180990844\r\n"
			+ "71 12380990844410013218099084441001123809908441001321238099084432180990844\r\n"
			+ "99 123809908444100180990844410013211238099084410013212380990844123809908441238099084410013232180990844\r\n"
			+ "82 1238099084441001410011238099084412380990844100132123809908441238099084432180990844\r\n"
			+ "58 0899809812380990844100132123809908441238099084432180990844";

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br = new BufferedReader(new StringReader(str));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		for (int tc = 1; tc <= 10; tc++) {
			sb.append("#").append(tc).append(" ");

			Stack<Integer> stack = new Stack<>();

			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());// 문자열의 길이
			String str = st.nextToken();// 비밀번호

			for (int i = 0; i < N; i++) {
				if (stack.isEmpty()) {
					stack.push(str.charAt(i) - '0');
					continue;// 처음에 비워있을때만 실행하는거라 continue로 반복문으로 돌아가기
				}
				if (stack.peek() == str.charAt(i) - '0') {
					stack.pop();
				} else {
					stack.push(str.charAt(i) - '0');
				}
			}
			Stack<Integer> result = new Stack<>();
			while (!stack.isEmpty()) {
				int n = stack.pop();
				result.push(n);
			}

			while (!result.isEmpty()) {
				int n2 = result.pop();
				sb.append(n2);
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}
