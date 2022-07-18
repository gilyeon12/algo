class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        int idx = 0;
        System.out.print(seoul.length);
        for(int i=0; i<seoul.length; i++){
            if(seoul[i].equals("Kim")) // 문자열 비교는 ==대신 왠만하면 equals를 쓰는게 좋음!
                idx = i;
        }
        answer = "김서방은 " + idx + "에 있다";
        return answer;
    }
}
