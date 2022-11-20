import java.util.*;

public class SumOfListTwoElements {

    public static int[] solution(int[] numbers) {

        Arrays.sort(numbers);

        int sumArrayIndex = 0;
        int[] sumArray = new int[numbers.length * numbers.length];

        int index = 0;
        int staticValue = numbers[index];
        int i = 1;


        // numbers 마지막 숫자 한개 전 까지
        while (index < numbers.length - 1) {

            if (!(i==numbers.length) && !(index > 0 && staticValue == numbers[index - 1])) {
                sumArray[sumArrayIndex] = staticValue + numbers[i];
                sumArrayIndex += 1;
                i += 1;
            }
            else{
                index += 1;
                staticValue = numbers[index];
                i = index + 1;
            }
        }

        int[] answer = Arrays.copyOf(sumArray, sumArrayIndex);
        Arrays.sort(answer);

        int [] distinct = Arrays.stream(answer).distinct().toArray();

        return distinct;
    }


    public static void main(String[] args) {
//        int[] result1 = solution(new int[]{2, 1, 3, 4, 1});
//        int[] result2 = solution(new int[]{5, 0, 2, 7});
        int[] result3 = solution(new int[]{0, 0, 5, 3, 1, 1, 5, 7});

        for (int i = 0; i < result3.length; i++) {
            System.out.println(result3[i]);
        }

    }
}
