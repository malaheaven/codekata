package 단계1;

public class 자릿수더하기 {

    public int solution(int n) {
        if (n < 10) {
            return n;
        }

        return (n % 10) + solution(n / 10);
    }
    public static void main(String[] args) {
        자릿수더하기 solution = new 자릿수더하기();
        System.out.println(solution.solution(123));
    }
}
