package backjoon;

import java.util.ArrayList;

public class boj_S5_4673_셀프넘버 {

	public static void main(String[] args) {
		ArrayList<Integer> total_number = new ArrayList<Integer>(); // 1~10000까지의 수
		ArrayList<Integer> self_number = new ArrayList<Integer>(); // 생성자가 있는 수

		// 배열 리스트에 수 집어넣기
		for (int i = 0; i < 10000; i++) {
			total_number.add(i + 1);
			self_number.add((i + 1));
		}

		// 두 배열리스트를 비교.
		for (int i = 0; i < self_number.size(); i++) {
			for (int j = 0; j < total_number.size(); j++) {
				// 중복된 값이 있다면 전체 수가 있는 배열리스트에서 중복된 값을 제거한다.
				if (total_number.get(j) == self_cal(self_number.get(i))) {
					total_number.remove(j);
				}
			}
		}

		// 전체 수가 있는 배열리스트 출력.
		for (int i = 0; i < total_number.size(); i++) {
			System.out.println(total_number.get(i));
		}
	}

	// 생성자를 구하는 method.
	private static int self_cal(int num) {
		int result = 0;
		// 일의 자리
		if (num > 0 && num < 10) {
			result = num + num;
		}
		// 십의 자리
		else if (num >= 10 && num < 100) {
			result = num + (num / 10) + (num % 10);
		}
		// 백의 자리
		else if (num >= 100 && num < 1000) {
			result = num + (num / 100) + ((num % 100) / 10) + ((num % 100) % 10);
		}
		// 천의 자리
		else if (num >= 1000 && num < 10000) {
			result = num + (num / 1000) + ((num % 1000) / 100) + (((num % 1000) % 100) / 10)
					+ (((num % 1000) % 100) % 10);
		} else {
			result = num;
		}

		return result;
	}

}
