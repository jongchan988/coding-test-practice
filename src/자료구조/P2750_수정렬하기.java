package 자료구조;

import java.util.Scanner;

public class P2750_수정렬하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i = 0; i < N; i++){
            A[i] = sc.nextInt();
        }
        for(int i = 0; i < N -1; i++){
            // 0 1 2 3
            for(int j = 0 ; j < N - 1 - i; j++){
                // 0 1 2 3
                // 0 1 2
                // 0 1
                // 0
                if(A[j] > A[j +1]){
                    int temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                }
            }
        }

        for(int i = 0; i < N; i++){
            System.out.println(A[i]);
        }
    }
}
