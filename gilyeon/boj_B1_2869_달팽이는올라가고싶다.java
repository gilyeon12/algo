package backjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_B1_2869_달팽이는올라가고싶다 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());

		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());
		int r = 0;
//		int count = 0;
//		1. 반복문을 이용한 풀이 ----> 시간초과!
//		while(true) {
//			if(r >= v) {
//				count++;
//				break;
//			}
//			r += a;
//			if(r < v) {
//				r -= b;
//				count ++;
//			}
//			
//		}
//		System.out.println(count);

//		2. 수식을 이용한 풀이
		int res = (v - b) / (a - b);
		if ((v - b) % (a - b) != 0) {
			res++;
		}
		System.out.println(res);
	}

}
