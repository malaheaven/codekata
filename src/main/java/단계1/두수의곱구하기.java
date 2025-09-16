package 단계1;

public class 두수의곱구하기 {

    public int solution(int num1, int num2) {
        int answer = num1 * num2;
        return answer;
    }

    public static void main(String[] args) {
        두수의곱구하기 solution = new 두수의곱구하기();
        System.out.println(solution.solution(3, 4));
    }
}
