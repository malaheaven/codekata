package 단계1;

public class 정수제곱근판별 {

    public long solution(long n) {
        double value = Math.sqrt(n);

        if (value % 1 == 0) {
            return (long) Math.pow(value + 1, 2);
        }

        return -1;
    }

    public static void main(String[] args) {
        정수제곱근판별 solution = new 정수제곱근판별();
        System.out.println(solution.solution(121));
    }
}
