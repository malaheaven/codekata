package 단계1;

public class 짝수의합 {

    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                answer += i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        짝수의합 solution = new 짝수의합();
        System.out.println(solution.solution(10));
    }
}
