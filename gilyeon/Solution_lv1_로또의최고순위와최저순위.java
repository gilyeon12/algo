class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {0,0};
        int zero_count = 0;
        int win_count = 0;

        for(int i=0; i<6; i++){ // 0인 개수 세기
            if(lottos[i] == 0){
                zero_count++;
            }
        }

        for(int i=0; i<6; i++){ // 맞는 로또 번호 세기
            for(int j=0; j<6; j++){
                if(lottos[i] == win_nums[j]){
                    win_count++;
                    break;
                }
            }
        }
        int max_score = win_count + zero_count; // (0인거 무조건 포함)
        int min_score = win_count;

        // 등수 계산
        switch(max_score){
        case 6:
                answer[0] = 1;
                break;
        case 5:
                answer[0] = 2;
                break;
        case 4:
                answer[0] = 3;
                break;
        case 3:
                answer[0] = 4;
                break;
        case 2:
                answer[0] = 5;
                break;
        default:
                answer[0] = 6;
                break;
        }

        switch(min_score){
            case 6:
                answer[1] = 1;
                break;
        case 5:
                answer[1] = 2;
                break;
        case 4:
                answer[1] = 3;
                break;
        case 3:
                answer[1] = 4;
                break;
        case 2:
                answer[1] = 5;
                break;
        default:
                answer[1] = 6;
                break;
        }
        return answer;
    }
}
