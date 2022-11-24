public class 항해알고리즘테스트_1번 {

    public static String solution(int[] arr1) {
        String answer = "";
        String[] arr = {"모", "도", "개", "걸", "윷"};

        int stomachCount = 0;
        for (int a : arr1) {
            if (a == 0) {
                stomachCount += 1;
            }
        }

        answer = arr[stomachCount];
        return answer;
    }

    public static void main(String[] args) {
//        int[] test1 = {0,1,0,1};
//        System.out.println(solution(test1)); // 개
//
//        int[] test2 = {1,1,1,0};
//        System.out.println(solution(test2)); // 도
//
//        int[] test3 = {0,0,1,1};
//        System.out.println(solution(test3)); // 개
//
//        int[] test4 = {1,1,1,1};
//        System.out.println(solution(test4)); // 모

        int[] arr1 = {0, 1, 0, 0};
        System.out.println(solution(arr1)); // 걸
    }
}
