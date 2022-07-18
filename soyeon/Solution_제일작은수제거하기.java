package programmers;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

class Solution_제일작은수제거하기 {
	/*
	 * list는 length이 아니라 size()
	 * import하는거
	 * 반환값이 배열이라면 어떤 배열이 나와도 ok
	 */
	public int[] solution(int[] arr) {
		if (arr.length == 1) {
			arr[0] = -1;
			return arr;
		}

		int[] copyArr = arr.clone();
		Arrays.sort(copyArr);

		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 1; i < copyArr.length; i++) {
			list.add(copyArr[i]);
		}
		Collections.sort(list, Collections.reverseOrder());

		int[] answer = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
		return answer;
	}
}
