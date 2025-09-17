package 단계1;

public class 두수의나눗셈 {

    public int solution(int num1, int num2) {

        double value = (double) num1 / num2;
        return (int) (value * 1000) ;
    }

    public static void main(String[] args) {
        두수의나눗셈 solution = new 두수의나눗셈();
        System.out.println(solution.solution(3, 2));
    }
}
