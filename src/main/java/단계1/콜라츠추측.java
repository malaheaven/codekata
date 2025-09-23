package 단계1;

public class 콜라츠추측 {

    public static int solution(long num) {
        int answer = 0;

        while (true) {
            if (num == 1) break;

            if (answer > 500) {
                answer = -1;
                break;
            }
            if (num % 2 == 0) {
                num = num / 2;
                answer += 1;
            } else {
                num = (num * 3) + 1;
                answer += 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        콜라츠추측 solution = new 콜라츠추측();
        System.out.println(solution.solution(4));
    }
}
