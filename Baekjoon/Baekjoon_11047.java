import java.util.Scanner;

public class Baekjoon_11047 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Scanner 객체 선언

        int coin_num = scan.nextInt();
        int money = scan.nextInt();
        int answer = 0; // 정리된 동전 갯수

        int[] coin = new int[coin_num]; // 동전 종류 갯수의 각각의 가격

        for(int i = 0; i < coin_num; i++){ // coin배열 만큼의 길이
            coin[i] = scan.nextInt(); // 가격 입력
        }

        int i = coin.length - 1;
        while (money > 0){ // 거스름돈 종류 만큼 반복
            if(money >= coin[i]){
                answer += (money / coin[i]);
                money = money % coin[i];
            }
            i--;
        }
        System.out.println(answer); // 결과 출력
    }
}
