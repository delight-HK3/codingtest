import java.util.Scanner;
import java.util.Arrays;

public class Baekjoon_11339 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Scanner 객체 선언
        int member = scan.nextInt(); // 사용자 수 입력
        int[] time = new int[member]; // 사용시간 배열
        int up = 0,result = 0; // 누적변수,최종결과

        for(int i = 0; i < time.length; i++){ // time배열 크기만큼 반복
            time[i] = scan.nextInt(); 
            // time배열에 정수값 입력
        }

        Arrays.sort(time); // sort함수로 오름차순

        for(int j = 0; j < time.length; j++){ // time배열 크기만큼 반복
            up += time[j]; // up 변수에 time배열값 저장
            result += up; // up에 있는 값을 result 변수에 저장
        }
        System.out.println(result); // result값 출력
    }
}