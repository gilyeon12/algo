package com.ssafy.study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class SWEA_D3_1225_암호생성기 {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		in = new BufferedReader(new StringReader(str));
		StringBuilder sb = new StringBuilder();
		Queue<Integer> queue = new LinkedList<Integer>(); // 암호문 큐.
		int minus = 1; // 암호문에서 뺄 수.
		for (int tc = 1; tc <= 10; tc++) {
			sb.append("#").append(tc).append(" ");
			in.readLine();
			StringTokenizer st = new StringTokenizer(in.readLine());

			// 암호문 큐 입력.
			for (int i = 0; i < 8; i++) {
				queue.offer(Integer.parseInt(st.nextToken()));
			}

			while (true) {
				// 종료 조건.(숫자가 0보다 작거나 같을 경우)
				if ((queue.peek() - minus) <= 0) { // 이때, queue.poll()아닌 queue.peek()로 해야함! 안그럼 nullpointException!!!!!!!
					queue.offer(0); // 0 삽입.
					queue.poll(); // 맨 처음 값 빼주기.
					minus = 1;
					break;
				}
				queue.offer(queue.poll() - minus); // minus만큼 감소 후, 뒤로 이동.
				minus++;
				
				if (minus == 6) // 1사이클 종료해서 minus 초기화
					minus = 1;
			}
			
			// 암호문 큐 출력.
			for (int i = 0; i < 8; i++) {
				sb.append(queue.poll()).append(" ");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}

	static String str = "1\r\n" + "9550 9556 9550 9553 9558 9551 9551 9551 \r\n" + "2\r\n"
			+ "2419 2418 2423 2415 2422 2419 2420 2415 \r\n" + "3\r\n" + "7834 7840 7840 7835 7841 7835 7835 7838 \r\n"
			+ "4\r\n" + "4088 4087 4090 4089 4093 4085 4090 4084 \r\n" + "5\r\n"
			+ "2945 2946 2950 2948 2942 2943 2948 2947 \r\n" + "6\r\n" + "670 667 669 671 670 670 668 671 \r\n"
			+ "7\r\n" + "8869 8869 8873 8875 8870 8872 8871 8873 \r\n" + "8\r\n"
			+ "1709 1707 1712 1712 1714 1710 1706 1712 \r\n" + "9\r\n"
			+ "10239 10248 10242 10240 10242 10242 10245 10235 \r\n" + "10\r\n"
			+ "6580 6579 6574 6580 6583 6580 6577 6581 \r\n" + "";
}
