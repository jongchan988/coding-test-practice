package 자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class P11268_절댓값힙 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> MyQueue = new PriorityQueue<>((o1, o2) -> {
            int first_abs = Math.abs(o1);
            int second_abs = Math.abs(o2);
            if (first_abs == second_abs){
                return o1 > o2 ? 1 : -1;
                // 절대값이 같은 경우 2번째 인자값이 음수이면 양수 반환
            } else {
                return first_abs - second_abs;
                // 2번째 인자값의 절대값이 작으면 양수 반환
            }
            // 결론 o1, o2 두가지값이 들어왔을때
            // 양수를 리턴해주는 경우 o2가 우선순위(poll)로 정렬됨
        });

        for (int i = 0; i < N; i++){
            int request = Integer.parseInt(br.readLine());
            if(request == 0){
                if (MyQueue.isEmpty()){
                    System.out.println("0");
                } else {
                    System.out.println(MyQueue.poll());
                }
            } else {
                MyQueue.add(request);
            }
        }
    }
}
