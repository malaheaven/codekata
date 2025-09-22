package 단계1;

import java.util.stream.LongStream;

public class 두정수사이의합 {

    public long solution(int a, int b) {
        return LongStream.range(Math.min(a, b), Math.max(a, b) + 1).sum();
    }

    public static void main(String[] args) {
        두정수사이의합 solution = new 두정수사이의합();
        System.out.println(solution.solution(3, 5));
    }
}
