package 단계1;

import java.util.Arrays;

public class 평균구하기 {

    public double solution(int[] arr) {
        double answer = Arrays.stream(arr).average().getAsDouble();
        return answer;
    }

    public static void main(String[] args) {
        평균구하기 solution = new 평균구하기();
        System.out.println(solution.solution(new int[]{1, 2, 3, 4}));
    }
}
