import java.util.ArrayList;

public class Lv1_크레인_인형뽑기_게임 {

    public static int solution(int[][] board, int[] moves) {

        // n * n 배열
        int boardLength = board.length;

        // 뽑아 인형 담는 바구니
        ArrayList<Integer> answer = new ArrayList<>();

        // 왼쪽 바구니의 위치별 인형이 있는 칸을 저정하는 배열
        int[] counts = new int[boardLength + 1];

        // 주어진 배열 for 문
        for (int i = 0; i < moves.length; i++) {

            // 왼쪽 바구니 위치
            int target = moves[i];

            // 왼쪽 바구니 인형이 있는 경우부터
            for (int j = counts[target]; j < board.length; j++) {

                // 꺼내는 위치에 인형이 없는 경우
                if (board[j][target - 1] == 0) {
                    counts[target] += 1; // 인형있는 위치 찾기
                    continue;
                }

                // 오른쪽 바구니에 저장
                answer.add(board[j][target - 1]);
                counts[target] += 1;
                break;

            }
        }

        // 뽑은 인형들 중 중복된 경우 제거
        int result = 0;
        for (int i = 0; i < answer.size() - 1; ) {
            if (answer.get(i).equals(answer.get(i + 1))) {
                result += 2;
                answer.remove(i + 1);
                answer.remove(i);
                if (i != 0) {
                    i -= 1;
                }
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


//        int[][] board1 = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
//        int[] moves1 = {1, 2, 3, 4};
//        solution(board1, moves1);
//
        int[][] board2 = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {1, 1, 2, 2, 3}};
        int[] moves2 = {1, 2, 3};
        solution(board2, moves2);

    }
}
