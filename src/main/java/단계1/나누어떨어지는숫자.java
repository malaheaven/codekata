package 단계1;

import java.util.*;

public class 나누어떨어지는숫자 {
    public List<Integer> solution(int[] arr, int divisor) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                list.add(arr[i]);
            }
        }

        if (list.isEmpty()) {
            list.add(-1);
            return list;
        }

        Collections.sort(list);

        return list;
    }

    public static void main(String[] args) {
        나누어떨어지는숫자 solution = new 나누어떨어지는숫자();
        System.out.println(solution.solution(new int[]{5, 9, 7, 10}, 5));
    }

}
