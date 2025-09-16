package 단계1;

public class 나이출력 {

    public int solution(int age) {
        return 2022 - age + 1;
    }

    public static void main(String[] args) {
        나이출력 solution = new 나이출력();
        System.out.println(solution.solution(40));
    }
}
