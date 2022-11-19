import java.util.*;

public class Day1 {

    public static int[] solution(int[] numbers) {
        // 내 풀이
        int[] doubleNumbers = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {

            doubleNumbers[i] = (numbers[i] * 2);
        }
        return doubleNumbers;

        // 다른 사람 풀이1
        // 새로운 배열 객체를 생성하지 않고 numbers에 값을 넣다보니 속도도 가장 빨랐고 메모리도 적게 잡아먹었다.
//        for (int j=0; j < numbers.length; j++) {numbers[j] *= 2;}
//        return numbers;


        // 다른 사람 풀이2
        // 향상된 for 사용
        // 직관적이나 속도는 위의 예제들 보다는 느렸다.
//        ArrayList<Integer> answer = new ArrayList<>();
//
//        for(int num : numbers){
//            answer.add(num*2);
//        }
//        return answer;


        // 다른 사람 풀이3
        // 가장 간단한 한줄 풀이였다. 그러나 속도는 느린편이었다.
//        return Arrays.stream(numbers).map(i -> i * 2).toArray();
    }


    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        int[] result = solution(numbers);
        System.out.println(Arrays.toString(result));
    }

}


