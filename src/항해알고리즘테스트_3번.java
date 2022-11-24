public class 항해알고리즘테스트_3번 {

    // arr1 배열에 직사각형 처럼 한층으로 0 미리 넣으면 편함
    public static void solution(int[][] arr1) {
        int[][] answer = new int[5][5];

        int length = answer.length;

        // 양쪽 탐색, 양쪽보다 큰경우 arr1과 크기가 같은 answer 배열에 1 집어 넣기
        for (int i = 0; i < length; i++) {
            if (arr1[i][0] > arr1[i][1]) {
                answer[i][0] = 1;
            }
            if (arr1[i][length - 1] > arr1[i][length - 2]) {
                answer[i][length - 1] = 1;
            }

            for (int j = 1; j <= length - 2; j++) {
                int target = arr1[i][j];
                if (arr1[i][j - 1] < target & arr1[i][j + 1] < target) {
                    answer[i][j] = 1;
                }

            }

        }

        // 위아래 탐색, 위아래 보다 작은 경우 answer 배열 중 1인 값 0으로 바꾸기
        for (int j = 0; j < length; j++) {
            if (arr1[0][j] <= arr1[1][j]) {
                answer[0][j] = 0;
            }
            if (arr1[length - 1][j] <= arr1[length - 2][j]) {
                answer[length - 1][j] = 0;
            }
            for (int i = 1; i <= length - 2; i++) {
                if (arr1[i - 1][j] >= arr1[i][j] | arr1[i + 1][j] >= arr1[i][j]) {
                    answer[i][j] = 0;
                }
            }
        }


        // answer 배열의 값이 1인경우 "*" 출력 아닌 경우 arr1 값 출력
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (answer[i][j] == 1) {
                    System.out.print("* \t");
                } else {
                    System.out.print(arr1[i][j] + "\t");
                }
            }
            System.out.println("");
        }

    }

    public static void main(String[] args) {
//        int[][] arr1 = {{7,4,6,5,9},
//                        {6,1,3,4,5},
//                        {4,8,5,6,9},
//                        {1,3,0,6,4},
//                        {6,4,8,1,7}};
//
//        solution(arr1);

        int[][] arr2 = {{3, 4, 1, 4, 9}, {2, 9, 4, 5, 8}, {9, 0, 8, 2, 1}, {7, 0, 2, 8, 4}, {2, 7, 2, 1, 4}};
        solution(arr2);

    }
}
