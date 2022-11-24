import java.util.ArrayList;

public class Lv1_크레인_인형뽑기_게임 {

    public static int solution(int[][] board, int[] moves) {

        // board 배열 > n * n
        int boardLength = board.length;

        // 뽑아온 값 저장 리스트
        ArrayList<Integer> answer = new ArrayList<>();

        // 각 위치별 어디까지 뽑았는지 알아내는 인덱스 j 저장 배열
        int[] counts = new int[boardLength + 1];

        // 주어진 배열 for 문
        for (int i = 0; i < moves.length; i++) {

            // 타깃 위치
            int target = moves[i];


            for (int j = counts[target]; j < board.length; j++) {

                // 꺼내는 위치에 값이 없는 경우
                if (board[j][target - 1] == 0) {
                    counts[target] += 1;
                    continue;
                }
                answer.add(board[j][target - 1]);
                counts[target] += 1;
                break;

            }
        }

        int result = 0;
        for (int i = 0; i < answer.size() - 1; ) {
            if (answer.get(i).equals(answer.get(i + 1))) {
                result += 2;
                answer.remove(i + 1);
                answer.remove(i);
                i = 0;
            } else {
                i += 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
//        int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}};
//        int[] moves = {1, 5, 3, 5, 1, 2, 1, 4 , 5} ;
//        solution(board, moves);

        int[][] board1 = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
        int[] moves1 = {1, 2, 3, 4};

        solution(board1, moves1);

    }
}
