import java.util.Scanner;

public class Baekjoon_5585 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Scanner 객체 선언
        int pay = scan.nextInt(); // 물건 가격
        int[] coin = {500,100,50,10,5,1}; // 거스름돈 배열
        int payback = 1000 - pay; // 거스름 돈 계산
        int answer = 0; // 거스름 돈 갯수

        for(int i = 0; i < coin.length; i++){ // 거스름돈 종류 만큼 반복
            if(payback >= coin[i]){ // 거스름돈 값이 돈 단위보다 큰 경우
                while (true){ // 무한 반복
                    payback -= coin[i]; // 거스름 돈에서 돈 단위 빼기
                    answer++; // 뺀 횟수 만큼 1씩 더하기
                    if(payback < coin[i]){ // 거스름 돈이 돈 단위보다 작은 경우
                        break; // 루프 탈출
                    }
                }
            }
        }
        System.out.println(answer); // 결과 출력
    }
}