import java.util.Arrays;

public class IntegerDescendingOrder {

    public static long solution(long n) {

        char[] arr = String.valueOf(n).toCharArray();
        Arrays.sort(arr);

        String result = "";

        int i = arr.length - 1;
        for (; i >= 0; i--) {
            result += arr[i];
        }

        long answer = Long.valueOf(result);

        return answer;
    }


    public static void main(String[] args) {
        System.out.println(solution(118372));
    }
}
