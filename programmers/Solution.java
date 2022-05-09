class Solution {
    public int solution(int n) { // 매개변수 n
        int answer = 0; // 리턴할 변수 answer
        for(int x = 1; x < n; x++){ // x를 n보다 1낮은 만큼 반복
            if(n % x == 1){ // 만약 n을 x로 나누었을 때 나머지가 1이 나오는 경우 
                answer = x; // x의 값을 answer에 저장
                break; // 루프 탈출
            }
        } // for end
        return answer; // answer값을 리턴
    }
}