import java.util.ArrayList;
import java.util.Arrays;

public class HarshadNumber {

    public static boolean solution(int x) {

        boolean answer = true;

        String strX = Integer.toString(x);
        String[] xList = strX.split("");

        int result = 0;

        for (String a : xList) {
            result += Integer.parseInt(a);
        }

        if (!((x % result) == 0)) {
            answer = false;
        }

        return answer;
    }


    public static void main(String[] args) {

//        boolean a = solution(2);
//        boolean b = solution(12);
        boolean c = solution(101);
//        boolean d = solution(18);

//        System.out.println(a);
//        System.out.println(b);
        System.out.println(c);
//        System.out.println(d);


    }
}
