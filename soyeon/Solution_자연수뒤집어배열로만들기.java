package programmers;

public class Solution_자연수뒤집어배열로만들기 {
	public int[] solution(long n) {
		String str = n + "";

		int[] arr = new int[str.length()];
		for (int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(str.length() - i - 1) - '0';
		}
		return arr;
	}
}
