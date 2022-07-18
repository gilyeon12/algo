import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String str = String.valueOf(n); // 정수형 -> String형
        for(int i = 0; i<str.length(); i++){
            answer += str.charAt(i) - '0';  // String형 -> 정수형
        }

        return answer;
    }
}
