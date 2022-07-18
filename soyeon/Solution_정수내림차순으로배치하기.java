package programmers;

import java.util.Arrays;

public class Solution_정수내림차순으로배치하기 {
	/*
	 * 배열을 솔팅하고 거꾸로 배치하는 방법(String으로)
	 * Long.parseLong()
	 */
	public long solution(long n) {
		String str = n + "";

		int[] arr = new int[str.length()];
		for (int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i) - '0';
		}
		Arrays.sort(arr);

		String result = "";
		for (int i = 0; i < str.length(); i++) {
			result += arr[str.length() - i - 1];
		}
		return Long.parseLong(result);
	}
}
