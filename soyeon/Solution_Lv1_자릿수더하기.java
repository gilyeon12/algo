package programmers;

public class Solution_Lv1_자릿수더하기 {
	public int solution(int n) {
		int answer = 0;

		String str = n + "";
		int[] arr = new int[str.length()];
		for (int i = 0; i < str.length(); i++) {
			arr[i] += str.charAt(i) - '0';
			answer += arr[i];
		}
		return answer;
	}
}