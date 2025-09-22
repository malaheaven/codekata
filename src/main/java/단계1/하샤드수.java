package 단계1;

import java.util.Arrays;

public class 하샤드수 {
    public boolean solution(int x) {
        String[] intArray = String.valueOf(x).split("");

        return x % Arrays.stream(intArray).mapToInt(Integer::parseInt).sum() == 0;
    }

    public static void main(String[] args) {
        하샤드수 solution = new 하샤드수();
        System.out.println(solution.solution(10));
    }
}
