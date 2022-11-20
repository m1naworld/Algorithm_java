import java.util.Arrays;

public class StringDescendingOrder {


    public static String solution(String s) {

        char[] arr = s.toCharArray();

        Arrays.sort(arr);

        String result = "";

        int i = arr.length - 1;

        for (; i >= 0; i--) {
            result += arr[i];
        }

        return result;
    }

    public static void main(String[] args) {
        solution("Zbcdefg");

    }
}
