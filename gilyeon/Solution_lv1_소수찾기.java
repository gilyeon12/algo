class Solution {
    public int solution(int n) {
        int answer = 0;
        int flag = 0;
        for(int i = 2; i <= n; i++){ // 2부터 시작.
            flag = 0; // 소수가 아닌지 판별.
            for(int j = 2; j <= Math.sqrt(i); j++){ // 자기 자신까지 계산한다면 시간 초과, 제곱근까지만 계산.
                if(i % j == 0){ // 나누어지는 숫자가 하나라도 존재한다면,
                    flag = 1; // 소수가 아니다.
                    break;
                }
            }
            if(flag == 0)
                answer++;
        }
        return answer;
    }
}
