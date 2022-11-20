public class TrinaryDigit {

    public static int solution(int n) {

        String trinary = Integer.toString(n, 3);

        char[] arr = trinary.toCharArray();

        int i = arr.length -1;

        String result = "";
        for(; i >= 0; i--) {
            result += arr[i];
        }

        int numAnswer = Integer.parseInt(result, 3);


        return numAnswer;
    }


    public static void main(String[] args) {
        System.out.println(solution(45));
        System.out.println(solution(125));
    }
}
