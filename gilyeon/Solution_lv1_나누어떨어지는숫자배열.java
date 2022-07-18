import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> temparr = new ArrayList<>(); // 배열 리스트 생성
        
        for(int i = 0; i < arr.length; i++){ // 나누어 떨어지는 숫자 삽입.
            if(arr[i] % divisor == 0){
                temparr.add(arr[i]);
            }
        }
        
        if(temparr.size() == 0){ // 나누어 떨어지는 숫자가 없으면, 배열에 -1 삽입.
            int [] answer = new int[1];
            answer[0] = -1;
            return answer;
        }
        
        else{
            int [] answer = new int[temparr.size()]; // 배열리스트 -> 배열로 변환.
            for(int i = 0; i < temparr.size(); i++){
                answer[i] = temparr.get(i);
            }
            Arrays.sort(answer); // 오름차순 정렬
            return answer;
        }
    }
}
