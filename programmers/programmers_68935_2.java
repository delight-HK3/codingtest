class Solution { // 2번 방법
    public int solution(int n) {
        int answer = 0; // 기본으로 제공되는 변수
        String str = ""; // 빈 문자열 선언

        while(n > 0){ // n의 값이 0이상이면 반복
            str = str + (n % 3); // 문자열에 n에서 3을 나눈 나머지 값을 저장
            n = n / 3; // n을 3으로 나눈 후 다시 저장
        }

        answer = Integer.parseInt(str, 3);
        // 3진수 문자열을 10진수 정수형으로 변환하여 answer에 저장

        return answer; // answer 리턴
    }
}
public class programmers_68935_2 {
    public static void main(String[] args) {
        Solution sol = new Solution();
        // sol이름의 참조 변수 선언과 동시에 인스턴스를 저장
        sol.solution(125);
        // Solution 클래스의 멤버 메서드 solution에 매개변수 125입력
    }
}