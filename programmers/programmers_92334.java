import java.util.*; // HashMap을 사용하기 위해 util import

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        // answer 정수형 배열을 id_list배열 길이 만큼 초기화
        Map<String, HashSet<String>> member = new HashMap<>();
        // member 이름의 HashMap을 만드는데 String, String형의 HashMap이 저장되도록 초기화
        Map<String, Integer> callmember = new HashMap<>();
        // callmember 이름의 HashMap을 만드는데 String, Integer형이 저장되도록 초기화

        for (int i = 0; i < id_list.length; i++) {
            // id_list의 길이만큼 반복 시킨다.
            String name = id_list[i]; // name에 id_list인자값을 저장한다.
            member.put(name, new HashSet<>()); // member Hashmap에 name, HashSet으로 초기화
            callmember.put(name, i); // callmember Hashmap에 name, i값으로 초기화
            // member의 HashMap중에 String은 신고 받은자로 저장하고 HashMap<String>에 신고자를 저장
        }

        for (int i = 0; i < report.length; i++) { // report배열의 갈이 만큼 반복
            String[] str = report[i].split(" "); // 신고자와 신고 받는 자로 문자열 나누기
            String from = str[0]; // 앞의 문자열 저장
            String to = str[1]; // 뒤쪽의 문자열 저장
            member.get(to).add(from); // 신고 받은 자의 size를 1 증가
        }

        for (int i = 0; i < id_list.length; i++) { // id_list배열의 길이 만큼 반복
            HashSet<String> send = member.get(id_list[i]);
            // member의 인자 size값을 send에 저장
            if (send.size() >= k) { // send의 사이즈가 k 보다 큰 경우
                for (String name : send) { // send에는 값 뿐만아니라 신고자의 정보도 포함되어있다.
                    answer[callmember.get(name)]++;
                    // callmember에 저장되어있는 name의 위치와 똑같이 answer배열의 인자값이 증가
                    // 만약 muzi의 위치가 0 이면 answer배열의 0번쨰 위치의 값이 1 증가한다.
                }
            }
        }
        return answer; // answer 배열 리턴
    }
}
public class test {
    public static void main(String[] args) {
        Solution sol = new Solution(); // sol이름의 객체 생성
        String[] str1 = {"muzi", "frodo", "apeach", "neo"}; 
        // srt1 배열에 ["muzi", "frodo", "apeach", "neo"] 저장
        String[] str2 = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
        // srt2 배열에 ["muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"] 저장
        sol.solution(str1,str2,2);
        // str1, str2, 계정정지 제한 수
    }
}
