import java.util.Arrays;
import java.util.ArrayList;
class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>(); // 배열리스트 생성.
        
        if(arr.length == 1){ // 원소가 하나밖에 없을 때,
            int []temp = new int[1]; // 임시 배열 생성.
            temp[0] = -1;
            return temp;
        }
        
        // 입력 받은 배열 arraylist에 삽입.
        for(int i=0; i<arr.length; i++){
            answer.add(arr[i]);
        }
        
        int min = arr[0]; // 최소값 변수
        for(int i=0; i<answer.size(); i++){ // 최소값 찾기
            if(min > answer.get(i)){
                min = answer.get(i);
            }
        }
        
        for(int i=0; i<answer.size(); i++){ // 최소값 제거
            if(min == answer.get(i))
                answer.remove(answer.get(i));
        }
        
        int[] answer1 = new int[answer.size()];
        for(int i = 0; i < answer1.length; i++){ // 배열로 바꾸기
            answer1[i] = answer.get(i);
        }
        
        return answer1;
    }
}
