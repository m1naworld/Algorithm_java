import java.util.*;

public class MathScore {
    public static int[] solution(int[] answers) {

        int[] list1 = {1, 2, 3, 4, 5};
        int[] list2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] list3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int score1 = 0;
        int score2 = 0;
        int score3 = 0;

        for (int i = 0; i < answers.length; i++) {

            if (answers[i] == list1[i % 5]) {
                score1 += 1;
            }
            if (answers[i] == list2[i % 8]) {
                score2 += 1;
            }
            if (answers[i] == list3[i % 10]) {
                score3 += 1;
            }

        }


        int[] arr = {score1, score2, score3};

        int maxNum = Math.max(Math.max(score1, score2), score3);

        int[] newArr = new int[3];

        int newArrIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == maxNum) {
                newArr[newArrIndex] = i + 1;
                newArrIndex += 1;
            }
        }

        int[] answer = Arrays.copyOf(newArr, newArrIndex);

        return answer;

    }

    public static void main(String[] args) {
        int[] a = {1, 3, 2, 4, 2};
        solution(a);

    }
}
