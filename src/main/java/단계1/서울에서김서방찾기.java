package 단계1;

public class 서울에서김서방찾기 {

    public static String solution(String[] seoul) {

        int x = 0;
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                x = i;
                break;
            }
        }
        return "김서방은 " + x + "에 있다";
    }
}
