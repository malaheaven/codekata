package 단계1;

public class 숫자비교하기 {

    public int solution(int num1, int num2) {
        return (num1 == num2) ? 1 : -1;
    }

    public static void main(String[] args) {
        숫자비교하기 solution = new 숫자비교하기();
        System.out.println(solution.solution(2, 3));
    }
}
