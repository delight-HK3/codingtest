class Solution {
    public int solution(int n) { // 매개변수 n
        int answer = 0; // 리턴할 변수 answer
        for(int x = 1; x < n; x++){ // x를 n보다 1낮은 만큼 반복
            if(n % x == 1){ // 만약 n을 x로 나누었을 때 나머지가 1이 나오는 경우
                answer = x; // x의 값을 answer에 저장
                System.out.printf("%d를 나누어서 나머지가 1이 나오는 값 : %d",n,x);
                // x와 n의 값을 출력
                break; // 루프 탈출
            }
        } // for end
        return answer; // answer값을 리턴
    }
}
public class programmers_87389 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        // sol이름의 참조 변수 선언과 동시에 인스턴스를 저장
        sol.solution(10);
        // Solution 클래스의 멤버 메서드 solution에 매개변수 10입력
    }
}
