class Solution {
    public String solution(String s) {
        String answer = "";
        if(s.length() % 2 != 0){ // 단어의 길이가 홀수일 경우, 
            answer = String.valueOf(s.charAt(s.length() / 2)); // char형 -> String형
        }
        else { // 짝수일 경우,
            int temp = s.length() / 2;
            answer = String.valueOf(s.charAt(s.length() / 2 - 1));
            answer += String.valueOf(s.charAt(s.length() / 2));
        }
        return answer;
    }
}
