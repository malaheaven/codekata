package 단계1;

public class 배열의평균값 {

    public double solution(int[] numbers) {
        double answer = 0;

        for (int i = 0; i < numbers.length; i++) {
            answer += numbers[i];
        }
        return answer / numbers.length;
    }

    public static void main(String[] args) {
        배열의평균값 solution = new 배열의평균값();
        System.out.println(solution.solution(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
    }
}
