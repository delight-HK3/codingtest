class Solution { // 1번 방법
    public int solution(int n) {
        int answer = 0; // 기본으로 제공되는 변수
        String str = Integer.toString(n,3);
        // 3진수 로 변형
        System.out.printf("3진수 = %s%n",str);
        // 3진수로 변형된 값을 출력

        StringBuffer test = new StringBuffer(str);
        // 변경 가능한 문자열로 만들기
        String reverse = test.reverse().toString();
        // test를 뒤집은 후 String 형으로 형변환 후 문자열 reverse에 저장

        answer = Integer.parseInt(reverse,3);
        // 문자열 reverse를 10진수 정수형으로 변환 후 answer에 저장

        System.out.printf("10진수 = %d%n",answer);
        // 10진수로 변형된 값을 출력

        return answer; // answer 리턴
    }
}
public class programmers_68935_1 {
    public static void main(String[] args) {
        Solution sol = new Solution(); 
        // sol이름의 참조 변수 선언과 동시에 인스턴스를 저장
        sol.solution(125); 
        // Solution 클래스의 멤버 메서드 solution에 매개변수 125입력
    }
}