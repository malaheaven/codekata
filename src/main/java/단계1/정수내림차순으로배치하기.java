package 단계1;

import java.util.Arrays;

public class 정수내림차순으로배치하기 {

    public static long solution(long n) {
        char[] chr = String.valueOf(n).toCharArray();
        Arrays.sort(chr);

        StringBuilder sb = new StringBuilder(String.valueOf(chr));

        return Long.parseLong(sb.reverse().toString());
    }

    public static void main(String[] args) {
        정수내림차순으로배치하기 solution = new 정수내림차순으로배치하기();
        System.out.println(solution.solution(118372));
    }
}
