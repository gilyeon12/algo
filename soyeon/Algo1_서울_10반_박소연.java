import java.awt.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.StringTokenizer;

public class Algo1_서울_10반_박소연 {

	static String strss = "37 58";// 시험 출력을 위함
	static int N, M, cnt; // 정수 M, N, 자리를 바꾸기 위한변수(cnt)

	public static void main(String[] args) throws IOException {// 메인 메서드 시작
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));// buffered로 입력받음
		br = new BufferedReader(new StringReader(strss));// 예시입력
		StringTokenizer st;// StringTokenizer 쓰기 위해 객체 생성
		StringBuilder sb = new StringBuilder();// StringBuilder를 쓰기 위해 객체생성

		st = new StringTokenizer(br.readLine());// 한 줄 입력 받음
		M = Integer.parseInt(st.nextToken());// M값 입력
		N = Integer.parseInt(st.nextToken());// N값 입력

		ArrayList<String> arrayList = new ArrayList<>();// list를 저장하기 위해 arrayList생성

		for (int i = M; i <= N; i++) { // M부터 N까지
			String convStr = ""; // 문자열 초기화
			if (i >= 10) {// 만약 i가 10보다 크거나 같다면(2자리 수라면)
				convStr += nTs(i / 10);// 일단 십의자리를 가겨온다
				convStr += " "; // 공백으로 문자열을 나누기 위해 공백추가
			}

			convStr += nTs(i % 10);// 10으로 나눠서 일의자리를 가져온다
			arrayList.add(convStr);// 그 값을 list에 추가
		} // for문 닫기

		Collections.sort(arrayList);// 알파벳 순서로 읽기 위해 정렬

		cnt = 0;// 자리를 바꾸기 위한 변수를 초기화

		for (int i = 0; i < arrayList.size(); i++) {// 문자열로 넣어놓은 arrayList를 하나씩 반복
			String strAll = arrayList.get(i);// 리스트에 넣어놓은 문자열 전체를 가져옴
			String[] str = strAll.split(" ");// 두 문자열로 나누어진 문자열을 배열로 각각 저장

			int num = 0;// 문자열에서 숫자로 바꾸기 위한 변수

			if (str.length > 1) {// 배열의 길이가 1을 넘어간다면
				num += 10 * sTi(str[0]);// 숫자로 바꾼 수에 10을 곱해서 십의 자리로 만들기
				num += sTi(str[1]);// 일의 자리를 더한다
			} else {// 배열의 길이가 1을 넘어가지 않는다면
				num += sTi(str[0]);// 그 자리를 숫자로 변경하여 num에 저장
			} // else닫기

			sb.append(num).append(" ");// num을 하나씩 출력
			cnt++;// 출력을 위해 cnt증가

			// 못해서 새로 추가...
			if (cnt % 10 == 0) {
				sb.append("\n");
			}

		} // for문 닫기

		System.out.println(sb);// sb 전체 출력
	}

	private static String nTs(int i) {// 숫자에서 문자열로 바꾸기 위한 메서드
		switch (i) {// i값에 따라 switch
		case 0:// 숫자 0라면
			return "zero";// 문자열 "zero"로 바꾼다
		case 1:// 숫자 1라면
			return "one";// 문자열 "one"으로 바꾼다
		case 2:// 숫자 2라면
			return "two";// 문자열 "two"로 바꾼다
		case 3:// 숫자 3이면
			return "three";// 문자열 "three"로 바꾼다
		case 4:// 숫자 4라면
			return "four";// 문자열 "four"로 바꾼다
		case 5:// 숫자 5라면
			return "five";// 문자열 "five"로 바꾼다
		case 6:// 숫자 6이라면
			return "six";// 문자열 "six로 바꾼다
		case 7:// 숫자 7이라면
			return "seven";// 문자열 "seven"으로 바꾼다
		case 8:// 숫자 8이면
			return "eight";// 문자열 "eight"으로 바꾼다
		case 9:// 숫자 9라면
			return "nine";// 문자열 "nine"으로 바꾼다
		default:// default값
			return " ";// 공백만 출력
		}// swicth문 닫기
	}// 메서드 닫기

	private static int sTi(String str) {// 문자열에서 숫자로 바꾸기 위한 메서드
		switch (str) {// str에 따라 switch
		case "zero":// 문자열이 "zero"라면
			return 0;// 0을 리턴한다
		case "one":// 문자열이 "one"이라면
			return 1;// 1을 리턴한다
		case "two":// 문자열이 "two"라면
			return 2;// 2을 리턴한다
		case "three":// 문자열이 "three"라면
			return 3;// 3을 리턴한다
		case "four":// 문자열이 "four"라면
			return 4;// 4를 리턴한다
		case "five":// 문자열이 "five"라면
			return 5;// 5를 리턴한다
		case "six":// 문자열이 "six"라면
			return 6;// 6을 리턴한다
		case "seven":// 문자열이 "seven"이라면
			return 7;// 7을 리턴한다
		case "eight":// 문자열이 "eight"라면
			return 8;// 8을 리턴한다
		case "nine":// 문자열이 "nine"이라면
			return 9;// 9를 리턴한다
		default:// default값
			return -1;// -1을 리턴한다
		}// switch문 닫기
	}// 메서드 닫기
}// main메서드 닫기
