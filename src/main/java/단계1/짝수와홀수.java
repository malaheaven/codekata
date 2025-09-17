package 단계1;

public class 짝수와홀수 {

    public static String solution(int num) {
        if (num % 2 == 0) return "Even";
        return "Odd";
    }

    public static void main(String[] args) {
        System.out.println(solution(4));
    }
}
