class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        if(a == b){ // a와 b가 같으면 둘 중 하나 return.
            answer = a;
            return answer;
        }
        else{
            int max = Math.max(a,b); // 둘 중 큰 수 구하기
            int min = Math.min(a,b);
            for(int i = min; i <= max; i++){ // 작은 수부터 큰 수의 합 구하기.
            answer += i;
        }
        }
        return answer;
    }
}
