package 단계1;

import java.util.Arrays;

public class 자연수뒤집어배열로만들기 {
    public int[] solution(long n) {
        int length = String.valueOf(n).length();

        int[] answer = new int[length];

        int value = Integer.parseInt(String.valueOf(n));

        for (int i = 0; i < length; i++) {
            answer[i] = value % 10;
            value /= 10;
        }

        return answer;
    }

    public static void main(String[] args) {
        자연수뒤집어배열로만들기 solution = new 자연수뒤집어배열로만들기();
        System.out.println(Arrays.toString(solution.solution(12345)));
    }
}
