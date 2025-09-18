package 단계1;

public class x만큼간격이있는n개의숫자 {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long value = 0;

        for (int i = 0; i < n; i++) {
            answer[i] = value + x;
            value += x;
        }

        return answer;
    }

    public static void main(String[] args) {
        x만큼간격이있는n개의숫자 solution = new x만큼간격이있는n개의숫자();
        System.out.println(solution.solution(2, 5));
    }
}
